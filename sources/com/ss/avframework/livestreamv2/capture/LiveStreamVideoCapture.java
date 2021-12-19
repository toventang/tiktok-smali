package com.ss.avframework.livestreamv2.capture;

import android.content.Context;
import android.content.Intent;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.SurfaceTextureHelper;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.audio.AudioRecordThread;
import com.ss.avframework.capture.video.ExternalVideoCapturer;
import com.ss.avframework.capture.video.ScreenVideoCaptureWithInnerRecord;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.VideoFrameStatics;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.utils.PrivacyCertManager;
import com.ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public class LiveStreamVideoCapture extends VideoCapturer implements VideoCapturer.VideoCapturerObserver, IVideoCapturerControl {
    public int mAdaptedHeight;
    public int mAdaptedWidth;
    public int mAvalidFps;
    private final BGMHandler mBGMHandler;
    public long mBGMTimestampDeltaUs;
    public int mBGMode;
    public Runnable mBackgroundPushVideoFrameRunable;
    public int mBackgroundTex;
    public boolean mBgPushWithAdaptedResolution;
    private Bundle mCameraParams;
    private boolean mCameraSwitchInternal;
    public Context mContext;
    public GlRenderDrawer mDrawer;
    private boolean mDropFrameDisable;
    private JSONObject mDumpVideoParams;
    public int mFps;
    private GLThread mGlThread;
    public Handler mHandler;
    public int mHeight;
    private boolean mHorizontalMirror;
    public boolean mIsResume;
    public long mLastTimestamp;
    public Observer mObserver;
    public int mOesTex;
    public int mSaveDevicesIdWhenToBack;
    public Intent mScreenIntent;
    private int mSource;
    public final Object mStatFence;
    public int mStatus;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private SwitchCaptureRunnable mSwitchCaptureRunnable;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public ThreadUtils.ThreadChecker mThreadChecker;
    private boolean mVerticalMirror;
    public VideoCapturer mVideoCapturer;
    public int mWidth;

    public interface Observer {
        static {
            Covode.recordClassIndex(100018);
        }

        void onVideoCaptureError(int i2, Exception exc);

        void onVideoCaptureStarted();

        void onVideoCaptureStoped();
    }

    /* access modifiers changed from: package-private */
    public class RadioModeWrapper extends ExternalVideoCapturer {
        private long mConstIntervalMs;
        private int mRadioModeCaptureFps = 30;
        private Runnable mRadioModePushVideoFrameRunnable;

        static {
            Covode.recordClassIndex(100019);
        }

        @Override // com.ss.avframework.capture.video.VideoCapturer
        public float getInCapFps() {
            return (float) this.mRadioModeCaptureFps;
        }

        @Override // com.ss.avframework.capture.video.ExternalVideoCapturer, com.ss.avframework.capture.video.VideoCapturer
        public void stop() {
            super.stop();
            LiveStreamVideoCapture.this.mHandler.removeCallbacks(this.mRadioModePushVideoFrameRunnable);
            AVLog.iod("LiveStreamVideoCapture", "RadioModeVideoCapture stopped");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$new$0$LiveStreamVideoCapture$RadioModeWrapper() {
            int i2;
            int i3;
            MethodCollector.i(13666);
            synchronized (LiveStreamVideoCapture.this.mStatFence) {
                try {
                    LiveStreamVideoCapture.this.mHandler.removeCallbacks(this.mRadioModePushVideoFrameRunnable);
                    if (LiveStreamVideoCapture.this.mIsResume && status() == 1) {
                        long nanoTime = TimeUtils.nanoTime() / 1000;
                        long j2 = (nanoTime - LiveStreamVideoCapture.this.mLastTimestamp) / 1000;
                        long j3 = this.mConstIntervalMs;
                        if (j2 < j3) {
                            LiveStreamVideoCapture.this.mHandler.postDelayed(this.mRadioModePushVideoFrameRunnable, j3 - j2);
                            MethodCollector.o(13666);
                            return;
                        }
                        if (LiveStreamVideoCapture.this.mBgPushWithAdaptedResolution) {
                            i2 = LiveStreamVideoCapture.this.mAdaptedWidth;
                        } else {
                            i2 = LiveStreamVideoCapture.this.mWidth;
                        }
                        if (LiveStreamVideoCapture.this.mBgPushWithAdaptedResolution) {
                            i3 = LiveStreamVideoCapture.this.mAdaptedHeight;
                        } else {
                            i3 = LiveStreamVideoCapture.this.mHeight;
                        }
                        pushVideoFrame(LiveStreamVideoCapture.this.mBackgroundTex, false, i2, i3, 0, null, nanoTime, null, TimeUtils.currentTimeMs());
                        LiveStreamVideoCapture.this.mHandler.post(this.mRadioModePushVideoFrameRunnable);
                        MethodCollector.o(13666);
                    }
                } finally {
                    MethodCollector.o(13666);
                }
            }
        }

        public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
            if (glRenderDrawer == null || glTextureFrameBuffer == null) {
                return true;
            }
            ThreadUtils.invokeAtFrontUninterruptibly(LiveStreamVideoCapture.this.mHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.RadioModeWrapper.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100021);
                }

                public void run() {
                    glTextureFrameBuffer.setSize(LiveStreamVideoCapture.this.mWidth, LiveStreamVideoCapture.this.mHeight);
                    GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                    glRenderDrawer.drawRgb(LiveStreamVideoCapture.this.mBackgroundTex, null, null, 0, 0, LiveStreamVideoCapture.this.mWidth, LiveStreamVideoCapture.this.mHeight);
                    if (GLThreadManager.isNeedFinish()) {
                        GLES20.glFinish();
                    } else {
                        GLES20.glFlush();
                    }
                    GlUtil.checkNoGLES2Error("copy radio frame failed with background.");
                    GLES20.glBindFramebuffer(36160, 0);
                }
            });
            return true;
        }

        RadioModeWrapper(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler) {
            super(videoCapturerObserver, handler);
            LiveStreamVideoCapture.this.clearBackgroundTex();
            this.mConstIntervalMs = (long) (1000 / this.mRadioModeCaptureFps);
            this.mRadioModePushVideoFrameRunnable = new LiveStreamVideoCapture$RadioModeWrapper$$Lambda$0(this);
        }

        @Override // com.ss.avframework.capture.video.ExternalVideoCapturer, com.ss.avframework.capture.video.VideoCapturer
        public void start(int i2, int i3, int i4) {
            super.start(i2, i3, i4);
            LiveStreamVideoCapture.this.mWidth = i2;
            LiveStreamVideoCapture.this.mHeight = i3;
            this.mFps = i4;
            this.mRadioModeCaptureFps = i4;
            this.mConstIntervalMs = (long) (1000 / i4);
            LiveStreamVideoCapture.this.mHandler.post(this.mRadioModePushVideoFrameRunnable);
            AVLog.iod("LiveStreamVideoCapture", "RadioModeVideoCapture started: width:" + i2 + " height" + i3 + " fps:" + i4);
        }

        @Override // com.ss.avframework.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
            return LiveStreamVideoCapture.this.onFrame(buffer, i2, i3, i4, j2);
        }
    }

    static {
        Covode.recordClassIndex(100001);
    }

    public IVideoCapturerControl getISPControl() {
        return this;
    }

    public int getAdaptedFps() {
        return this.mAvalidFps;
    }

    public int getAdaptedHeight() {
        return this.mAdaptedHeight;
    }

    public int getAdaptedWidth() {
        return this.mAdaptedWidth;
    }

    public int getBackgroundPolicy() {
        return this.mBGMode;
    }

    public int getCurrentCaptureDevice() {
        return this.mSource;
    }

    public long getCurrentCaptureTimestamp() {
        return this.mLastTimestamp;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // com.ss.avframework.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    /* access modifiers changed from: package-private */
    public class ExternWrapper extends ExternalVideoCapturer {
        private VideoFrameStatics mRealRateStatics = new VideoFrameStatics(1000);
        public int mRotation;
        float[] mTexMatrix;

        static {
            Covode.recordClassIndex(100015);
        }

        @Override // com.ss.avframework.capture.video.VideoCapturer
        public float getInCapFps() {
            return this.mRealRateStatics.getRealRatePerSecond();
        }

        @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.capture.video.ExternalVideoCapturer
        public synchronized void release() {
            MethodCollector.i(11318);
            if (this.mBufferAlreadyReturn) {
                GLES20.glFinish();
            } else {
                LiveStreamVideoCapture.this.mHandler.post(new Runnable() {
                    /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(100017);
                    }

                    public void run() {
                        AVLog.iow("LiveStreamVideoCapture", "Release texture on new post.");
                        GLES20.glFinish();
                    }
                });
            }
            super.release();
            MethodCollector.o(11318);
        }

        public int pushLastFrame(long j2) {
            String str;
            GlTextureFrameBuffer glTextureFrameBuffer = LiveStreamVideoCapture.this.mTextureFrameBuffer;
            if (glTextureFrameBuffer == null) {
                return -1;
            }
            int width = glTextureFrameBuffer.getWidth();
            int height = glTextureFrameBuffer.getHeight();
            if (width > 0 && height > 0 && this.mBufferAlreadyReturn) {
                return super.pushVideoFrame(glTextureFrameBuffer.getTextureId(), false, glTextureFrameBuffer.getWidth(), glTextureFrameBuffer.getHeight(), this.mRotation, this.mTexMatrix, j2, null, TimeUtils.currentTimeMs());
            }
            if (this.mBufferAlreadyReturn) {
                str = "never push any frame.";
            } else {
                str = "current texture not return.";
            }
            AVLog.w("LiveStreamVideoCapture", str);
            return -1;
        }

        public ExternWrapper(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler, boolean z) {
            super(videoCapturerObserver, handler);
            enableSigalMode(!z);
        }

        @Override // com.ss.avframework.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
            return LiveStreamVideoCapture.this.onFrame(buffer, i2, i3, i4, j2);
        }

        @Override // com.ss.avframework.capture.video.ExternalVideoCapturer
        public int pushVideoFrame(final int i2, final boolean z, final int i3, final int i4, int i5, float[] fArr, final long j2, final Bundle bundle, long j3) {
            final int[] iArr = {-1};
            this.mRealRateStatics.add();
            if ((this.mBufferAlreadyReturn || !isSigBufferMode()) && this.mStatus == 1 && LiveStreamVideoCapture.this.mStatus == 1) {
                blockingWaitBufferReturn("ExternWrapper push texture");
                this.mRotation = i5;
                this.mTexMatrix = fArr;
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStreamVideoCapture.this.mHandler, new Runnable() {
                    /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(100016);
                    }

                    public void run() {
                        if (LiveStreamVideoCapture.this.mTextureFrameBuffer == null || LiveStreamVideoCapture.this.mDrawer == null) {
                            AVLog.logToIODevice2(5, "LiveStreamVideoCapture", "drop frame: mTextureFrameBuffer " + LiveStreamVideoCapture.this.mTextureFrameBuffer + ", mDrawer " + LiveStreamVideoCapture.this.mDrawer, null, "ExternWrapper.pushVideoFrame2", 10000);
                            return;
                        }
                        if (!(LiveStreamVideoCapture.this.mTextureFrameBuffer.getHeight() == i4 && LiveStreamVideoCapture.this.mTextureFrameBuffer.getWidth() == i3)) {
                            try {
                                LiveStreamVideoCapture.this.mTextureFrameBuffer.setSize(i3, i4);
                            } catch (Exception e2) {
                                AVLog.logToIODevice2(6, "LiveStreamVideoCapture", "drop frame: textureFrameBuffer setSize failed (" + e2.getMessage() + ") w " + i3 + " h " + i4, null, "ExternWrapper.pushVideoFrame3", 10000);
                                Observer observer = LiveStreamVideoCapture.this.mObserver;
                                if (observer != null) {
                                    observer.onVideoCaptureError(-200, e2);
                                    return;
                                }
                                return;
                            }
                        }
                        GLES20.glBindFramebuffer(36160, LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId());
                        try {
                            GlUtil.checkNoGLES2Error("bindFrameBuffer failed");
                            if (i2 <= 0) {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                GLES20.glClear(16384);
                            } else if (z) {
                                LiveStreamVideoCapture.this.mDrawer.drawOes(i2, null, null, 0, 0, i3, i4);
                            } else {
                                LiveStreamVideoCapture.this.mDrawer.drawRgb(i2, null, null, 0, 0, i3, i4);
                            }
                            GLES20.glFlush();
                            GLES20.glBindFramebuffer(36160, 0);
                            try {
                                GlUtil.checkNoGLES2Error("drawer is error.");
                                int[] iArr = iArr;
                                ExternWrapper externWrapper = ExternWrapper.this;
                                iArr[0] = ExternWrapper.super.pushVideoFrame(LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId(), false, i3, i4, ExternWrapper.this.mRotation, ExternWrapper.this.mTexMatrix, j2, bundle, TimeUtils.currentTimeMs());
                            } catch (Throwable unused) {
                                AVLog.logToIODevice2(6, "LiveStreamVideoCapture", "drop frame: Drawer is error with ignore frame timestamp " + j2, null, "ExternWrapper.pushVideoFrame5", 10000);
                            }
                        } catch (Throwable unused2) {
                            AVLog.logToIODevice2(6, "LiveStreamVideoCapture", "drop frame: bindFrameBuffer faild (tex:" + LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId() + " fb:" + LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId() + " w:" + i3 + " h:" + i4, null, "ExternWrapper.pushVideoFrame4", 10000);
                        }
                    }
                });
                return iArr[0];
            }
            AVLog.logToIODevice2(5, "LiveStreamVideoCapture", "drop frame: mBufferAlreadyReturn " + this.mBufferAlreadyReturn + ", mStatus " + this.mStatus + ", LiveStreamVideoCapture.this.mStatus " + LiveStreamVideoCapture.this.mStatus, null, "ExternWrapper.pushVideoFrame1", 10000);
            return iArr[0];
        }
    }

    public boolean backgroundMode() {
        if (!this.mIsResume) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class ScreenWrapper extends ScreenVideoCaptureWithInnerRecord {
        private long mBaseTime;
        private long mLastTime;
        private VideoDumpProxy.RawVideoDumperProxy mRawVideoDumper;
        private VideoFrameStatics mRealRateStatics = new VideoFrameStatics(1000);
        public float[] mTexMatrix;

        static {
            Covode.recordClassIndex(100022);
        }

        private void dumpScreenVideo(int i2, int i3, int i4, int i5) {
        }

        /* access modifiers changed from: package-private */
        public void setDumpFrameParams(JSONObject jSONObject) {
        }

        @Override // com.ss.avframework.capture.video.VideoCapturer
        public float getInCapFps() {
            VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
            if (videoFrameStatics != null) {
                return videoFrameStatics.getRealRatePerSecond();
            }
            return 0.0f;
        }

        public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
            if (glRenderDrawer == null || glTextureFrameBuffer == null) {
                return false;
            }
            ThreadUtils.invokeAtFrontUninterruptibly(LiveStreamVideoCapture.this.mHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ScreenWrapper.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100023);
                }

                public void run() {
                    SurfaceTextureHelper surfaceTextureHelper = ScreenWrapper.this.surfaceTextureHelper;
                    if (surfaceTextureHelper != null) {
                        if (ScreenWrapper.this.mTexMatrix == null) {
                            ScreenWrapper.this.mTexMatrix = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
                        }
                        glTextureFrameBuffer.setSize(ScreenWrapper.this.width, ScreenWrapper.this.height);
                        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                        glRenderDrawer.drawOes(surfaceTextureHelper.getTextureId(), null, ScreenWrapper.this.mTexMatrix, 0, 0, ScreenWrapper.this.width, ScreenWrapper.this.height);
                        if (GLThreadManager.isNeedFinish()) {
                            GLES20.glFinish();
                        } else {
                            GLES20.glFlush();
                        }
                        GlUtil.checkNoGLES2Error("copy screen frame failed with background.");
                        GLES20.glBindFramebuffer(36160, 0);
                    }
                }
            });
            return false;
        }

        ScreenWrapper(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
            super(intent, videoCapturerObserver);
        }

        @Override // com.ss.avframework.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            dumpScreenVideo(textureBuffer.getTextureId(), textureBuffer.getWidth(), textureBuffer.getHeight(), LiveStreamVideoCapture.this.mFps);
            if (this.mLastTime == 0) {
                this.mLastTime = j2;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j2);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
            if (videoFrameStatics != null) {
                videoFrameStatics.add();
            }
            long j3 = this.mBaseTime + (j2 - this.mLastTime);
            this.mBaseTime = j3;
            this.mLastTime = j2;
            return LiveStreamVideoCapture.this.onFrame(buffer, i2, i3, i4, j3);
        }
    }

    private CameraVideoCapturer getCameraHandler() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer == null || !(videoCapturer instanceof CameraVideoCapturer)) {
            return null;
        }
        return (CameraVideoCapturer) videoCapturer;
    }

    /* access modifiers changed from: private */
    /* renamed from: stopVideoCapturer */
    public void bridge$lambda$0$LiveStreamVideoCapture() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public void cancelAudioFocus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.cancelAudioFocus();
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public void cancelAutoFocus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.cancelAudioFocus();
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public boolean currentSupportISPControl() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler == null || !cameraHandler.currentSupportISPControl()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public IVideoCapturerControl.Range getExposureCompensationRange() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getExposureCompensationRange();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public float getInCaptureRealFps() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            return videoCapturer.getInCapFps();
        }
        return 0.0f;
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public JSONObject getRealCameraStatus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getRealCameraStatus();
        }
        return null;
    }

    public int getValidCaptureFps() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getValidCaptureFps();
        }
        return this.mFps;
    }

    private void onToExtern() {
        bridge$lambda$0$LiveStreamVideoCapture();
        this.mVideoCapturer = new ExternWrapper(this, this.mHandler, this.mDropFrameDisable);
        setupMirror();
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    private void onToRadioMode() {
        bridge$lambda$0$LiveStreamVideoCapture();
        this.mVideoCapturer = new RadioModeWrapper(this, this.mHandler);
        setupMirror();
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    public void clearBackgroundTex() {
        if (this.mBackgroundTex == 0) {
            int generateTexture = GlUtil.generateTexture(3553);
            this.mBackgroundTex = generateTexture;
            GLES20.glBindTexture(3553, generateTexture);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public class SwitchCaptureRunnable implements Runnable {
        public PrivacyCertManager.CertUnit mCert;
        public int mDevice;
        public Intent mIntent;

        static {
            Covode.recordClassIndex(100025);
        }

        public void run() {
            PrivacyCertManager.getInstance().saveCert(0, this.mCert);
            LiveStreamVideoCapture.this.mScreenIntent = this.mIntent;
            LiveStreamVideoCapture.this.mSaveDevicesIdWhenToBack = this.mDevice;
            LiveStreamVideoCapture.this.onSwitchVideoCapturer(this.mDevice);
            PrivacyCertManager.getInstance().popCert(0);
        }

        public SwitchCaptureRunnable() {
        }

        public void setDevice(int i2, Intent intent) {
            this.mDevice = i2;
            this.mIntent = intent;
            this.mCert = PrivacyCertManager.getInstance().popCert(0);
        }
    }

    private void onToScreen() {
        bridge$lambda$0$LiveStreamVideoCapture();
        ScreenWrapper screenWrapper = new ScreenWrapper(this.mScreenIntent, this);
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        SurfaceTextureSharedHandler surfaceTextureSharedHandler = new SurfaceTextureSharedHandler(this.mHandler);
        this.mSurfaceTextureHelper = surfaceTextureSharedHandler;
        screenWrapper.initialize(surfaceTextureSharedHandler, this.mContext);
        this.mVideoCapturer = screenWrapper;
        screenWrapper.setDumpFrameParams(this.mDumpVideoParams);
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStarted() {
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.onVideoCaptureStarted();
        }
        AVLog.logKibana(5, "LiveStreamVideoCapture", "onVideoCaptureStarted,device:" + this.mSource, null);
        AVLog.iow("LiveStreamVideoCapture", "onVideoCaptureStarted, device:" + this.mSource + ", status:" + this.mStatus);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStoped() {
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.onVideoCaptureStoped();
        }
        AVLog.logKibana(5, "LiveStreamVideoCapture", "onVideoCaptureStopped,device:" + this.mSource, null);
        AVLog.iow("LiveStreamVideoCapture", "onVideoCaptureStopped,device:" + this.mSource + ", status:" + this.mStatus);
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(14111);
        stop();
        Handler handler = this.mHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(100011);
                }

                public void run() {
                    if (LiveStreamVideoCapture.this.mOesTex > 0) {
                        GLES20.glDeleteTextures(0, new int[]{LiveStreamVideoCapture.this.mOesTex}, 0);
                        LiveStreamVideoCapture.this.mOesTex = 0;
                    }
                    if (LiveStreamVideoCapture.this.mBackgroundTex != 0) {
                        GLES20.glDeleteTextures(1, new int[]{LiveStreamVideoCapture.this.mBackgroundTex}, 0);
                    }
                    if (LiveStreamVideoCapture.this.mTextureFrameBuffer != null) {
                        LiveStreamVideoCapture.this.mTextureFrameBuffer.release();
                        LiveStreamVideoCapture.this.mTextureFrameBuffer = null;
                    }
                    if (LiveStreamVideoCapture.this.mDrawer != null) {
                        LiveStreamVideoCapture.this.mDrawer.release();
                        LiveStreamVideoCapture.this.mDrawer = null;
                    }
                    LiveStreamVideoCapture.this.mObserver = null;
                }
            });
        }
        SafeHandlerThreadPoolExecutor.unlockThread(this.mGlThread);
        super.release();
        MethodCollector.o(14111);
    }

    private void setupMirror() {
        String str;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && (videoCapturer instanceof ExternalVideoCapturer)) {
            String str2 = "setupMirror: mHorizontalMirror " + this.mHorizontalMirror + ", mVerticalMirror " + this.mVerticalMirror + ". ";
            if (videoCapturer instanceof CameraVideoCapturer) {
                StringBuilder append = new StringBuilder().append(str2).append("With ");
                if (((CameraVideoCapturer) videoCapturer).isBackCam()) {
                    str = "back camera. ";
                } else {
                    str = "front camera. ";
                }
                str2 = append.append(str).toString();
            }
            AVLog.logToIODevice(4, "LiveStreamVideoCapture", str2, new Throwable());
            ExternalVideoCapturer externalVideoCapturer = (ExternalVideoCapturer) videoCapturer;
            externalVideoCapturer.enableMirror(this.mHorizontalMirror, true);
            externalVideoCapturer.enableMirror(this.mVerticalMirror, false);
        }
    }

    public void pause() {
        MethodCollector.i(14019);
        synchronized (this.mStatFence) {
            try {
                AVLog.iod("LiveStreamVideoCapture", "Pause capture, status " + status());
                this.mIsResume = false;
                if (this.mBGMode == 2) {
                    this.mHandler.post(new Runnable() {
                        /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(100010);
                        }

                        public void run() {
                            if (LiveStreamVideoCapture.this.mVideoCapturer instanceof CameraWrapper) {
                                ((CameraVideoCapturer) LiveStreamVideoCapture.this.mVideoCapturer).copyCurrentFrame(LiveStreamVideoCapture.this.mDrawer, LiveStreamVideoCapture.this.mTextureFrameBuffer);
                            } else if (LiveStreamVideoCapture.this.mVideoCapturer instanceof ScreenWrapper) {
                                ((ScreenWrapper) LiveStreamVideoCapture.this.mVideoCapturer).copyCurrentFrame(LiveStreamVideoCapture.this.mDrawer, LiveStreamVideoCapture.this.mTextureFrameBuffer);
                            } else if (LiveStreamVideoCapture.this.mVideoCapturer instanceof RadioModeWrapper) {
                                ((RadioModeWrapper) LiveStreamVideoCapture.this.mVideoCapturer).copyCurrentFrame(LiveStreamVideoCapture.this.mDrawer, LiveStreamVideoCapture.this.mTextureFrameBuffer);
                            }
                        }
                    });
                }
                this.mBGMHandler.removeMessages(10001);
                BgmMessageBundle bgmMessageBundle = new BgmMessageBundle();
                bgmMessageBundle.screenIntent = this.mScreenIntent;
                bgmMessageBundle.videoCert = PrivacyCertManager.getInstance().popCert(0);
                this.mBGMHandler.sendMessage(this.mBGMHandler.obtainMessage(10001, 0, 0, bgmMessageBundle));
            } finally {
                MethodCollector.o(14019);
            }
        }
    }

    public void resume() {
        MethodCollector.i(13974);
        synchronized (this.mStatFence) {
            try {
                AVLog.iod("LiveStreamVideoCapture", "Resume capture, status " + status());
                this.mIsResume = true;
                this.mBGMHandler.removeMessages(10001);
                BgmMessageBundle bgmMessageBundle = new BgmMessageBundle();
                bgmMessageBundle.screenIntent = this.mScreenIntent;
                bgmMessageBundle.videoCert = PrivacyCertManager.getInstance().popCert(0);
                this.mBGMHandler.sendMessage(this.mBGMHandler.obtainMessage(10001, 1, 0, bgmMessageBundle));
            } finally {
                MethodCollector.o(13974);
            }
        }
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void stop() {
        MethodCollector.i(14074);
        synchronized (this.mStatFence) {
            try {
                if (this.mStatus != 2) {
                    this.mStatus = 2;
                    this.mBGMHandler.removeMessages(10001);
                    this.mHandler.removeCallbacks(this.mSwitchCaptureRunnable);
                    this.mHandler.removeCallbacks(this.mBackgroundPushVideoFrameRunable);
                    this.mHandler.post(new PrivacyCertManager.RunnableWithCert(new LiveStreamVideoCapture$$Lambda$0(this), new int[]{0}));
                    MethodCollector.o(14074);
                }
            } finally {
                MethodCollector.o(14074);
            }
        }
    }

    public void setBackgroundPolicy(int i2) {
        this.mBGMode = i2;
    }

    public void updateScreenIntent(Intent intent) {
        this.mScreenIntent = intent;
    }

    class BgmMessageBundle {
        Intent screenIntent;
        PrivacyCertManager.CertUnit videoCert;

        static {
            Covode.recordClassIndex(100013);
        }

        BgmMessageBundle() {
        }
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
        this.mDumpVideoParams = jSONObject;
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.setDumpFrameParams(jSONObject);
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int setExposureCompensation(float f2) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setExposureCompensation(f2);
        }
        return -1;
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int toggleFlashLight(boolean z) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.toggleFlashLight(z);
        }
        return -1;
    }

    public void setBackGroundPhotoPath(final Object obj) {
        if (this.mWidth == 0 || this.mHeight == 0) {
            AVLog.ioe("LiveStreamVideoCapture", "setBackgroundPhotoPath failed. Size is 0");
        } else {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(100005);
                }

                public void run() {
                    LiveStreamVideoCapture.this.doSetBackGroundPhotoPath(obj);
                }
            });
        }
    }

    public static long guessFrameTimestampDiffUs(long j2) {
        long currentTimeMillis = (System.currentTimeMillis() * 1000) - j2;
        if (Math.abs(currentTimeMillis) < 5000000) {
            return currentTimeMillis;
        }
        long nanoTime = (System.nanoTime() / 1000) - j2;
        if (Math.abs(nanoTime) < 5000000) {
            return nanoTime;
        }
        return 0;
    }

    class BGMHandler extends Handler {
        static {
            Covode.recordClassIndex(100012);
        }

        public void handleMessage(Message message) {
            boolean z;
            if (message.obj instanceof BgmMessageBundle) {
                BgmMessageBundle bgmMessageBundle = (BgmMessageBundle) message.obj;
                LiveStreamVideoCapture.this.mScreenIntent = bgmMessageBundle.screenIntent;
                PrivacyCertManager.getInstance().saveCert(0, bgmMessageBundle.videoCert);
            }
            if (message.what == 10001) {
                if (message.arg1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                LiveStreamVideoCapture.this.mBGMTimestampDeltaUs = 0;
                if (!z) {
                    LiveStreamVideoCapture.this.onSwitchVideoCapturer(4);
                    if (LiveStreamVideoCapture.this.mBGMode != 4) {
                        LiveStreamVideoCapture.this.mBGMTimestampDeltaUs = (System.nanoTime() / 1000) - LiveStreamVideoCapture.this.mLastTimestamp;
                        LiveStreamVideoCapture.this.mHandler.post(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                    }
                } else {
                    LiveStreamVideoCapture.this.mHandler.removeCallbacks(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                    if (LiveStreamVideoCapture.this.mSaveDevicesIdWhenToBack != 0) {
                        LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                        liveStreamVideoCapture.onSwitchVideoCapturer(liveStreamVideoCapture.mSaveDevicesIdWhenToBack);
                    }
                }
            }
            PrivacyCertManager.getInstance().popCert(0);
        }

        public BGMHandler(Looper looper) {
            super(looper);
        }
    }

    private void onToCamBack(boolean z) {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer == null || !(videoCapturer instanceof CameraVideoCapturer) || ((CameraVideoCapturer) videoCapturer).isBackCam() != z) {
            boolean z2 = this.mCameraParams.getBoolean("useCamera2API");
            VideoCapturer videoCapturer2 = this.mVideoCapturer;
            if (videoCapturer2 == null || !(videoCapturer2 instanceof CameraVideoCapturer) || !this.mCameraSwitchInternal || z2) {
                bridge$lambda$0$LiveStreamVideoCapture();
                if (this.mOesTex == 0) {
                    ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                        /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(100006);
                        }

                        public void run() {
                            LiveStreamVideoCapture.this.mOesTex = GlUtil.generateTexture(36197);
                        }
                    });
                }
                CameraWrapper cameraWrapper = new CameraWrapper(this.mHandler, !z, this, this.mOesTex, this.mCameraParams);
                cameraWrapper.setDumpFrameParams(this.mDumpVideoParams);
                cameraWrapper.setAdaptedSize(this.mAdaptedWidth, this.mAdaptedHeight);
                this.mVideoCapturer = cameraWrapper;
                setupMirror();
                this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
                return;
            }
            ((CameraVideoCapturer) videoCapturer2).switchCamera();
        }
    }

    public void onSwitchVideoCapturer(int i2) {
        if (i2 != this.mSource || this.mVideoCapturer == null) {
            this.mSource = i2;
            boolean z = true;
            if (i2 != 0) {
                if (this.mStatus == 1) {
                    if (i2 == 1) {
                        z = false;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            onToScreen();
                            return;
                        } else if (i2 == 4) {
                            onToExtern();
                            return;
                        } else if (i2 == 5) {
                            onToRadioMode();
                            return;
                        }
                    }
                    onToCamBack(z);
                    return;
                }
                return;
            }
            bridge$lambda$0$LiveStreamVideoCapture();
            return;
        }
        AVLog.iow("LiveStreamVideoCapture", "Ignore switching to video capture device " + i2 + " which is the same with previous.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        if (r7 != null) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doSetBackGroundPhotoPath(java.lang.Object r15) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.doSetBackGroundPhotoPath(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    public class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
        static {
            Covode.recordClassIndex(100024);
        }

        @Override // com.ss.avframework.buffer.SurfaceTextureHelper
        public void handlerExit() {
        }

        public SurfaceTextureSharedHandler(Handler handler) {
            super(handler);
        }
    }

    private void setCameraAdaptedSize(int i2, int i3) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.setAdaptedSize(i2, i3);
        }
    }

    public void enableMirror(boolean z, boolean z2) {
        this.mHandler.post(new LiveStreamVideoCapture$$Lambda$1(this, z2, z));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$enableMirror$0$LiveStreamVideoCapture(boolean z, boolean z2) {
        if (z) {
            this.mHorizontalMirror = z2;
        } else {
            this.mVerticalMirror = z2;
        }
        setupMirror();
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int queryZoomAbility(boolean z, boolean z2) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.queryZoomAbility(z, z2);
        }
        return 0;
    }

    public void registerScreenAudioPlayBack(final AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, final int i2) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100004);
            }

            public void run() {
                if (LiveStreamVideoCapture.this.mVideoCapturer instanceof ScreenVideoCaptureWithInnerRecord) {
                    ((ScreenVideoCaptureWithInnerRecord) LiveStreamVideoCapture.this.mVideoCapturer).setAudioPlayBackObserver(iAudioRecordThreadObserver);
                } else if (i2 > 0) {
                    AVLog.ioe("LiveStreamVideoCapture", "Can not registerScreenAudioPlayBack when not screen capture");
                }
            }
        });
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int startZoom(boolean z, float f2) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.startZoom(z, f2);
        }
        return -1;
    }

    public void switchVideoCaptureDevice(int i2, Intent intent) {
        this.mHandler.removeCallbacks(this.mSwitchCaptureRunnable);
        this.mSwitchCaptureRunnable.setDevice(i2, intent);
        this.mHandler.post(this.mSwitchCaptureRunnable);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerError(int i2, Exception exc) {
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.onVideoCaptureError(i2, exc);
        }
        AVLog.logKibana(5, "LiveStreamVideoCapture", "onVideoCaptureError,code:" + i2 + ",device:" + this.mSource, exc);
        AVLog.iow("LiveStreamVideoCapture", "onVideoCaptureError,code:" + i2 + ",device:" + this.mSource + ", status:" + this.mStatus);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public void start(int i2, int i3, int i4) {
        MethodCollector.i(14021);
        this.mWidth = i2;
        this.mHeight = i3;
        this.mFps = i4;
        synchronized (this.mStatFence) {
            try {
                if (this.mStatus != 1) {
                    this.mStatus = 1;
                    switchVideoCaptureDevice(this.mSource, this.mScreenIntent);
                    MethodCollector.o(14021);
                }
            } finally {
                MethodCollector.o(14021);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int setFocusAreas(int i2, int i3, int i4, int i5) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setFocusAreas(i2, i3, i4, i5);
        }
        return -1;
    }

    @Override // com.ss.avframework.engine.VideoSource
    public void adaptOutputFormat(int i2, int i3, int i4, boolean z) {
        this.mAvalidFps = i4;
        this.mAdaptedWidth = i2;
        this.mAdaptedHeight = i3;
        setCameraAdaptedSize(i2, i3);
        super.nativeAdaptedOutputFormat(this.mAdaptedWidth, this.mAdaptedHeight, this.mAvalidFps, z);
        AVLog.logKibana(5, "LiveStreamVideoCapture", "Adapted output format " + this.mAdaptedWidth + "x" + this.mAdaptedHeight + "@" + i4 + "fps(" + z + ")", null);
    }

    public LiveStreamVideoCapture(int i2, Handler handler, Observer observer, Context context) {
        this.mStatFence = new Object();
        this.mBackgroundTex = 0;
        this.mCameraParams = new Bundle();
        this.mLastTimestamp = 0;
        this.mHorizontalMirror = false;
        this.mVerticalMirror = false;
        this.mSaveDevicesIdWhenToBack = 0;
        this.mBgPushWithAdaptedResolution = true;
        this.mAvalidFps = 0;
        this.mCameraSwitchInternal = true;
        this.mDropFrameDisable = false;
        this.mSource = i2;
        this.mHandler = handler;
        this.mObserver = observer;
        this.mStatus = 0;
        this.mIsResume = true;
        this.mContext = context;
        if (handler == null) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("liveStreamVideoSource");
            this.mGlThread = lockGLThread;
            lockGLThread.start();
            this.mHandler = this.mGlThread.getHandler();
        } else {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(100007);
                }

                public void run() {
                    MethodCollector.i(11315);
                    if (GlUtil.nativeIsOpenGlThread()) {
                        MethodCollector.o(11315);
                        return;
                    }
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Not a gl thread.");
                    MethodCollector.o(11315);
                    throw androidRuntimeException;
                }
            });
        }
        this.mBackgroundPushVideoFrameRunable = new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass5 */

            static {
                Covode.recordClassIndex(100008);
            }

            public void run() {
                int i2;
                int i3;
                int i4;
                MethodCollector.i(11482);
                synchronized (LiveStreamVideoCapture.this.mStatFence) {
                    try {
                        if (!LiveStreamVideoCapture.this.mIsResume && LiveStreamVideoCapture.this.status() == 1) {
                            LiveStreamVideoCapture.this.mHandler.removeCallbacks(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                            if (LiveStreamVideoCapture.this.mAvalidFps != 0) {
                                i2 = LiveStreamVideoCapture.this.mAvalidFps;
                            } else {
                                i2 = LiveStreamVideoCapture.this.mFps;
                            }
                            if (i2 <= 0) {
                                i2 = 30;
                            }
                            long j2 = (long) (1000 / i2);
                            long nanoTime = (System.nanoTime() / 1000) - LiveStreamVideoCapture.this.mBGMTimestampDeltaUs;
                            long j3 = (nanoTime - LiveStreamVideoCapture.this.mLastTimestamp) / 1000;
                            if (j3 < j2) {
                                LiveStreamVideoCapture.this.mHandler.postDelayed(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable, j2 - j3);
                                MethodCollector.o(11482);
                            } else if (!(LiveStreamVideoCapture.this.mVideoCapturer instanceof ExternWrapper)) {
                                LiveStreamVideoCapture.this.mHandler.post(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                                MethodCollector.o(11482);
                            } else if (LiveStreamVideoCapture.this.mBGMode != 2 || ((ExternWrapper) LiveStreamVideoCapture.this.mVideoCapturer).pushLastFrame(nanoTime) < 0) {
                                AVLog.logToIODevice2(5, "LiveStreamVideoCapture", "LiveStreamVideoCapture background push video", null, "LiveStreamVideoCapture.java:mBackgroundPushVideoFrameRunable", 10000);
                                if (LiveStreamVideoCapture.this.mBgPushWithAdaptedResolution) {
                                    i3 = LiveStreamVideoCapture.this.mAdaptedWidth;
                                } else {
                                    i3 = LiveStreamVideoCapture.this.mWidth;
                                }
                                if (LiveStreamVideoCapture.this.mBgPushWithAdaptedResolution) {
                                    i4 = LiveStreamVideoCapture.this.mAdaptedHeight;
                                } else {
                                    i4 = LiveStreamVideoCapture.this.mHeight;
                                }
                                if (LiveStreamVideoCapture.this.mBackgroundTex > 0) {
                                    ((ExternWrapper) LiveStreamVideoCapture.this.mVideoCapturer).pushVideoFrame(LiveStreamVideoCapture.this.mBackgroundTex, false, i3, i4, 0, null, nanoTime, null, TimeUtils.currentTimeMs());
                                } else {
                                    AVLog.logToIODevice2(6, "LiveStreamVideoCapture", "Did not run setBackGroundPhotoPath,push null frame...", null, "LiveStreamVideoCapture.java:NotSetBackGroundPhotoPath", 10000);
                                    ((ExternWrapper) LiveStreamVideoCapture.this.mVideoCapturer).pushVideoFrame(-1, false, i3, i4, 0, null, nanoTime, null, TimeUtils.currentTimeMs());
                                }
                                LiveStreamVideoCapture.this.mHandler.post(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                                MethodCollector.o(11482);
                            } else {
                                LiveStreamVideoCapture.this.mHandler.post(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                                MethodCollector.o(11482);
                            }
                        }
                    } finally {
                        MethodCollector.o(11482);
                    }
                }
            }
        };
        if (this.mHandler == null) {
            this.mHandler = this.mGlThread.getHandler();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass6 */

            static {
                Covode.recordClassIndex(100009);
            }

            public void run() {
                LiveStreamVideoCapture.this.mThreadChecker = new ThreadUtils.ThreadChecker();
                LiveStreamVideoCapture.this.mDrawer = new GlRenderDrawer();
                LiveStreamVideoCapture.this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            }
        });
        this.mBGMHandler = new BGMHandler(this.mHandler.getLooper());
        this.mSwitchCaptureRunnable = new SwitchCaptureRunnable();
    }

    public LiveStreamVideoCapture(int i2, Handler handler, Observer observer, LiveStreamBuilder liveStreamBuilder) {
        this(i2, handler, observer, liveStreamBuilder.getContext());
        int i3;
        this.mCameraSwitchInternal = liveStreamBuilder.isSupportCameraSwitchInternal();
        this.mDropFrameDisable = liveStreamBuilder.isDropFramesDisabled();
        this.mBgPushWithAdaptedResolution = liveStreamBuilder.getPushBase().bgPushWithAdaptedResolution;
        this.mCameraParams.putBoolean("useCamera2API", liveStreamBuilder.isVECamera2API());
        this.mCameraParams.putInt("enableCameraStabilization", liveStreamBuilder.isEnableStabilization());
        this.mCameraParams.putInt("camera_open_retry_cnt", liveStreamBuilder.getCameraOpenRetryCnt());
        this.mCameraParams.putInt("camera_retry_start_preview_cnt", liveStreamBuilder.getCameraRetryStartPreviewCnt());
        Bundle bundle = this.mCameraParams;
        if (liveStreamBuilder.isEnableResetFpsRange()) {
            i3 = liveStreamBuilder.getVideoFps();
        } else {
            i3 = 0;
        }
        bundle.putInt("destFps", i3);
        this.mCameraParams.putBoolean("enableWideFov", liveStreamBuilder.isCameraEnableWideFov());
        this.mCameraParams.putBoolean("enableFallback", liveStreamBuilder.isCameraEnableFallback());
        this.mCameraParams.putBoolean("enableFaceAE", liveStreamBuilder.isCameraEnableFaceAE());
        this.mCameraParams.putBoolean("enableWideAngle", liveStreamBuilder.isCameraEnableWideAngle());
        this.mCameraParams.putInt("cameraFrameFormat", liveStreamBuilder.getCameraFrameFormat());
        this.mCameraParams.putBoolean("isForceCloseCamera", liveStreamBuilder.getIsForceCloseCamera());
        this.mCameraParams.putInt("camera_log_level", liveStreamBuilder.getCameraLogLevel());
        this.mCameraParams.putBoolean("is_camera_open_close_sync", liveStreamBuilder.getCameraOpenCloseSync());
        this.mCameraParams.putString("textureMinFilter", liveStreamBuilder.getCameraTexMinFilter());
        this.mCameraParams.putInt("videoCaptureMinFps", liveStreamBuilder.getVideoCaptureMinFps());
    }

    /* access modifiers changed from: package-private */
    public class CameraWrapper extends CameraVideoCapturer {
        private long mBaseTime;
        private long mLastTime;

        static {
            Covode.recordClassIndex(100014);
        }

        @Override // com.ss.avframework.livestreamv2.capture.CameraVideoCapturer, com.ss.avframework.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
            if (this.mLastTime == 0) {
                this.mLastTime = j2;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j2);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            long j3 = this.mBaseTime + (j2 - this.mLastTime);
            this.mBaseTime = j3;
            this.mLastTime = j2;
            return LiveStreamVideoCapture.this.onFrame(buffer, i2, i3, i4, j3);
        }

        public CameraWrapper(Handler handler, boolean z, VideoCapturer.VideoCapturerObserver videoCapturerObserver, int i2, Bundle bundle) {
            super(handler, z, videoCapturerObserver, LiveStreamVideoCapture.this.mContext, i2, bundle);
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2) {
        VideoCapturer videoCapturer;
        if ((this.mBGMode == 1 || this.mIsResume) && (videoCapturer = this.mVideoCapturer) != null && (videoCapturer instanceof ExternWrapper)) {
            return ((ExternalVideoCapturer) videoCapturer).pushVideoFrame(byteBuffer, i2, i3, i4, TimeUtils.nanoTime() / 1000, TimeUtils.currentTimeMs());
        }
        return -1;
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
        MethodCollector.i(14113);
        try {
            this.mThreadChecker.checkIsOnValidThread();
        } catch (Exception e2) {
            AVLog.w("LiveStreamVideoCapture", e2.toString());
        }
        long j3 = j2 - this.mLastTimestamp;
        if (j3 <= 0) {
            AVLog.logToIODevice2(5, "LiveStreamVideoCapture", "LiveStreamVideoCapture.onFrame drop frame: diffUs ".concat(String.valueOf(j3)), null, "LiveStreamVideoCapture.java:onFrame1", 10000);
            MethodCollector.o(14113);
            return -1;
        }
        this.mLastTimestamp = j2;
        synchronized (this.mStatFence) {
            try {
                if (status() != 1) {
                    String str = "status " + status();
                    AVLog.logToIODevice2(5, "LiveStreamVideoCapture", "LiveStreamVideoCapture.onFrame drop frame: ".concat(String.valueOf(str)), null, "LiveStreamVideoCapture.java:onFrame2: ".concat(String.valueOf(str)), 10000);
                    return -1;
                }
                int onFrame = super.onFrame(buffer, i2, i3, i4, j2);
                MethodCollector.o(14113);
                return onFrame;
            } finally {
                MethodCollector.o(14113);
            }
        }
    }

    public int pushVideoFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, long j2, Bundle bundle) {
        VideoCapturer videoCapturer;
        if ((this.mBGMode == 1 || this.mIsResume) && (videoCapturer = this.mVideoCapturer) != null && (videoCapturer instanceof ExternWrapper)) {
            return ((ExternWrapper) videoCapturer).pushVideoFrame(i2, z, i3, i4, i5, fArr, TimeUtils.nanoTime() / 1000, bundle, TimeUtils.currentTimeMs());
        }
        return -1;
    }
}
