package com.ss.avframework.codec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoEncoder;
import com.ss.avframework.opengl.GLSurface;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.opengl.YuvHelper;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThread;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;

public class HardwareVideoEncoder extends VideoEncoder {
    private int adjustedBitrate;
    private float bitateRatio = 1.0f;
    private MediaCodec codec;
    private String codecName;
    private String codecType;
    public byte[] configbyte;
    private boolean constTimePeriod;
    private EGLDisplay currDisplay;
    private EGLSurface currSurface;
    private GlRenderDrawer drawer;
    private GLSurface encoder_surface;
    private boolean fixBFrameDts;
    private long forcedKeyFrameNs;
    public int fps;
    private long frameInCount;
    private long frameOutCount;
    private int height;
    protected MediaCodecInfo info;
    public int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private boolean lossless;
    private DtsQueue mDtsQueue;
    private HardwareVideoEncodeRoi mRoi;
    private boolean mSwap;
    private ThreadUtils.ThreadChecker mThreadChecker;
    protected boolean noDropFrame;
    private SafeHandlerThread outputThread;
    private byte[] pps;
    private volatile boolean requestIDRFrame;
    private byte[] sps;
    private Integer surfaceColorFormat;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private byte[] vps_sps_pps;
    private int width;
    private Integer yuvColorFormat;
    private YuvFormat yuvFormat;

    static {
        Covode.recordClassIndex(99757);
    }

    public static int com_ss_avframework_codec_HardwareVideoEncoder_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_avframework_codec_HardwareVideoEncoder_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public boolean setupCodecName() {
        return false;
    }

