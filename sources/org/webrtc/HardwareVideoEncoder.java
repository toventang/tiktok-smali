package org.webrtc;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.realx.RXVideoSurfaceController;
import com.bytedance.realx.base.RXLogging;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

class HardwareVideoEncoder implements VideoEncoder {
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final RXVideoCodecDesc codecDesc;
    private final String codecName;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    public volatile boolean running;
    private VideoEncoder.ScaleMode scaleMode;
    private VideoEncoder.Settings settings;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private final Integer surfaceColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;

    static {
        Covode.recordClassIndex(106599);
    }

    private Thread createOutputThread() {
        return new Thread("video_encoded_thread") {
            /* class org.webrtc.HardwareVideoEncoder.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106600);
            }

            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private boolean canUseSurface() {
        if (this.sharedContext == null || this.surfaceColorFormat == null) {
            return false;
        }
        return true;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus requestKeyFrame() {
        requestKeyFrame(System.currentTimeMillis());
        return VideoCodecStatus.OK;
    }

    /* access modifiers changed from: package-private */
    public enum YuvFormat {
        I420 {
            /* access modifiers changed from: package-private */
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                if (buffer != null) {
                    VideoFrame.I420Buffer i420 = buffer.toI420();
                    YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                    i420.release();
                }
            }
        },
        NV12 {
            /* access modifiers changed from: package-private */
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public final void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
                if (buffer != null) {
                    VideoFrame.I420Buffer i420 = buffer.toI420();
                    YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                    i420.release();
                }
            }
        };

        /* access modifiers changed from: package-private */
        public abstract void fillBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer);

