package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.realx.base.RXLogging;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final RXVideoCodecStandard codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final Object dimensionLock = new Object();
    private int encoded_height;
    private int encoded_width;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    public ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private final Object renderedTextureMetadataLock = new Object();
    public volatile boolean running;
    private VideoDecoder.Settings settings;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;

    static {
        Covode.recordClassIndex(106501);
    }

    @Override // org.webrtc.VideoDecoder
    public long createNativeVideoDecoder() {
        return VideoDecoder$$CC.createNativeVideoDecoder(this);
    }

    @Override // org.webrtc.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") {
            /* class org.webrtc.AndroidVideoDecoder.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106502);
            }

            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    /* access modifiers changed from: protected */
    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    /* access modifiers changed from: protected */
    public void releaseSurface() {
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
            this.surface = null;
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        MethodCollector.i(8200);
        RXLogging.d("AndroidVideoDecoder", "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        releaseSurface();
        synchronized (this.renderedTextureMetadataLock) {
            try {
                this.renderedTextureMetadata = null;
            } catch (Throwable th) {
                MethodCollector.o(8200);
                throw th;
            }
        }
        this.callback = null;
        MethodCollector.o(8200);
        return releaseInternal;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.i("AndroidVideoDecoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e2) {
            RXLogging.e("AndroidVideoDecoder", "Media decoder stop failed", e2);
        }
        try {
            this.codec.release();
        } catch (Exception e3) {
            RXLogging.e("AndroidVideoDecoder", "Media decoder release failed", e3);
            this.shutdownException = e3;
        }
        releaseSurface();
        RXLogging.i("AndroidVideoDecoder", "Release on output thread done");
    }

    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            RXLogging.d("AndroidVideoDecoder", "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000)) {
                RXLogging.e("AndroidVideoDecoder", "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                RXLogging.e("AndroidVideoDecoder", "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.ERROR;
                this.codec = null;
                this.outputThread = null;
                return videoCodecStatus;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                RXLogging.v("AndroidVideoDecoder", "dequeueOutputBuffer returned ".concat(String.valueOf(dequeueOutputBuffer)));
            } else {
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo);
                }
            }
        } catch (IllegalStateException e2) {
            RXLogging.e("AndroidVideoDecoder", "deliverDecodedFrame failed", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class DecodedTextureMetadata {
        final long presentationTimestampUs;

        static {
            Covode.recordClassIndex(106503);
        }

        DecodedTextureMetadata(long j2) {
            this.presentationTimestampUs = j2;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    private boolean isSupportedColorFormat(int i2) {
        for (int i3 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j2;
        MethodCollector.i(8535);
        synchronized (this.renderedTextureMetadataLock) {
            try {
                DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
                if (decodedTextureMetadata != null) {
                    j2 = decodedTextureMetadata.presentationTimestampUs * 1000;
                    this.renderedTextureMetadata = null;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
                    MethodCollector.o(8535);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.o(8535);
                throw th;
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), 0, j2));
        MethodCollector.o(8535);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        if (r7.surfaceTextureHelper != null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d0, code lost:
        if (r8.containsKey("color-format") == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d2, code lost:
        r7.colorFormat = r8.getInteger("color-format");
        com.bytedance.realx.base.RXLogging.i("AndroidVideoDecoder", "Color: 0x" + java.lang.Integer.toHexString(r7.colorFormat));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fa, code lost:
        if (isSupportedColorFormat(r7.colorFormat) != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fc, code lost:
        stopOnOutputThread(new java.lang.IllegalStateException("Unsupported color format: " + r7.colorFormat));
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8596);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0118, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0119, code lost:
        r2 = r7.dimensionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011b, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0122, code lost:
        if (r8.containsKey("stride") == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0124, code lost:
        r7.stride = r8.getInteger("stride");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0132, code lost:
        if (r8.containsKey("slice-height") == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0134, code lost:
        r7.sliceHeight = r8.getInteger("slice-height");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013c, code lost:
        com.bytedance.realx.base.RXLogging.i("AndroidVideoDecoder", "Frame stride and slice height: " + r7.stride + " x " + r7.sliceHeight);
        r7.stride = java.lang.Math.max(r7.width, r7.stride);
        r7.sliceHeight = java.lang.Math.max(r7.height, r7.sliceHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0172, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0176, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0177, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0179, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8596);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void reformat(android.media.MediaFormat r8) {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage) {
        MethodCollector.i(8191);
        try {
            if (!(encodedImage.encodedWidth == this.encoded_width && encodedImage.encodedHeight == this.encoded_height)) {
                VideoCodecStatus reinitDecode = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight);
                if (reinitDecode != VideoCodecStatus.OK) {
                    MethodCollector.o(8191);
                    return reinitDecode;
                }
                synchronized (this.dimensionLock) {
                    try {
                        this.encoded_width = encodedImage.encodedWidth;
                        this.encoded_height = encodedImage.encodedHeight;
                        this.width = encodedImage.encodedWidth;
                        this.height = encodedImage.encodedHeight;
                    } catch (Throwable th) {
                        MethodCollector.o(8191);
                        throw th;
                    }
                }
            }
            this.decoderThreadChecker.checkIsOnValidThread();
            boolean z = false;
            if (this.codec == null || this.callback == null) {
                StringBuilder sb = new StringBuilder("decode uninitalized, codec: ");
                if (this.codec != null) {
                    z = true;
                }
                RXLogging.d("AndroidVideoDecoder", sb.append(z).append(", callback: ").append(this.callback).toString());
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.UNINITIALIZED;
                MethodCollector.o(8191);
                return videoCodecStatus;
            } else if (encodedImage.buffer == null) {
                RXLogging.e("AndroidVideoDecoder", "decode() - no input data");
                VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.ERR_PARAMETER;
                MethodCollector.o(8191);
                return videoCodecStatus2;
            } else {
                int remaining = encodedImage.buffer.remaining();
                if (remaining == 0) {
                    RXLogging.e("AndroidVideoDecoder", "decode() - input buffer empty");
                    VideoCodecStatus videoCodecStatus3 = VideoCodecStatus.ERR_PARAMETER;
                    MethodCollector.o(8191);
                    return videoCodecStatus3;
                }
                if (this.keyFrameRequired) {
                    if (encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                        RXLogging.e("AndroidVideoDecoder", "decode() - key frame required first");
                        VideoCodecStatus videoCodecStatus4 = VideoCodecStatus.NO_OUTPUT;
                        MethodCollector.o(8191);
                        return videoCodecStatus4;
                    } else if (!encodedImage.completeFrame) {
                        RXLogging.e("AndroidVideoDecoder", "decode() - complete frame required first");
                        VideoCodecStatus videoCodecStatus5 = VideoCodecStatus.NO_OUTPUT;
                        MethodCollector.o(8191);
                        return videoCodecStatus5;
                    }
                }
                try {
                    int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000);
                    if (dequeueInputBuffer < 0) {
                        RXLogging.e("AndroidVideoDecoder", "decode() - no HW buffers available; decoder falling behind");
                        VideoCodecStatus videoCodecStatus6 = VideoCodecStatus.ERROR;
                        MethodCollector.o(8191);
                        return videoCodecStatus6;
                    }
                    try {
                        ByteBuffer byteBuffer = this.codec.getInputBuffers()[dequeueInputBuffer];
                        if (byteBuffer.capacity() < remaining) {
                            RXLogging.e("AndroidVideoDecoder", "decode() - HW buffer too small");
                            VideoCodecStatus videoCodecStatus7 = VideoCodecStatus.ERROR;
                            MethodCollector.o(8191);
                            return videoCodecStatus7;
                        }
                        byteBuffer.put(encodedImage.buffer);
                        try {
                            this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                            if (this.keyFrameRequired) {
                                this.keyFrameRequired = false;
                            }
                            VideoCodecStatus videoCodecStatus8 = VideoCodecStatus.OK;
                            MethodCollector.o(8191);
                            return videoCodecStatus8;
                        } catch (IllegalStateException e2) {
                            RXLogging.e("AndroidVideoDecoder", "queueInputBuffer failed", e2);
                            VideoCodecStatus videoCodecStatus9 = VideoCodecStatus.ERROR;
                            MethodCollector.o(8191);
                            return videoCodecStatus9;
                        }
                    } catch (IllegalStateException e3) {
                        RXLogging.e("AndroidVideoDecoder", "getInputBuffers failed", e3);
                        VideoCodecStatus videoCodecStatus10 = VideoCodecStatus.ERROR;
                        MethodCollector.o(8191);
                        return videoCodecStatus10;
                    }
                } catch (IllegalStateException e4) {
                    RXLogging.e("AndroidVideoDecoder", "dequeueInputBuffer failed", e4);
                    VideoCodecStatus videoCodecStatus11 = VideoCodecStatus.ERROR;
                    MethodCollector.o(8191);
                    return videoCodecStatus11;
                }
            }
        } catch (Exception e5) {
            RXLogging.e("AndroidVideoDecoder", "android decode err", e5);
            VideoCodecStatus videoCodecStatus12 = VideoCodecStatus.ERROR;
            MethodCollector.o(8191);
            return videoCodecStatus12;
        }
    }

    /* access modifiers changed from: protected */
    public VideoFrame.I420Buffer allocateI420Buffer(int i2, int i3) {
        return JavaI420Buffer.allocate(i2, i3);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings2, VideoDecoder.Callback callback2) {
        this.callback = callback2;
        this.settings = settings2;
        return VideoCodecStatus.OK;
    }

    private VideoCodecStatus reinitDecode(int i2, int i3) {
        VideoCodecStatus initDecodeInternal;
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            RXLogging.e("AndroidVideoDecoder", "releaseInternal err");
            return releaseInternal;
        }
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
        int i4 = 0;
        do {
            initDecodeInternal = initDecodeInternal(i2, i3);
            if (VideoCodecStatus.OK == initDecodeInternal) {
                break;
            }
            i4++;
        } while (i4 < 5);
        return initDecodeInternal;
    }

    private void deliverTextureFrame(int i2, MediaCodec.BufferInfo bufferInfo) {
        int i3;
        int i4;
        MethodCollector.i(8368);
        synchronized (this.dimensionLock) {
            try {
                i3 = this.width;
                i4 = this.height;
            } finally {
                MethodCollector.o(8368);
            }
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    try {
                        this.codec.releaseOutputBuffer(i2, false);
                    } catch (IllegalStateException e2) {
                        RXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed", e2);
                    }
                    return;
                }
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
                try {
                    this.codec.releaseOutputBuffer(i2, true);
                } catch (IllegalStateException e3) {
                    RXLogging.e("AndroidVideoDecoder", "releaseOutputBuffer failed!", e3);
                }
                MethodCollector.o(8368);
            } finally {
                MethodCollector.o(8368);
            }
        }
    }

    private void deliverByteFrame(int i2, MediaCodec.BufferInfo bufferInfo) {
        int i3;
        int i4;
        int i5;
        int i6;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        MethodCollector.i(8546);
        synchronized (this.dimensionLock) {
            try {
                i3 = this.width;
                i4 = this.height;
                i5 = this.stride;
                i6 = this.sliceHeight;
            } catch (Throwable th) {
                MethodCollector.o(8546);
                throw th;
            }
        }
        if (bufferInfo.size < ((i3 * i4) * 3) / 2) {
            RXLogging.e("AndroidVideoDecoder", "Insufficient output buffer size: " + bufferInfo.size);
            MethodCollector.o(8546);
            return;
        }
        if (bufferInfo.size < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i5 = (bufferInfo.size * 2) / (i4 * 3);
        }
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i2];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat == 19) {
            copyNV12ToI420Buffer = copyI420Buffer(slice, i5, i6, i3, i4);
        } else {
            copyNV12ToI420Buffer = copyNV12ToI420Buffer(slice, i5, i6, i3, i4);
        }
        this.codec.releaseOutputBuffer(i2, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, 0, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame);
        videoFrame.release();
        MethodCollector.o(8546);
    }

    private VideoCodecStatus initDecodeInternal(int i2, int i3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        RXLogging.w("AndroidVideoDecoder", "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i2 + " height: " + i3 + " sharedContext:" + this.sharedContext + " output_by_dts: " + this.settings.output_by_dts);
        if (this.outputThread != null) {
            RXLogging.e("AndroidVideoDecoder", "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i2;
        this.height = i3;
        this.stride = i2;
        this.sliceHeight = i3;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i2, i3);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                if (this.settings.output_by_dts) {
                    createVideoFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
                    if (i2 < i3) {
                        createVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
                    }
                    createVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", 1);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                VideoDecoderWrapper.SetDecoderInitCostTime(elapsedRealtime2);
                RXLogging.w("AndroidVideoDecoder", "initDecodeInternal done,init video decoder cost time:".concat(String.valueOf(elapsedRealtime2)));
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException | IllegalStateException e2) {
                RXLogging.e("AndroidVideoDecoder", "initDecode failed", e2);
                this.codec.release();
                releaseSurface();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException unused) {
            RXLogging.e("AndroidVideoDecoder", "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        return new NV12Buffer(i4, i5, i2, i3, byteBuffer, null).toI420();
    }

    AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, RXVideoCodecStandard rXVideoCodecStandard, int i2, EglBase.Context context) {
        if (isSupportedColorFormat(i2)) {
            RXLogging.w("AndroidVideoDecoder", "ctor name: " + str + " type: " + rXVideoCodecStandard + " color format: " + i2 + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
            this.codecName = str;
            this.codecType = rXVideoCodecStandard;
            this.colorFormat = i2;
            this.sharedContext = context;
            this.width = 0;
            this.height = 0;
            return;
        }
        throw new IllegalArgumentException("Unsupported color format: ".concat(String.valueOf(i2)));
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i2, int i3, int i4, int i5) {
        int i6;
        if (i2 % 2 == 0) {
            int i7 = (i4 + 1) / 2;
            int i8 = i3 % 2;
            if (i8 == 0) {
                i6 = (i5 + 1) / 2;
            } else {
                i6 = i5 / 2;
            }
            int i9 = i2 / 2;
            int i10 = (i2 * i3) + 0;
            int i11 = i9 * i6;
            int i12 = i10 + i11;
            int i13 = i10 + ((i9 * i3) / 2);
            int i14 = i11 + i13;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i4, i5);
            byteBuffer.limit((i2 * i5) + 0);
            byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i2, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i4, i5);
            byteBuffer.limit(i12);
            byteBuffer.position(i10);
            copyPlane(byteBuffer.slice(), i9, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i7, i6);
            if (i8 == 1) {
                byteBuffer.position(i10 + ((i6 - 1) * i9));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i6);
                dataU.put(byteBuffer);
            }
            byteBuffer.limit(i14);
            byteBuffer.position(i13);
            copyPlane(byteBuffer.slice(), i9, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i7, i6);
            if (i8 == 1) {
                byteBuffer.position(i13 + (i9 * (i6 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i6);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError("Stride is not divisible by two: ".concat(String.valueOf(i2)));
    }

    /* access modifiers changed from: protected */
    public void copyPlane(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4, int i5) {
        YuvHelper.copyPlane(byteBuffer, i2, byteBuffer2, i3, i4, i5);
    }
}