    private boolean canUseSurface() {
        if (this.surfaceColorFormat != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class DtsQueueFixed extends DtsQueue {
        private long lastDtsOut;
        private long lastPtsIn;
        private final long minStartPts;
        private long ptsInDelta;
        private final LinkedList<Long> ptsInQueue;

        static {
            Covode.recordClassIndex(99760);
        }

        private void reset() {
            this.ptsInQueue.clear();
            this.lastPtsIn = 0;
            this.lastDtsOut = 0;
            this.ptsInDelta = 0;
        }

        private DtsQueueFixed() {
            super();
            this.ptsInQueue = new LinkedList<>();
            this.minStartPts = 200000000;
        }

        /* access modifiers changed from: package-private */
        @Override // com.ss.avframework.codec.HardwareVideoEncoder.DtsQueue
        public synchronized long getDtsOut(long j2) {
            long j3;
            MethodCollector.i(14384);
            super.getDtsOut(j2);
            if (!this.ptsInQueue.isEmpty()) {
                j3 = this.ptsInQueue.poll().longValue() - 200000000;
                long j4 = this.lastDtsOut;
                if ((j4 > j3 || j3 > j2) && j4 > j3) {
                    AVLog.logToIODevice2(6, "HardwareVideoEncoder", "last dts out: " + this.lastDtsOut + ", current dts out: " + j3, null, "DtsQueueFixed.getDtsOut2", 30000);
                    j3 = this.lastDtsOut + 1;
                }
                if (j3 > j2) {
                    AVLog.logToIODevice2(6, "HardwareVideoEncoder", "pts out: " + j2 + ", dts out: " + j3, null, "DtsQueueFixed.getDtsOut1", 30000);
                    this.lastDtsOut = j2;
                    MethodCollector.o(14384);
                }
            } else {
                long j5 = this.lastDtsOut;
                double d2 = (double) HardwareVideoEncoder.this.fps;
                Double.isNaN(d2);
                j3 = j5 + ((long) (1.0E9d / d2));
                if (j3 > j2) {
                    AVLog.logToIODevice2(6, "HardwareVideoEncoder", "pts out: " + j2 + ", dts out: " + j3, null, "DtsQueueFixed.getDtsOut1", 30000);
                    this.lastDtsOut = j2;
                    MethodCollector.o(14384);
                }
            }
            j2 = j3;
            this.lastDtsOut = j2;
            MethodCollector.o(14384);
            return j2;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
            if (r4 > (r2 + (r6 * 1.0E9d))) goto L_0x0068;
         */
        @Override // com.ss.avframework.codec.HardwareVideoEncoder.DtsQueue
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized long getPtsIn(long r10) {
            /*
            // Method dump skipped, instructions count: 151
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.codec.HardwareVideoEncoder.DtsQueueFixed.getPtsIn(long):long");
        }
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public void RequestIDRFrame() {
        AVLog.iow("HardwareVideoEncoder", "RequestIDRFrame");
        this.requestIDRFrame = true;
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configbyte;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    /* access modifiers changed from: package-private */
    public enum YuvFormat {
        I420 {
            /* access modifiers changed from: package-private */
            @Override // com.ss.avframework.codec.HardwareVideoEncoder.YuvFormat
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            /* access modifiers changed from: package-private */
            @Override // com.ss.avframework.codec.HardwareVideoEncoder.YuvFormat
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        /* access modifiers changed from: package-private */
        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        static {
            Covode.recordClassIndex(99761);
        }

        static YuvFormat valueOf(int i2) {
            if (i2 == 19) {
                return I420;
            }
            if (i2 == 21 || i2 == 2141391872 || i2 == 2141391876) {
                return NV12;
            }
            throw new IllegalArgumentException("Unsupported colorFormat: ".concat(String.valueOf(i2)));
        }
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.engine.VideoEncoder
    public void release() {
        ThreadUtils.ThreadChecker threadChecker = this.mThreadChecker;
        if (threadChecker != null) {
            threadChecker.checkIsOnValidThread();
            signalEndOfInputStream();
            SafeHandlerThread safeHandlerThread = this.outputThread;
            if (safeHandlerThread != null) {
                SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
            }
            this.mDtsQueue = null;
            releaseCodec();
            if (this.noDropFrame) {
                AVLog.ioi("HardwareVideoEncoder", "input frame count " + this.frameInCount + ", output frame count " + this.frameOutCount);
            }
        }
    }

    private void releaseCodec() {
        AVLog.iod("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e2) {
            AVLog.ioe("HardwareVideoEncoder", "codecTexture stop failed: ".concat(String.valueOf(e2)));
        }
        try {
            MediaCodec mediaCodec2 = this.codec;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
                this.codec = null;
            }
        } catch (Exception e3) {
            AVLog.ioe("HardwareVideoEncoder", "codecTexture release failed: ".concat(String.valueOf(e3)));
        }
        GlRenderDrawer glRenderDrawer = this.drawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.drawer = null;
        }
        if (this.encoder_surface != null) {
            GLES20.glFinish();
            this.encoder_surface.release();
            this.encoder_surface = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        AVLog.iod("HardwareVideoEncoder", "Release on output thread done");
    }

    private int signalEndOfInputStream() {
        String str;
        long j2;
        MethodCollector.i(14013);
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec == null) {
            MethodCollector.o(14013);
            return 0;
        }
        try {
            if (this.useSurfaceMode) {
                GLSurface gLSurface = this.encoder_surface;
                if (gLSurface != null) {
                    gLSurface.nativeSwapBuffers();
                }
                this.codec.signalEndOfInputStream();
                AVLog.ioi("HardwareVideoEncoder", "Texture codec signalEndOfInputStream ok");
            } else {
                if (this.noDropFrame) {
                    j2 = -1;
                } else {
                    j2 = 0;
                }
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j2);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = this.codec.getInputBuffers()[dequeueInputBuffer];
                    if (byteBuffer != null) {
                        byteBuffer.position(0);
                        byteBuffer.limit(0);
                    }
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                    AVLog.ioi("HardwareVideoEncoder", "Yuv codec signalEndOfInputStream ok");
                }
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            if (this.useSurfaceMode) {
                str = "Texture";
            } else {
                str = "Yuv";
            }
            AVLog.ioe("HardwareVideoEncoder", sb.append(str).append(" codec signalEndOfInputStream failed: ").append(e2.getMessage()).toString());
        }
        MethodCollector.o(14013);
        return 0;
    }

    public void deliverEncodedImage() {
        int i2;
        long j2;
        long j3;
        long j4;
        try {
            if (this.codec != null) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                try {
                    MediaCodec mediaCodec = this.codec;
                    if (this.noDropFrame) {
                        j4 = -1;
                    } else {
                        j4 = 0;
                    }
                    i2 = mediaCodec.dequeueOutputBuffer(bufferInfo, j4);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    i2 = -1;
                }
                while (i2 >= 0) {
                    ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i2];
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.size);
                    ByteBuffer slice = byteBuffer.slice();
                    if (!slice.isDirect()) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        allocateDirect.position(0);
                        allocateDirect.put(slice);
                        allocateDirect.position(0);
                        slice = allocateDirect;
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        AVLog.d("HardwareVideoEncoder", "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                        if (this.configbyte == null) {
                            byte[] bArr = new byte[bufferInfo.size];
                            this.configbyte = bArr;
                            slice.get(bArr);
                            slice.position(0);
                        }
                        nativeEncoded(slice, bufferInfo.size, bufferInfo.flags, 0, 0, 0);
                    } else if (bufferInfo.flags != 4) {
                        if (bufferInfo.flags == 1) {
                            if (this.configbyte == null) {
                                com_ss_avframework_codec_HardwareVideoEncoder_com_ss_android_ugc_aweme_lancet_LogLancet_e("HardwareVideoEncoder", "can't find config byte, end extract from I frame");
                            } else if (this.codecType.equals("video/avc")) {
                                if (bufferInfo.size > this.configbyte.length) {
                                    byte b2 = slice.get(4);
                                    byte[] bArr2 = this.configbyte;
                                    if (b2 == bArr2[4] && isKeyFrame(slice.get(bArr2.length + 4))) {
                                        slice.position(this.configbyte.length);
                                        slice.limit(slice.limit() - this.configbyte.length);
                                        slice = slice.slice();
                                    }
                                }
                            } else if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime) && bufferInfo.size > this.configbyte.length) {
                                byte b3 = slice.get(4);
                                byte[] bArr3 = this.configbyte;
                                if (b3 == bArr3[4] && isKeyFrame(slice.get(bArr3.length + 4))) {
                                    slice.position(this.configbyte.length);
                                    slice.limit(slice.limit() - this.configbyte.length);
                                    slice = slice.slice();
                                }
                            }
                        }
                        if (this.noDropFrame) {
                            this.frameOutCount++;
                        }
                        DtsQueue dtsQueue = this.mDtsQueue;
                        if (dtsQueue != null) {
                            j2 = dtsQueue.getDtsOut(bufferInfo.presentationTimeUs * 1000);
                        } else {
                            j2 = bufferInfo.presentationTimeUs * 1000;
                        }
                        nativeEncoded(slice, slice.limit(), bufferInfo.flags, 0, bufferInfo.presentationTimeUs, j2 / 1000);
                    } else {
                        return;
                    }
                    this.codec.releaseOutputBuffer(i2, false);
                    MediaCodec mediaCodec2 = this.codec;
                    if (this.noDropFrame) {
                        j3 = -1;
                    } else {
                        j3 = 0;
                    }
                    i2 = mediaCodec2.dequeueOutputBuffer(bufferInfo, j3);
                }
                if (i2 == -2) {
                    MediaFormat outputFormat = this.codec.getOutputFormat();
                    ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-0");
                    ByteBuffer byteBuffer3 = outputFormat.getByteBuffer("csd-1");
                    if (this.codecType.equals("video/avc") && byteBuffer2 != null && byteBuffer3 != null) {
                        this.sps = (byte[]) byteBuffer2.array().clone();
                        byte[] bArr4 = (byte[]) byteBuffer3.array().clone();
                        this.pps = bArr4;
                        byte[] bArr5 = this.sps;
                        byte[] bArr6 = new byte[(bArr5.length + bArr4.length)];
                        this.configbyte = bArr6;
                        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                        byte[] bArr7 = this.pps;
                        System.arraycopy(bArr7, 0, this.configbyte, this.sps.length, bArr7.length);
                    } else if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime) && byteBuffer2 != null) {
                        byte[] bArr8 = (byte[]) byteBuffer2.array().clone();
                        this.vps_sps_pps = bArr8;
                        byte[] bArr9 = new byte[bArr8.length];
                        this.configbyte = bArr9;
                        System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                    }
                }
            }
        } catch (IllegalStateException e3) {
            AVLog.e("HardwareVideoEncoder", "deliverOutput failed\n" + e3.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public class DtsQueue {
        private int hasBFrames;
        private final int maxCheckCount;
        private final LinkedList<Long> ptsOutQueue;

        static {
            Covode.recordClassIndex(99759);
        }

        /* access modifiers changed from: package-private */
        public synchronized long getPtsIn(long j2) {
            MethodCollector.i(13683);
            MethodCollector.o(13683);
            return j2;
        }

        private DtsQueue() {
            this.ptsOutQueue = new LinkedList<>();
            this.hasBFrames = -1;
            this.maxCheckCount = 5;
        }

        /* access modifiers changed from: package-private */
        public synchronized long getDtsOut(long j2) {
            String str;
            MethodCollector.i(13745);
            if (this.hasBFrames == -1) {
                Long peekLast = this.ptsOutQueue.peekLast();
                this.ptsOutQueue.offer(Long.valueOf(j2));
                int i2 = 0;
                if (peekLast != null && j2 <= peekLast.longValue()) {
                    this.hasBFrames = 1;
                    StringBuilder sb = new StringBuilder("Encoder output pts disorder: ");
                    while (i2 < this.ptsOutQueue.size()) {
                        StringBuilder append = sb.append(this.ptsOutQueue.get(i2).longValue() / 1000000);
                        i2++;
                        if (i2 >= this.ptsOutQueue.size()) {
                            str = "ms.";
                        } else {
                            str = "ms, ";
                        }
                        append.append(str);
                    }
                    AVLog.iow("HardwareVideoEncoder", sb.toString());
                    AVLog.logKibana(5, "HardwareVideoEncoder", sb.toString(), null);
                } else if (this.ptsOutQueue.size() + 1 >= 5) {
                    this.hasBFrames = 0;
                }
            }
            MethodCollector.o(13745);
            return j2;
        }
    }

    private synchronized int mapProfileLevel(int i2) {
        int i3;
        MethodCollector.i(13898);
        i3 = 2;
        if (i2 != 2) {
            if (i2 != 3) {
                i3 = 1;
            } else {
                i3 = 8;
            }
        }
        MethodCollector.o(13898);
        return i3;
    }

    private boolean shouldForceKeyFrame(long j2) {
        long j3 = this.forcedKeyFrameNs;
        if (j3 <= 0 || j2 <= this.lastKeyFrameNs + j3) {
            return false;
        }
        return true;
    }

    private boolean isKeyFrame(byte b2) {
        if (this.codecType.equals("video/avc")) {
            if ((b2 & 31) == 5) {
                return true;
            }
            return false;
        } else if (!this.codecType.equals(MediaCodecUtils.ByteVC1Mime)) {
            return false;
        } else {
            int i2 = (b2 & 126) >> 1;
            if (i2 == 16 || i2 == 17 || i2 == 18 || i2 == 19 || i2 == 20 || i2 == 21) {
                return true;
            }
            return false;
        }
    }

    private void requestKeyFrame(long j2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                mediaCodec.setParameters(bundle);
            }
            this.lastKeyFrameNs = j2;
        } catch (IllegalStateException e2) {
            AVLog.e("HardwareVideoEncoder", "requestKeyFrame failed\n" + e2.getMessage());
        }
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        if (this.codec == null) {
            return -1;
        }
        this.mThreadChecker.checkIsOnValidThread();
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        if (z != this.useSurfaceMode) {
            return -2;
        }
        SafeHandlerThread safeHandlerThread = this.outputThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() {
                /* class com.ss.avframework.codec.HardwareVideoEncoder.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(99758);
                }

                public void run() {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
            });
        }
        if (z) {
            return encodeTextureBuffer(videoFrame);
        }
        return encodeByteBuffer(videoFrame);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:17|18|19|(1:21)|22|(2:24|25)|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        com.ss.avframework.utils.AVLog.e("HardwareVideoEncoder", "queueInputBuffer failed\n".concat(java.lang.String.valueOf(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        return -4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int encodeByteBuffer(com.ss.avframework.buffer.VideoFrame r14) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.codec.HardwareVideoEncoder.encodeByteBuffer(com.ss.avframework.buffer.VideoFrame):int");
    }

    private int encodeTextureBuffer(VideoFrame videoFrame) {
        long timestampNs;
        MethodCollector.i(13957);
        if (this.noDropFrame) {
            this.frameInCount++;
        }
        try {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            DtsQueue dtsQueue = this.mDtsQueue;
            if (dtsQueue != null) {
                timestampNs = dtsQueue.getPtsIn(videoFrame.getTimestampNs());
            } else {
                timestampNs = videoFrame.getTimestampNs();
            }
            if (!(buffer instanceof VideoFrame.TextureBuffer)) {
                MethodCollector.o(13957);
                return -1;
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            HardwareVideoEncodeRoi hardwareVideoEncodeRoi = this.mRoi;
            if (hardwareVideoEncodeRoi != null) {
                try {
                    hardwareVideoEncodeRoi.encodeWithRoi(this.codec, videoFrame, this.adjustedBitrate);
                } catch (Exception unused) {
                }
            }
            if (this.mSwap) {
                this.encoder_surface.nativeSwapBuffers();
            } else {
                this.mSwap = true;
            }
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                this.drawer.drawOes(textureBuffer.getTextureId(), null, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), 0, 0, this.width, this.height);
                if (GLThreadManager.isNeedFinish()) {
                    GLES20.glFinish();
                }
                GLES20.glFlush();
            } else {
                if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.RGB) {
                    this.drawer.drawRgb(textureBuffer.getTextureId(), null, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), 0, 0, this.width, this.height);
                }
                GLES20.glFlush();
            }
            int i2 = Build.VERSION.SDK_INT;
            EGLExt.eglPresentationTimeANDROID(this.currDisplay, this.currSurface, timestampNs);
            if (this.requestIDRFrame) {
                requestKeyFrame(timestampNs);
                this.requestIDRFrame = false;
            }
            MethodCollector.o(13957);
            return 0;
        } catch (RuntimeException e2) {
            AVLog.e("HardwareVideoEncoder", "encodeTexture failed\n" + e2.getMessage());
            MethodCollector.o(13957);
            return -2;
        }
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        if (this.mThreadChecker == null) {
            this.mThreadChecker = new ThreadUtils.ThreadChecker();
        }
        this.width = tEBundle.getInt("video_width");
        this.height = tEBundle.getInt("video_height");
        int i2 = tEBundle.getInt("video_fps");
        this.fps = i2;
        if (i2 <= 0) {
            i2 = 25;
        }
        this.fps = i2;
        this.noDropFrame = tEBundle.getBool("video_no_drop_frame");
        this.fixBFrameDts = tEBundle.getBool("video_fix_hardware_enc_dts");
        if (tEBundle.contains("video_const_time_period_gop")) {
            this.constTimePeriod = tEBundle.getBool("video_const_time_period_gop");
        }
        boolean bool = tEBundle.getBool("video_lossless_encode");
        this.lossless = bool;
        if (bool) {
            this.adjustedBitrate = ((((this.width * this.height) * this.fps) * 3) / 2) * 8;
        } else {
            this.adjustedBitrate = (int) tEBundle.getLong("video_bitrate");
        }
        int i3 = tEBundle.getInt("video_gop");
        int i4 = this.fps;
        this.keyFrameIntervalSec = i3 / i4;
        this.forcedKeyFrameNs = (long) (((i4 * 1000) * 1000) / 1000);
        if (tEBundle.getInt("configuration_type") == 0) {
            AVLog.ioe("HardwareVideoEncoder", "Value of TEBundle.kKeyVideoConfigurationType error, should be 1 (Annex-B)");
            return false;
        }
        boolean z = !tEBundle.getBool("video_is_yuv_frame");
        this.useSurfaceMode = z;
        if (!z ? this.yuvColorFormat != null : this.surfaceColorFormat != null) {
            if (this.mRoi == null) {
                this.mRoi = HardwareVideoEncodeRoi.createRoiProcessor(this.codecName, tEBundle);
            }
            return initEncodeInternal(tEBundle);
        }
        AVLog.ioe("HardwareVideoEncoder", "useSurfaceMode " + this.useSurfaceMode + ", surfaceColorFormat " + this.surfaceColorFormat + ", yuvColorFormat " + this.yuvColorFormat);
        return false;
    }

    @Override // com.ss.avframework.engine.VideoEncoder
    public void SetBitrate(int i2) {
        if (!this.lossless && this.codec != null && Build.VERSION.SDK_INT >= 21) {
            try {
                Bundle bundle = new Bundle();
                float f2 = (float) i2;
                bundle.putInt("video-bitrate", (int) (this.bitateRatio * f2));
                this.codec.setParameters(bundle);
                this.adjustedBitrate = i2;
                AVLog.ioi("HardwareVideoEncoder", "update bitrate: " + i2 + " * " + this.bitateRatio + " = " + ((int) (f2 * this.bitateRatio)));
            } catch (IllegalStateException e2) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("video-bitrate", (int) (((float) this.adjustedBitrate) * this.bitateRatio));
                this.codec.setParameters(bundle2);
                AVLog.ioi("HardwareVideoEncoder", "reset bitrate: " + this.adjustedBitrate + " * " + this.bitateRatio + " = " + ((int) (((float) this.adjustedBitrate) * this.bitateRatio)));
            } catch (Throwable unused) {
                AVLog.e("HardwareVideoEncoder", "update bitrate failed".concat(String.valueOf(e2)));
                AVLog.ioe("HardwareVideoEncoder", "Update bitrate failed new bitrate " + i2 + " old bitrate " + this.adjustedBitrate + " cause:" + e2.getMessage());
            }
        }
    }

    private boolean initEncodeInternal(TEBundle tEBundle) {
        boolean z;
        int i2;
        String str;
        int i3;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        DtsQueue dtsQueue;
        MethodCollector.i(13903);
        this.lastKeyFrameNs = -1;
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType, this.width, this.height);
            createVideoFormat.setInteger("bitrate", this.adjustedBitrate);
            if (tEBundle.getInt("video_is_cbr") == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            createVideoFormat.setInteger("bitrate-mode", i2);
            StringBuilder sb = new StringBuilder("Set bitrate mode: ");
            if (z) {
                str = "CBR";
            } else {
                str = "VBR";
            }
            com_ss_avframework_codec_HardwareVideoEncoder_com_ss_android_ugc_aweme_lancet_LogLancet_i("HardwareVideoEncoder", sb.append(str).toString());
            createVideoFormat.setInteger("frame-rate", this.fps);
            if (this.constTimePeriod) {
                i3 = -1;
            } else {
                i3 = this.keyFrameIntervalSec;
            }
            AVLog.iow("HardwareVideoEncoder", "Using constant time period [" + this.constTimePeriod + "] with i frame interval [" + i3 + "s]");
            createVideoFormat.setInteger("i-frame-interval", i3);
            HardwareVideoEncodeRoi hardwareVideoEncodeRoi = this.mRoi;
            if (hardwareVideoEncodeRoi != null) {
                hardwareVideoEncodeRoi.configureRoi(createVideoFormat);
            }
            if (this.codecType.equals("video/avc")) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = this.info.getCapabilitiesForType(this.codecType).profileLevels;
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        codecProfileLevel = null;
                        break;
                    }
                    codecProfileLevel = codecProfileLevelArr[i4];
                    AVLog.d("HardwareVideoEncoder", "Profile = " + codecProfileLevel.profile + ", Level = " + codecProfileLevel.level);
                    if (codecProfileLevel.profile == 1) {
                        AVLog.d("HardwareVideoEncoder", "Support Baseline Profile!");
                    } else if (codecProfileLevel.profile == 2) {
                        AVLog.d("HardwareVideoEncoder", "Support Main Profile!");
                    } else if (codecProfileLevel.profile == 8) {
                        AVLog.d("HardwareVideoEncoder", "Support High Profile!");
                    }
                    if (codecProfileLevel.profile == mapProfileLevel(tEBundle.getInt("video_profileLevel"))) {
                        break;
                    }
                    i4++;
                }
                if (Build.VERSION.SDK_INT < 21 || codecProfileLevel == null) {
                    MethodCollector.o(13903);
                    return false;
                }
                AVLog.d("HardwareVideoEncoder", "Set Profile: " + codecProfileLevel.profile + ", Level = " + codecProfileLevel.level);
                createVideoFormat.setInteger("profile", codecProfileLevel.profile);
                createVideoFormat.setInteger("level", codecProfileLevel.level);
                if (this.fixBFrameDts) {
                    dtsQueue = new DtsQueueFixed();
                } else {
                    dtsQueue = new DtsQueue();
                }
                this.mDtsQueue = dtsQueue;
            } else if (this.codecType.equals(MediaCodecUtils.ByteVC1Mime)) {
                if (tEBundle.getInt("video_profileLevel") != 5) {
                    createVideoFormat.setInteger("profile", 1);
                } else {
                    createVideoFormat.setInteger("profile", 2);
                }
                createVideoFormat.setInteger("level", 256);
                this.mDtsQueue = new DtsQueue();
            } else {
                AVLog.ioe("HardwareVideoEncoder", "Unsupported codec type: " + this.codecType);
                MethodCollector.o(13903);
                return false;
            }
            if (this.useSurfaceMode) {
                int i5 = Build.VERSION.SDK_INT;
                createVideoFormat.setInteger("color-format", this.surfaceColorFormat.intValue());
                MediaCodec createByCodecName = MediaCodec.createByCodecName(this.codecName);
                this.codec = createByCodecName;
                createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                try {
                    this.textureInputSurface = this.codec.createInputSurface();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.drawer = new GlRenderDrawer();
                GLSurface gLSurface = new GLSurface();
                this.encoder_surface = gLSurface;
                gLSurface.nativeSurfaceCreate(this.width, this.height, this.textureInputSurface);
                this.encoder_surface.nativeMakeCurrent();
                this.currDisplay = EGL14.eglGetCurrentDisplay();
                EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
                this.currSurface = eglGetCurrentSurface;
                if (eglGetCurrentSurface == null || this.currDisplay == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("currSurface " + this.currSurface + ", currDisplay " + this.currDisplay);
                    MethodCollector.o(13903);
                    throw illegalStateException;
                }
                this.codec.start();
            } else {
                createVideoFormat.setInteger("color-format", this.yuvColorFormat.intValue());
                MediaCodec createByCodecName2 = MediaCodec.createByCodecName(this.codecName);
                this.codec = createByCodecName2;
                createByCodecName2.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.codec.start();
            }
            AVLog.d("HardwareVideoEncoder", "Format: ".concat(String.valueOf(createVideoFormat)));
            HardwareVideoEncodeRoi hardwareVideoEncodeRoi2 = this.mRoi;
            if (hardwareVideoEncodeRoi2 != null) {
                hardwareVideoEncodeRoi2.checkSupportRoi(this.codec, tEBundle);
                this.bitateRatio = this.mRoi.getRoiSettingBitrateRatio();
            } else {
                this.bitateRatio = HardwareVideoEncodeRoi.getRoiSettingBitrateRatio(tEBundle);
            }
            if (((double) Math.abs(this.bitateRatio - 1.0f)) > 1.0E-6d) {
                SetBitrate(this.adjustedBitrate);
            }
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("HwEncoderReadThread");
            this.outputThread = lockThread;
            lockThread.start();
            MethodCollector.o(13903);
            return true;
        } catch (Exception e3) {
            AVLog.ioe("HardwareVideoEncoder", "initEncodeInternal failed: " + e3.getMessage());
            releaseCodec();
            MethodCollector.o(13903);
            return false;
        }
    }

    public void setupCodecName(String str, String str2, Integer num, Integer num2) {
        this.codecName = str;
        this.codecType = str2;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
    }
}