        static {
            Covode.recordClassIndex(106602);
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

    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            if (this.codecDesc.getStandard() == RXVideoCodecStandard.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (this.codecDesc.getStandard() == RXVideoCodecStandard.VP8) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        RXLogging.i("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e2) {
            RXLogging.e("HardwareVideoEncoder", "Media encoder stop failed", e2);
        }
        try {
            this.codec.release();
        } catch (Exception e3) {
            RXLogging.e("HardwareVideoEncoder", "Media encoder release failed", e3);
            this.shutdownException = e3;
        }
        this.configBuffer = null;
        RXLogging.i("HardwareVideoEncoder", "Release on output thread done");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.HardwareVideoEncoder$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RXVideoCodecProfile;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 106601(0x1a069, float:1.4938E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                org.webrtc.RXVideoCodecProfile[] r0 = org.webrtc.RXVideoCodecProfile.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                org.webrtc.HardwareVideoEncoder.AnonymousClass2.$SwitchMap$org$webrtc$RXVideoCodecProfile = r2
                org.webrtc.RXVideoCodecProfile r0 = org.webrtc.RXVideoCodecProfile.ProfileHigh     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = org.webrtc.HardwareVideoEncoder.AnonymousClass2.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x0023 }
                org.webrtc.RXVideoCodecProfile r0 = org.webrtc.RXVideoCodecProfile.ProfileConstrainedHigh     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = org.webrtc.HardwareVideoEncoder.AnonymousClass2.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x002e }
                org.webrtc.RXVideoCodecProfile r0 = org.webrtc.RXVideoCodecProfile.ProfileBaseline     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = org.webrtc.HardwareVideoEncoder.AnonymousClass2.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x0039 }
                org.webrtc.RXVideoCodecProfile r0 = org.webrtc.RXVideoCodecProfile.ProfileConstrainedBaseline     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = org.webrtc.HardwareVideoEncoder.AnonymousClass2.$SwitchMap$org$webrtc$RXVideoCodecProfile     // Catch:{ NoSuchFieldError -> 0x0044 }
                org.webrtc.RXVideoCodecProfile r0 = org.webrtc.RXVideoCodecProfile.ProfileMain     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.AnonymousClass2.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e  */
    @Override // org.webrtc.VideoEncoder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoCodecStatus release() {
        /*
            r3 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r3.encodeThreadChecker
            r0.checkIsOnValidThread()
            java.lang.Thread r0 = r3.outputThread
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r3.running = r0
            java.lang.Thread r2 = r3.outputThread
            r0 = 5000(0x1388, double:2.4703E-320)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r2, r0)
            java.lang.String r2 = "HardwareVideoEncoder"
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "Media encoder release timeout"
            com.bytedance.realx.base.RXLogging.e(r2, r0)
            org.webrtc.VideoCodecStatus r2 = org.webrtc.VideoCodecStatus.TIMEOUT
        L_0x001f:
            org.webrtc.GlRectDrawer r0 = r3.textureDrawer
            r0.release()
            org.webrtc.VideoFrameDrawer r0 = r3.videoFrameDrawer
            r0.release()
            org.webrtc.EglBase14 r0 = r3.textureEglBase
            r1 = 0
            if (r0 == 0) goto L_0x0033
            r0.release()
            r3.textureEglBase = r1
        L_0x0033:
            android.view.Surface r0 = r3.textureInputSurface
            if (r0 == 0) goto L_0x003c
            r0.release()
            r3.textureInputSurface = r1
        L_0x003c:
            r3.codec = r1
            r3.outputThread = r1
            org.webrtc.ThreadUtils$ThreadChecker r0 = r3.encodeThreadChecker
            r0.detachThread()
            return r2
        L_0x0046:
            java.lang.Exception r0 = r3.shutdownException
            if (r0 == 0) goto L_0x0054
            java.lang.Exception r1 = r3.shutdownException
            java.lang.String r0 = "Media encoder release exception"
            com.bytedance.realx.base.RXLogging.e(r2, r0, r1)
            org.webrtc.VideoCodecStatus r2 = org.webrtc.VideoCodecStatus.ERROR
            goto L_0x001f
        L_0x0054:
            org.webrtc.VideoCodecStatus r2 = org.webrtc.VideoCodecStatus.OK
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.release():org.webrtc.VideoCodecStatus");
    }

    private VideoCodecStatus initEncodeInternal() {
        Integer num;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            if (this.useSurfaceMode) {
                num = this.surfaceColorFormat;
            } else {
                num = this.yuvColorFormat;
            }
            int intValue = num.intValue();
            try {
                RXVideoCodecStandard standard = this.codecDesc.getStandard();
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(standard.mimeType(), this.width, this.height);
                createVideoFormat.setInteger("bitrate", this.settings.targetBps);
                createVideoFormat.setInteger("bitrate-mode", 1);
                createVideoFormat.setInteger("color-format", intValue);
                createVideoFormat.setInteger("frame-rate", this.settings.targetFps);
                createVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
                createVideoFormat.setInteger("max-bframes", 0);
                if (this.settings.rangeId == 1) {
                    createVideoFormat.setInteger("color-range", 1);
                } else {
                    createVideoFormat.setInteger("color-range", 2);
                }
                createVideoFormat.setInteger("color-standard", 4);
                createVideoFormat.setInteger("color-transfer", 3);
                if (standard == RXVideoCodecStandard.H264) {
                    RXVideoCodecProfile profile = this.codecDesc.getProfile();
                    int i2 = AnonymousClass2.$SwitchMap$org$webrtc$RXVideoCodecProfile[profile.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        RXLogging.w("HardwareVideoEncoder", "setting high profile ");
                        createVideoFormat.setInteger("profile", 8);
                        createVideoFormat.setInteger("level", 256);
                    } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                        RXLogging.w("HardwareVideoEncoder", "setting baseline profile ");
                        createVideoFormat.setInteger("profile", 1);
                        createVideoFormat.setInteger("level", 256);
                    } else {
                        RXLogging.w("HardwareVideoEncoder", "Unknown profile level id: " + profile + "default to baseline profile");
                        createVideoFormat.setInteger("profile", 1);
                        createVideoFormat.setInteger("level", 256);
                    }
                }
                createVideoFormat.setInteger("profile", 1);
                createVideoFormat.setInteger("level", 256);
                RXLogging.w("HardwareVideoEncoder", "maxqp:" + this.settings.maxQp + " minqp:" + this.settings.minQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-i-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-i-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-p-min", this.settings.minQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-qp-range.qp-p-max", this.settings.maxQp);
                createVideoFormat.setInteger("vendor.rtc-ext-enc-low-latency.enable", 1);
                if (this.settings.temporalLayerNum > 1) {
                    createVideoFormat.setString("ts-schema", "android.generic." + this.settings.temporalLayerNum);
                }
                RXLogging.e("HardwareVideoEncoder", "Format: ".concat(String.valueOf(createVideoFormat)));
                this.codec.configure(createVideoFormat, null, null, 1);
                if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    RXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
                } else if (this.useSurfaceMode) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    EglBase14 eglBase14 = new EglBase14(this.sharedContext, EglBase.CONFIG_RECORDABLE);
                    this.textureEglBase = eglBase14;
                    eglBase14.createSurface(this.textureInputSurface);
                    this.textureEglBase.makeCurrent();
                }
                this.codec.start();
                this.running = true;
                this.outputThreadChecker.detachThread();
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                return VideoCodecStatus.OK;
            } catch (Exception e2) {
                RXLogging.e("HardwareVideoEncoder", "initEncodeInternal failed", e2);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e3) {
            RXLogging.e("HardwareVideoEncoder", "Cannot create media encoder " + this.codecName, e3);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deliverEncodedImage() {
        /*
        // Method dump skipped, instructions count: 368
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.deliverEncodedImage():void");
    }

    private boolean shouldForceKeyFrame(long j2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j3 = this.forcedKeyFrameNs;
        if (j3 <= 0 || j2 <= this.lastKeyFrameNs + j3) {
            return false;
        }
        return true;
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Exception e2) {
            RXLogging.e("HardwareVideoEncoder", "encodeTexture failed", e2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void requestKeyFrame(long j2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j2;
        } catch (Exception e2) {
            RXLogging.e("HardwareVideoEncoder", "requestKeyFrame failed", e2);
        }
    }

    private VideoCodecStatus updateBitrate(int i2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i2);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (Exception e2) {
            RXLogging.e("HardwareVideoEncoder", "updateBitrate failed", e2);
            return VideoCodecStatus.ERROR;
        }
    }

    /* access modifiers changed from: protected */
    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(int i2, int i3) {
        this.encodeThreadChecker.checkIsOnValidThread();
        updateBitrate(i2);
        return VideoCodecStatus.OK;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (shouldForceKeyFrame(r7.getTimestampNs()) != false) goto L_0x0046;
     */
    @Override // org.webrtc.VideoEncoder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.encode(org.webrtc.VideoFrame, boolean):org.webrtc.VideoCodecStatus");
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings2, VideoEncoder.Callback callback2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback2;
        this.automaticResizeOn = true;
        this.width = settings2.width;
        this.height = settings2.height;
        this.scaleMode = settings2.scaleMode;
        if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            RXLogging.e("HardwareVideoEncoder", "using pass surface mode");
            this.useSurfaceMode = true;
        } else {
            this.useSurfaceMode = canUseSurface();
        }
        this.settings = settings2;
        RXLogging.i("HardwareVideoEncoder", "initEncode: " + this.width + " x " + this.height + ". @ " + settings2.targetBps + "kbps. Fps: " + settings2.targetFps + " Use surface mode: " + this.useSurfaceMode);
        return initEncodeInternal();
    }

    private VideoCodecStatus resetCodec(int i2, int i3, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i2;
        this.height = i3;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, VideoFrame.Buffer buffer, int i2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long timestampNs = videoFrame.getTimestampNs() / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                RXLogging.i("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i2, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (Exception e2) {
                    RXLogging.e("HardwareVideoEncoder", "queueInputBuffer failed", e2);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Exception e3) {
                RXLogging.e("HardwareVideoEncoder", "getInputBuffers failed", e3);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e4) {
            RXLogging.e("HardwareVideoEncoder", "dequeueInputBuffer failed", e4);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, RXVideoCodecDesc rXVideoCodecDesc, Integer num, Integer num2, int i2, int i3, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
        this.codecName = str;
        this.codecDesc = rXVideoCodecDesc;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.keyFrameIntervalSec = i2;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i3);
        this.sharedContext = context;
        threadChecker.detachThread();
    }
}
