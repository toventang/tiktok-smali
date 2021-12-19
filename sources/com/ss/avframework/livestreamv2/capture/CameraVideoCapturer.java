package com.ss.avframework.livestreamv2.capture;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.i;
import com.ss.android.ttvecamera.j.b;
import com.ss.android.ttvecamera.j.c;
import com.ss.android.ttvecamera.l;
import com.ss.android.ttvecamera.o;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.video.ExternalVideoCapturer;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.livestreamv2.VideoFrameStatics;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.utils.PrivacyCertManager;
import com.ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.avframework.utils.TimeUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class CameraVideoCapturer extends ExternalVideoCapturer implements CameraObserver, IVideoCapturerControl {
    private static final Map<String, Bundle> CAMERA_FEATURES = new HashMap();
    private volatile int mAdaptedHeight;
    private volatile int mAdaptedWidth;
    private int mCameraCaptureHeight;
    private int mCameraCaptureWidth;
    private int mCameraFacing;
    private int mCameraLogLevel = 0;
    private int mCameraOpenRetryCnt = 0;
    private int mCameraRetryStartPreviewCnt = 0;
    public int mCameraType;
    private TECameraCapture mCapture;
    private Context mContext;
    public int mDestFps;
    public int mDisplayRotation;
    public GlRenderDrawer mDrawer;
    private boolean mEnableFaceAE;
    private boolean mEnableFallback;
    private volatile int mEnableMipmap;
    private int mEnableStabilization;
    private int mEnableWideAngle;
    private boolean mEnableWideFov;
    public GlTextureFrameBuffer mFrameBuffer;
    private int mFrameFormat;
    b.a mFrameListener;
    public boolean mGotFirstFrame;
    public Handler mHandler;
    private ByteBuffer mI420Buffer;
    private ByteBuffer mI420RotatedBuffer;
    public boolean mISPExposureStatus = false;
    public boolean mISPFocuseStatus = false;
    public boolean mISPToggleStatus = false;
    private boolean mIsCameraOpenCloseSync = false;
    private boolean mIsForceCloseCamera = false;
    private ByteBuffer mNV21Buffer;
    public boolean mNewTexture;
    private final Object mObject = new Object();
    private VideoCapturer.VideoCapturerObserver mObserver;
    public int mOesTex;
    public GlTextureFrameBuffer mOesTo2DBuffer;
    public GlRenderDrawer mOesTo2DDrawer;
    public long mOpenCameraTimestamp;
    public Bundle mParams;
    private c.a mProviderSettings;
    private VideoDumpProxy.RawVideoDumperProxy[] mRawVideoDumpers;
    public VideoFrameStatics mRealRateStatics;
    private JSONObject mReportStatus;
    public int mRotation;
    public l mSettings;
    private boolean mSkipFirstFrame;
    public SurfaceTexture mSurfaceTexture;
    public float[] mTexMatrix = new float[16];
    private String mTextureMinFilter;
    public ThreadUtils.ThreadChecker mThreadChecker;
    private int mVideoCaptureMinFps;
    private final Object mYuvBufferFence = new Object();
    public int[] mYuvTex = {0, 0, 0};
    private o.b veCameraLog;

    private void checkOesTo2D(int i2, int i3, int i4, int i5) {
    }

    private void checkYuvFrames(ByteBuffer byteBuffer, int i2, int i3, int i4) {
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public boolean currentSupportISPControl() {
        return true;
    }

    public void releaseRawVideoDumpers() {
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    public void tryDeliverYuvFrame(i iVar, long j2) {
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public void cancelAudioFocus() {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                tECameraCapture.cancelFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public void cancelAutoFocus() {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                tECameraCapture.cancelFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public float getInCaptureRealFps() {
        return getInCapFps();
    }

    public boolean isBackCam() {
        if (this.mCameraFacing != 1) {
            return true;
        }
        return false;
    }

    public boolean isCamera2Like() {
        if (this.mCameraType != 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(99959);
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public float getInCapFps() {
        VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
        if (videoFrameStatics != null) {
            return videoFrameStatics.getRealRatePerSecond();
        }
        return 0.0f;
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public IVideoCapturerControl.Range getExposureCompensationRange() {
        l.d cameraECInfo;
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture == null || (cameraECInfo = tECameraCapture.getCameraECInfo()) == null) {
            return null;
        }
        IVideoCapturerControl.Range range = new IVideoCapturerControl.Range();
        range.max = (float) cameraECInfo.f61823a;
        range.min = (float) cameraECInfo.f61825c;
        return range;
    }

    public int getValidCaptureFps() {
        l lVar = this.mSettings;
        if (lVar == null || lVar.f61801d.f61373c <= 0) {
            return 0;
        }
        return this.mSettings.f61801d.f61372b / this.mSettings.f61801d.f61373c;
    }

    @Override // com.ss.avframework.capture.video.ExternalVideoCapturer
    public void returnTexture() {
        this.mThreadChecker.checkIsOnValidThread();
        this.mBufferAlreadyReturn = true;
        if (this.mStatus == 1 && this.mNewTexture) {
            tryDeliverFrame(TimeUtils.currentTimeMs());
        }
    }

    private c.a createProviderSettings() {
        if (this.mFrameListener == null) {
            this.mFrameListener = new b.a(false) {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(99972);
                }

                @Override // com.ss.android.ttvecamera.j.b.a
                public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
                }

                @Override // com.ss.android.ttvecamera.j.b.a
                public void onFrameCaptured(i iVar) {
                    boolean z;
                    long currentTimeMs = TimeUtils.currentTimeMs();
                    if (!CameraVideoCapturer.this.mGotFirstFrame) {
                        CameraVideoCapturer.this.mGotFirstFrame = true;
                        int[] iArr = {CameraVideoCapturer.this.mSettings.f61801d.f61371a / CameraVideoCapturer.this.mSettings.f61801d.f61373c, CameraVideoCapturer.this.mSettings.f61801d.f61372b / CameraVideoCapturer.this.mSettings.f61801d.f61373c};
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("CameraFirstFrameTime(ms)", currentTimeMs - CameraVideoCapturer.this.mOpenCameraTimestamp);
                            if (!CameraVideoCapturer.this.isBackCam()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jSONObject.put("IsFrontCamera", z);
                            jSONObject.put("CameraType", CameraVideoCapturer.this.mCameraType);
                            jSONObject.put("DestFps", CameraVideoCapturer.this.mDestFps);
                            jSONObject.put("FpsRangeStart", iArr[0]);
                            jSONObject.put("FpsRangeEnd", iArr[1]);
                            jSONObject.put("FpsRange", iArr[0] + "," + iArr[1]);
                            jSONObject.put("params", CameraVideoCapturer.this.mParams);
                        } catch (Exception unused) {
                        }
                        AVLog.logKibana(4, "CameraVideoCapturer", jSONObject.toString(), null);
                    }
                    AVLog.logToIODevice2(5, "CameraVideoCapturer", "TECameraProvider onFrameCaptured", null, "CameraVideoCapturer.java:onFrameCaptured", 10000);
                    if (false) {
                        onYuvFrame(iVar, currentTimeMs);
                    } else {
                        onTextureFrame(iVar, currentTimeMs);
                    }
                    VideoFrameStatics videoFrameStatics = CameraVideoCapturer.this.mRealRateStatics;
                    if (videoFrameStatics != null) {
                        videoFrameStatics.add();
                    }
                }

                private void onYuvFrame(i iVar, long j2) {
                    CameraVideoCapturer.this.tryDeliverYuvFrame(iVar, j2);
                }

                private void onTextureFrame(i iVar, final long j2) {
                    if (!CameraVideoCapturer.this.isCamera2Like()) {
                        int i2 = iVar.f61568c.f61592f;
                        if (!(iVar.f61568c.f61594h == 0 || CameraVideoCapturer.this.mDisplayRotation == 0)) {
                            i2 = (i2 + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
                        }
                        CameraVideoCapturer.this.mRotation = i2;
                    } else {
                        int i3 = 0;
                        if (CameraVideoCapturer.this.mDisplayRotation == 1 || CameraVideoCapturer.this.mDisplayRotation == 3) {
                            i3 = (CameraVideoCapturer.this.mDisplayRotation - 2) * 90;
                        } else if (CameraVideoCapturer.this.mDisplayRotation == 2) {
                            i3 = LiveFeedRefreshTimeSetting.DEFAULT;
                        }
                        CameraVideoCapturer.this.mRotation = i3;
                    }
                    if (Thread.currentThread() != CameraVideoCapturer.this.mHandler.getLooper().getThread()) {
                        CameraVideoCapturer.this.mHandler.post(new Runnable() {
                            /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass7.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(99973);
                            }

                            public void run() {
                                CameraVideoCapturer.this.mNewTexture = true;
                                CameraVideoCapturer.this.tryDeliverFrame(j2);
                            }
                        });
                        return;
                    }
                    CameraVideoCapturer.this.mNewTexture = true;
                    CameraVideoCapturer.this.tryDeliverFrame(j2);
                }
            };
        }
        return new c.a(new TEFrameSizei(this.mCameraCaptureWidth, this.mCameraCaptureHeight), this.mFrameListener, true, this.mSurfaceTexture, this.mOesTex);
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.capture.video.ExternalVideoCapturer
    public synchronized void release() {
        MethodCollector.i(11241);
        if (this.mHandler != null) {
            stop();
            this.mHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(99975);
                }

                public void run() {
                    CameraVideoCapturer.this.mFrameListener = null;
                    if (CameraVideoCapturer.this.mSurfaceTexture != null) {
                        CameraVideoCapturer.this.mSurfaceTexture.release();
                        CameraVideoCapturer.this.mSurfaceTexture = null;
                    }
                    CameraVideoCapturer.this.releaseRawVideoDumpers();
                    if (CameraVideoCapturer.this.mOesTo2DBuffer != null) {
                        CameraVideoCapturer.this.mOesTo2DBuffer.release();
                        CameraVideoCapturer.this.mOesTo2DBuffer = null;
                    }
                    if (CameraVideoCapturer.this.mOesTo2DDrawer != null) {
                        CameraVideoCapturer.this.mOesTo2DDrawer.release();
                        CameraVideoCapturer.this.mOesTo2DDrawer = null;
                    }
                    if (CameraVideoCapturer.this.mYuvTex[0] > 0) {
                        GLES20.glDeleteTextures(CameraVideoCapturer.this.mYuvTex.length, CameraVideoCapturer.this.mYuvTex, 0);
                        CameraVideoCapturer.this.mYuvTex = new int[]{0, 0, 0};
                    }
                    if (CameraVideoCapturer.this.mDrawer != null) {
                        CameraVideoCapturer.this.mDrawer.release();
                        CameraVideoCapturer.this.mDrawer = null;
                    }
                    if (CameraVideoCapturer.this.mFrameBuffer != null) {
                        CameraVideoCapturer.this.mFrameBuffer.release();
                        CameraVideoCapturer.this.mFrameBuffer = null;
                    }
                }
            });
        }
        this.mContext = null;
        this.mRealRateStatics = null;
        super.release();
        MethodCollector.o(11241);
    }

    private void checkEnableMipmap() {
        String str = this.mTextureMinFilter;
        int i2 = 1;
        if (str == null || (!str.equals("linear_mipmap_linear") && !this.mTextureMinFilter.equals("linear_mipmap_nearest") && !this.mTextureMinFilter.equals("nearest_mipmap_nearest") && !this.mTextureMinFilter.equals("nearest_mipmap_linear"))) {
            this.mEnableMipmap = 0;
        } else if (this.mOutWidth <= 0 || this.mOutHeight <= 0 || this.mAdaptedWidth <= 0 || this.mAdaptedHeight <= 0) {
            this.mEnableMipmap = -1;
        } else {
            if (this.mOutWidth <= (this.mAdaptedWidth << 1) || this.mOutHeight <= (this.mAdaptedHeight << 1)) {
                i2 = -2;
            }
            this.mEnableMipmap = i2;
        }
    }

    public void switchCamera() {
        int i2;
        int i3;
        try {
            this.mThreadChecker.checkIsOnValidThread();
            AVLog.ioi("CameraVideoCapturer", "switchCamera");
            if (this.mCapture == null) {
                this.mObserver.onVideoCapturerError(-205, new Exception("Capture already release"));
                return;
            }
            int i4 = 1;
            if (status() != 1) {
                AVLog.ioe("CameraVideoCapturer", "Camera no ready.");
                return;
            }
            boolean isBackCam = isBackCam();
            if (this.mEnableWideAngle != 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.mEnableWideAngle = i2;
            if (this.mEnableStabilization != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.mEnableStabilization = i3;
            if (isBackCam) {
                this.mEnableWideAngle = -101;
            }
            if (!isCamera2Like()) {
                this.mEnableWideAngle = -100;
                this.mEnableStabilization = -100;
            }
            if (!isBackCam) {
                if (this.mEnableWideAngle == 1) {
                    i4 = 2;
                } else {
                    i4 = 0;
                }
            }
            this.mCameraFacing = i4;
            checkCameraFeatures(false);
            PrivacyCertManager.switchCameraWithCert(this.mCapture, this.mCameraFacing);
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(99969);
                }

                public void run() {
                    CameraVideoCapturer.this.switchCamera();
                }
            });
        }
    }

    @Override // com.ss.avframework.capture.video.ExternalVideoCapturer, com.ss.avframework.capture.video.VideoCapturer
    public synchronized void stop() {
        MethodCollector.i(10741);
        this.mThreadChecker.checkIsOnValidThread();
        synchronized (this.mObject) {
            try {
                TECameraCapture tECameraCapture = this.mCapture;
                this.mCapture = null;
                if (tECameraCapture != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        PrivacyCertManager.cameraDisconnectWithCert(tECameraCapture);
                        tECameraCapture.stop();
                        String str = "Close TECamera: " + tECameraCapture + " cost time " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
                        AVLog.iod("CameraVideoCapturer", str);
                        AVLog.logKibana(6, "CameraVideoCapturer", str, null);
                    } catch (Throwable th) {
                        String str2 = "Close TECamera fail. cost time " + (System.currentTimeMillis() - currentTimeMillis) + " ms";
                        AVLog.logToIODevice(6, "CameraVideoCapturer", str2, th);
                        AVLog.logKibana(6, "CameraVideoCapturer", str2, th);
                    }
                    l lVar = this.mSettings;
                    if (lVar != null) {
                        lVar.a();
                    }
                }
            } finally {
                MethodCollector.o(10741);
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x010f */
    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject getRealCameraStatus() {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.getRealCameraStatus():org.json.JSONObject");
    }

    class LiveCoreCameraObserver implements TECameraCapture.a {
        private WeakReference<CameraObserver> mCameraObserverWeakReference;

        static {
            Covode.recordClassIndex(99976);
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onCaptureStopped(int i2) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onCaptureStopped(i2);
            }
        }

        public LiveCoreCameraObserver(WeakReference<CameraObserver> weakReference) {
            this.mCameraObserverWeakReference = weakReference;
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onCaptureStarted(int i2, int i3) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onCaptureStarted(i2, i3);
            }
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onError(int i2, String str) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onError(i2, str);
            }
        }

        @Override // com.ss.android.ttvecamera.TECameraCapture.a
        public void onInfo(int i2, int i3, String str) {
            if (this.mCameraObserverWeakReference.get() != null) {
                this.mCameraObserverWeakReference.get().onInfo(i2, i3, str);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.capture.CameraObserver
    public void onCaptureStopped(final int i2) {
        try {
            this.mThreadChecker.checkIsOnValidThread();
            if (this.mProviderSettings != null) {
                this.mProviderSettings = null;
            }
            AVLog.ioi("CameraVideoCapturer", "onCaptureStopped ".concat(String.valueOf(i2)));
            super.stop();
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(99974);
                }

                public void run() {
                    CameraVideoCapturer.this.onCaptureStopped(i2);
                }
            });
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int setExposureCompensation(float f2) {
        TECameraCapture tECameraCapture;
        final int[] iArr = {-1};
        IVideoCapturerControl.Range exposureCompensationRange = getExposureCompensationRange();
        if (exposureCompensationRange != null && ((f2 <= exposureCompensationRange.max || f2 >= exposureCompensationRange.min) && (tECameraCapture = this.mCapture) != null)) {
            try {
                this.mISPExposureStatus = true;
                tECameraCapture.setExposureCompensation((int) f2);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(99962);
                    }

                    public void run() {
                        int i2;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPExposureStatus) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        iArr[0] = i2;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int toggleFlashLight(boolean z) {
        final int[] iArr = {-1};
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                this.mISPToggleStatus = true;
                tECameraCapture.toggleTorch(z);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass10 */

                    static {
                        Covode.recordClassIndex(99961);
                    }

                    public void run() {
                        int i2;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPToggleStatus) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        iArr[0] = i2;
                    }
                });
            } catch (Throwable unused) {
                return iArr[0];
            }
        }
        return iArr[0];
    }

    private void checkCameraFeatures(boolean z) {
        StringBuilder sb;
        if (z) {
            try {
                sb = new StringBuilder().append(this.mSettings.f61800c).append("_").append(this.mSettings.f61802e);
            } catch (Exception e2) {
                AVLog.logToIODevice(6, "CameraVideoCapturer", "queryFeatures fail. ", e2);
                return;
            }
        } else {
            sb = new StringBuilder().append(this.mCameraType).append("_").append(this.mCameraFacing);
        }
        String sb2 = sb.toString();
        Map<String, Bundle> map = CAMERA_FEATURES;
        if (map.get(sb2) == null) {
            if (z) {
                Bundle bundle = new Bundle();
                bundle.putString("camera_support_fps_range", "");
                this.mCapture.queryFeatures(bundle);
                this.mCapture.getCameraAllFeatures(this.mContext, bundle);
                map.put(sb2, bundle);
            } else {
                return;
            }
        } else if (z) {
            return;
        }
        Bundle bundle2 = map.get(sb2);
        if (bundle2 == null) {
            AVLog.ioe("CameraVideoCapturer", "CAMERA_FEATURES[\"" + sb2 + "\"] is null.");
            return;
        }
        checkResetFpsRange(z, bundle2);
        checkStabilizationAndWideAngle(z, bundle2);
    }

    public void tryDeliverFrame(long j2) {
        int i2;
        float f2;
        int i3;
        GlTextureFrameBuffer glTextureFrameBuffer;
        if (this.mStatus != 1 || !this.mNewTexture || !this.mBufferAlreadyReturn) {
            String str = "mStatus " + this.mStatus + ", !mNewTexture " + (!this.mNewTexture) + ", !mBufferAlreadyReturn" + (true ^ this.mBufferAlreadyReturn);
            AVLog.logToIODevice2(5, "CameraVideoCapturer", "CameraVideoCapturer.tryDeliverFrame return: ".concat(String.valueOf(str)), null, "CameraVideoCapturer.java:tryDeliverFrame1: ".concat(String.valueOf(str)), 10000);
            return;
        }
        boolean z = false;
        this.mNewTexture = false;
        try {
            this.mSurfaceTexture.updateTexImage();
            if (!this.mSkipFirstFrame || isCamera2Like()) {
                this.mSurfaceTexture.getTransformMatrix(this.mTexMatrix);
                checkOesTo2D(this.mOesTex, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mFps);
                if (checkGenerateMipmap(this.mOesTex, this.mCameraCaptureWidth, this.mCameraCaptureHeight) && (glTextureFrameBuffer = this.mFrameBuffer) != null && glTextureFrameBuffer.getTextureId() > 0) {
                    z = true;
                }
                if (isCamera2Like()) {
                    Matrix matrix = new Matrix();
                    matrix.preTranslate(0.5f, 0.5f);
                    matrix.preRotate((float) this.mRotation);
                    float f3 = -1.0f;
                    if (this.mHorizontalMirror) {
                        f2 = -1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (!this.mVerticalMirror) {
                        f3 = 1.0f;
                    }
                    matrix.preScale(f2, f3);
                    matrix.preTranslate(-0.5f, -0.5f);
                    matrix.postConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.mTexMatrix));
                    if (z) {
                        i3 = this.mFrameBuffer.getTextureId();
                    } else {
                        i3 = this.mOesTex;
                    }
                    pushVideoFrame(i3, !z, this.mOutWidth, this.mOutHeight, matrix, this.mSurfaceTexture.getTimestamp() / 1000, null, j2);
                    return;
                }
                if (z) {
                    i2 = this.mFrameBuffer.getTextureId();
                } else {
                    i2 = this.mOesTex;
                }
                pushVideoFrame(i2, !z, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mRotation, this.mTexMatrix, this.mSurfaceTexture.getTimestamp() / 1000, null, j2);
                return;
            }
            this.mSkipFirstFrame = false;
        } catch (Throwable th) {
            AVLog.logToIODevice2(6, "CameraVideoCapturer", th.getMessage(), null, "CameraVideoCapturer.java:tryDeliverFrame2", 10000);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAdaptedSize(int i2, int i3) {
        this.mAdaptedWidth = i2;
        this.mAdaptedHeight = i3;
        checkEnableMipmap();
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int startZoom(boolean z, float f2) {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            return tECameraCapture.startZoom(f2, new l.p() {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(99966);
                }

                @Override // com.ss.android.ttvecamera.l.p
                public boolean enableSmooth() {
                    return true;
                }

                @Override // com.ss.android.ttvecamera.l.p
                public void onChange(int i2, float f2, boolean z) {
                    AVLog.iow("CameraVideoCapturer", "cameraType " + i2 + ", zoomValue " + f2 + ", stopped " + z);
                }

                @Override // com.ss.android.ttvecamera.l.p
                public void onZoomSupport(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
                    String str;
                    String str2 = "";
                    String str3 = str2;
                    for (Integer num : list) {
                        int intValue = num.intValue();
                        StringBuilder append = new StringBuilder().append(str3);
                        if (str3.isEmpty()) {
                            str = "[";
                        } else {
                            str = ", ";
                        }
                        str3 = append.append(str).append(intValue).toString();
                    }
                    StringBuilder append2 = new StringBuilder().append(str3);
                    if (!str3.isEmpty()) {
                        str2 = "]";
                    }
                    AVLog.iow("CameraVideoCapturer", "cameraType " + i2 + ", supportZoom " + z + ", supportSmooth " + z2 + ", maxZoom " + f2 + ", ratios " + append2.append(str2).toString());
                }
            });
        }
        return -1;
    }

    private int compareFpsRange(TEFrameRateRange tEFrameRateRange, TEFrameRateRange tEFrameRateRange2) {
        int i2 = tEFrameRateRange.f61372b / tEFrameRateRange.f61373c;
        int i3 = tEFrameRateRange.f61371a / tEFrameRateRange.f61373c;
        int i4 = tEFrameRateRange2.f61372b / tEFrameRateRange2.f61373c;
        int i5 = tEFrameRateRange2.f61371a / tEFrameRateRange2.f61373c;
        if (i2 != i4) {
            return i2 - i4;
        }
        return i3 - i5;
    }

    public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
        final boolean[] zArr = {false};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99968);
            }

            public void run() {
                GlTextureFrameBuffer glTextureFrameBuffer;
                if (CameraVideoCapturer.this.mOesTex > 0 && glRenderDrawer != null && (glTextureFrameBuffer = glTextureFrameBuffer) != null && glTextureFrameBuffer.getFrameBufferId() > 0) {
                    if (!(glTextureFrameBuffer.getWidth() == CameraVideoCapturer.this.mOutWidth && glTextureFrameBuffer.getHeight() == CameraVideoCapturer.this.mOutHeight)) {
                        try {
                            glTextureFrameBuffer.setSize(CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                        } catch (Exception e2) {
                            AVLog.e("CameraVideoCapturer", "frameBuffer setSize failed (" + e2.getMessage() + ") w " + CameraVideoCapturer.this.mOutWidth + " h " + CameraVideoCapturer.this.mOutHeight);
                            return;
                        }
                    }
                    Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix);
                    if (CameraVideoCapturer.this.isCamera2Like()) {
                        CameraVideoCapturer.this.mRotation = 0;
                        if (CameraVideoCapturer.this.mDisplayRotation == 1 || CameraVideoCapturer.this.mDisplayRotation == 3) {
                            CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                            cameraVideoCapturer.mRotation = (cameraVideoCapturer.mDisplayRotation - 2) * 90;
                            CameraVideoCapturer cameraVideoCapturer2 = CameraVideoCapturer.this;
                            cameraVideoCapturer2.mRotation = (cameraVideoCapturer2.mRotation + LiveFeedRefreshTimeSetting.DEFAULT) % 360;
                        } else if (CameraVideoCapturer.this.mDisplayRotation == 2) {
                            CameraVideoCapturer.this.mRotation = LiveFeedRefreshTimeSetting.DEFAULT;
                        }
                    }
                    if (CameraVideoCapturer.this.mRotation != 0) {
                        Matrix matrix = new Matrix();
                        matrix.reset();
                        matrix.preTranslate(0.5f, 0.5f);
                        matrix.preRotate((float) (-CameraVideoCapturer.this.mRotation));
                        matrix.preTranslate(-0.5f, -0.5f);
                        if (convertMatrixToAndroidGraphicsMatrix != null) {
                            if (CameraVideoCapturer.this.isCamera2Like()) {
                                matrix.postConcat(convertMatrixToAndroidGraphicsMatrix);
                            } else {
                                matrix.preConcat(convertMatrixToAndroidGraphicsMatrix);
                            }
                        }
                        convertMatrixToAndroidGraphicsMatrix = matrix;
                    }
                    AVLog.iod("CameraVideoCapturer", "CopyFrame CameraType " + CameraVideoCapturer.this.mSettings.f61800c + " mRotation " + CameraVideoCapturer.this.mRotation + " dpyRotation " + CameraVideoCapturer.this.mDisplayRotation);
                    float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
                    try {
                        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                        glRenderDrawer.drawOes(CameraVideoCapturer.this.mOesTex, null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                        GLES20.glFlush();
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("CameraVideoCapturer.copyCurrentFrame");
                        zArr[0] = true;
                    } catch (Exception e3) {
                        AVLog.ioe("CameraVideoCapturer", "copyCurrentFrame error: " + e3.toString());
                    }
                }
            }
        });
        return zArr[0];
    }

    @Override // com.ss.avframework.livestreamv2.capture.CameraObserver
    public void onError(final int i2, String str) {
        final Exception exc = new Exception(str);
        if (Thread.currentThread() == this.mHandler.getLooper().getThread()) {
            onErrorOnHandler(i2, exc);
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(99970);
                }

                public void run() {
                    CameraVideoCapturer.this.onErrorOnHandler(i2, exc);
                }
            });
        }
    }

    private void checkStabilizationAndWideAngle(boolean z, Bundle bundle) {
        try {
            if (this.mEnableWideAngle == 1 || this.mEnableStabilization == 1) {
                boolean z2 = bundle.getBoolean("device_support_wide_angle");
                boolean z3 = bundle.getBoolean("device_support_anti_shake");
                if (this.mEnableWideAngle == 1 && !z2) {
                    this.mEnableWideAngle = -1;
                }
                if (this.mEnableStabilization == 1 && !z3) {
                    this.mEnableStabilization = -1;
                    this.mSettings.R = false;
                }
                AVLog.iow("CameraVideoCapturer", "Feature support status: stabilization " + this.mEnableStabilization + ", wide angle " + this.mEnableWideAngle);
            }
        } catch (Exception unused) {
        }
    }

    public static Object com_ss_avframework_livestreamv2_capture_CameraVideoCapturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(10582);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(10582);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void onErrorOnHandler(int i2, Exception exc) {
        switch (i2) {
            case -417:
            case -416:
                this.mISPToggleStatus = false;
                return;
            case -415:
            case -414:
            case -413:
                this.mISPExposureStatus = false;
                return;
            case -412:
            case -411:
                this.mISPFocuseStatus = false;
                return;
            default:
                this.mStatus = 2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("TECaptureError", i2);
                    jSONObject.put("params", this.mParams);
                } catch (Exception unused) {
                }
                if (this.mCameraOpenRetryCnt <= 0 || i2 != -404) {
                    AVLog.logKibana(6, "CameraVideoCapturer", jSONObject.toString(), exc);
                    this.mObserver.onVideoCapturerError(i2, exc);
                    return;
                }
                return;
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int queryZoomAbility(final boolean z, boolean z2) {
        MethodCollector.i(14454);
        final int[] iArr = {0, 0};
        final Object obj = new Object();
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            iArr[0] = tECameraCapture.queryZoomAbility(new l.p() {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(99965);
                }

                @Override // com.ss.android.ttvecamera.l.p
                public boolean enableSmooth() {
                    return z;
                }

                @Override // com.ss.android.ttvecamera.l.p
                public void onChange(int i2, float f2, boolean z) {
                    AVLog.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: cameraType " + i2 + ", zoomValue " + f2 + ", stopped " + z, null, "CameraVideoCapturer.queryZoomAbility2", 10000);
                }

                @Override // com.ss.android.ttvecamera.l.p
                public void onZoomSupport(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
                    String str;
                    String str2;
                    MethodCollector.i(12795);
                    String str3 = "";
                    for (Integer num : list) {
                        int intValue = num.intValue();
                        StringBuilder append = new StringBuilder().append(str3);
                        if (str3.isEmpty()) {
                            str2 = "[";
                        } else {
                            str2 = ", ";
                        }
                        str3 = append.append(str2).append(intValue).toString();
                    }
                    StringBuilder append2 = new StringBuilder().append(str3);
                    if (str3.isEmpty()) {
                        str = "";
                    } else {
                        str = "]";
                    }
                    String sb = append2.append(str).toString();
                    try {
                        synchronized (obj) {
                            try {
                                AVLog.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: cameraType " + i2 + ", supportZoom " + z + ", supportSmooth " + z2 + ", maxZoom " + f2 + ", ratios " + sb, null, "CameraVideoCapturer.queryZoomAbility1", 10000);
                                iArr[1] = (int) f2;
                                obj.notifyAll();
                            } finally {
                                MethodCollector.o(12795);
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        MethodCollector.o(12795);
                    }
                }
            }, z2);
            if (iArr[0] != 0) {
                int abs = Math.abs(iArr[0]) * -1;
                MethodCollector.o(14454);
                return abs;
            }
            try {
                synchronized (obj) {
                    try {
                        obj.wait(500);
                        if (iArr[1] == 0) {
                            AVLog.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: query timeout", null, "CameraVideoCapturer.queryZoomAbility3", 10000);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(14454);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        int i2 = iArr[1];
        MethodCollector.o(14454);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (r9 != 0) goto L_0x00ca;
     */
    @Override // com.ss.avframework.livestreamv2.capture.CameraObserver
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureStarted(final int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.onCaptureStarted(int, int):void");
    }

    private void checkResetFpsRange(boolean z, Bundle bundle) {
        String str;
        String str2;
        MethodCollector.i(11239);
        try {
            int i2 = this.mDestFps;
            if (i2 <= 0) {
                MethodCollector.o(11239);
                return;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("camera_support_fps_range");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                AVLog.ioe("CameraVideoCapturer", "TECameraCapture query CAMERA_SUPPORT_FPS_RANGE get null.");
                MethodCollector.o(11239);
                return;
            }
            TEFrameRateRange tEFrameRateRange = this.mSettings.f61801d;
            String str3 = "";
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                TEFrameRateRange tEFrameRateRange2 = (TEFrameRateRange) it.next();
                int i3 = tEFrameRateRange2.f61372b / tEFrameRateRange2.f61373c;
                int i4 = tEFrameRateRange2.f61371a / tEFrameRateRange2.f61373c;
                if (i3 >= i2 && compareFpsRange(tEFrameRateRange2, tEFrameRateRange) < 0) {
                    tEFrameRateRange = new TEFrameRateRange(i4, i3);
                }
                StringBuilder append = new StringBuilder().append(str3);
                if (str3.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = ", ";
                }
                str3 = append.append(str2).append("(").append(i4).append(", ").append(i3).append(")").toString();
            }
            if (compareFpsRange(tEFrameRateRange, this.mSettings.f61801d) != 0) {
                StringBuilder append2 = new StringBuilder("Dest fps: ").append(this.mDestFps).append(". Fps range list: [").append(str3).append("]. mCapture.setPreviewFpsRange(").append(tEFrameRateRange.f61371a).append(", ").append(tEFrameRateRange.f61372b).append(")");
                if (z) {
                    str = " after ";
                } else {
                    str = " before ";
                }
                AVLog.iow("CameraVideoCapturer", append2.append(str).append("open camera.").toString());
                synchronized (this.mObject) {
                    try {
                        this.mSettings.f61801d = tEFrameRateRange;
                        if (z) {
                            this.mCapture.setPreviewFpsRange(tEFrameRateRange);
                        }
                        this.mFps = tEFrameRateRange.f61372b;
                    } finally {
                        MethodCollector.o(11239);
                    }
                }
                return;
            }
            MethodCollector.o(11239);
        } catch (Exception unused) {
            MethodCollector.o(11239);
        }
    }

    private int genTextureWithInit(int i2, int i3, int i4) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(i2);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6409, i3, i4, 0, 6409, 5121, null);
        return iArr[0];
    }

    private boolean postAndWait(Handler handler, long j2, final Runnable runnable) {
        MethodCollector.i(14452);
        boolean z = false;
        if (!(handler == null || runnable == null || j2 <= 0)) {
            final Object obj = new Object();
            final boolean[] zArr = {false};
            synchronized (obj) {
                try {
                    if (handler.post(new Runnable() {
                        /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass13 */

                        static {
                            Covode.recordClassIndex(99964);
                        }

                        public void run() {
                            MethodCollector.i(11662);
                            runnable.run();
                            zArr[0] = true;
                            synchronized (obj) {
                                try {
                                    obj.notify();
                                } finally {
                                    MethodCollector.o(11662);
                                }
                            }
                        }
                    })) {
                        try {
                            obj.wait(j2);
                        } catch (InterruptedException unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(14452);
                }
            }
            z = zArr[0];
        }
        return z;
    }

    private boolean checkGenerateMipmap(int i2, int i3, int i4) {
        if (this.mEnableMipmap <= 0) {
            return false;
        }
        if (this.mFrameBuffer == null) {
            GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mFrameBuffer = glTextureFrameBuffer;
            GLES20.glBindTexture(3553, glTextureFrameBuffer.getTextureId());
            GLES20.glTexParameterf(3553, 10241, (float) GlUtil.getFilterTypeFromName(this.mTextureMinFilter));
            int i5 = Build.VERSION.SDK_INT;
            GLES20.glTexParameteri(3553, 33084, 0);
            GLES20.glTexParameteri(3553, 33085, 4);
            GLES20.glBindTexture(3553, 0);
        }
        if (!(i3 == this.mFrameBuffer.getWidth() && i4 == this.mFrameBuffer.getHeight())) {
            this.mFrameBuffer.setSize(i3, i4);
            GLES20.glBindTexture(3553, this.mFrameBuffer.getTextureId());
            GLES20.glGenerateMipmap(3553);
            GLES20.glBindTexture(3553, 0);
        }
        if (this.mDrawer == null) {
            this.mDrawer = new GlRenderDrawer();
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer.getFrameBufferId());
        this.mDrawer.drawOes(i2, null, null, 0, 0, i3, i4);
        GLES20.glFlush();
        GlUtil.checkNoGLES2Error("checkGenerateMipmap drawOes");
        GLES20.glBindTexture(3553, this.mFrameBuffer.getTextureId());
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("checkGenerateMipmap glGenerateMipmap");
        return true;
    }

    @Override // com.ss.avframework.livestreamv2.capture.CameraObserver
    public void onInfo(int i2, int i3, String str) {
        if (i2 == 120) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("TECaptureInfo", i2);
                jSONObject.put("Ext", i3);
                jSONObject.put("msg", str);
                jSONObject.put("CameraType", this.mCameraType);
                jSONObject.put("CameraOpenRetryCnt", this.mCameraOpenRetryCnt);
            } catch (Exception unused) {
            }
            AVLog.logKibana(4, "CameraVideoCapturer", jSONObject.toString(), null);
        } else if (i2 == 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("TECaptureInfo", i2);
                jSONObject2.put("Ext", i3);
                jSONObject2.put("msg", str);
                jSONObject2.put("CameraType", this.mCameraType);
                jSONObject2.put("CameraRetryStartPreviewCnt", this.mCameraRetryStartPreviewCnt);
            } catch (Exception unused2) {
            }
            AVLog.logKibana(4, "CameraVideoCapturer", jSONObject2.toString(), null);
        } else if (i2 == 1) {
            checkCameraFeatures(true);
        } else {
            AVLog.iod("CameraVideoCapturer", "TECapture type " + i2 + " ext " + i3 + " msg " + str);
        }
    }

    @Override // com.ss.avframework.capture.video.ExternalVideoCapturer, com.ss.avframework.capture.video.VideoCapturer
    public void start(int i2, int i3, int i4) {
        int i5;
        MethodCollector.i(10585);
        AVLog.ioi("CameraVideoCapturer", "start(" + i2 + ", " + i3 + ", " + i4 + ")");
        this.mOutWidth = i2;
        this.mOutHeight = i3;
        checkEnableMipmap();
        this.mCameraCaptureHeight = Math.min(i2, i3);
        this.mCameraCaptureWidth = Math.max(i2, i3);
        this.mFps = i4;
        synchronized (this.mObject) {
            try {
                if (this.mCapture != null) {
                    this.mSettings = new l(this.mContext, this.mCameraType, this.mCameraCaptureWidth, this.mCameraCaptureHeight);
                    int i6 = this.mVideoCaptureMinFps;
                    if (i6 <= 0 || i6 > 30 || this.mFps <= 0 || this.mFps > 30 || this.mVideoCaptureMinFps > this.mFps) {
                        l lVar = this.mSettings;
                        if (this.mFps < 30) {
                            i5 = this.mFps;
                        } else {
                            i5 = this.mSettings.f61801d.f61371a;
                        }
                        lVar.f61801d = new TEFrameRateRange(i5, this.mFps);
                        this.mSettings.L = 3;
                    } else {
                        this.mSettings.f61801d = new TEFrameRateRange(this.mVideoCaptureMinFps, this.mFps);
                        this.mSettings.L = 0;
                    }
                    this.mSettings.f61802e = this.mCameraFacing;
                    this.mSettings.B = 0;
                    this.mSettings.I = this.mEnableFallback;
                    boolean z = true;
                    this.mSettings.C.putBoolean("enableFrontFacingVideoContinueFocus", true);
                    this.mSettings.u = this.mCameraOpenRetryCnt;
                    this.mSettings.w = this.mCameraOpenRetryCnt;
                    this.mSettings.v = this.mCameraRetryStartPreviewCnt;
                    this.mSettings.O = this.mIsForceCloseCamera;
                    this.mSettings.N = this.mIsCameraOpenCloseSync;
                    l lVar2 = this.mSettings;
                    if (this.mEnableStabilization != 1) {
                        z = false;
                    }
                    lVar2.R = z;
                    this.mSettings.f61810m = this.mEnableWideFov;
                    this.mSettings.C.putBoolean("useCameraFaceDetect", this.mEnableFaceAE);
                    checkCameraFeatures(false);
                    this.mOpenCameraTimestamp = TimeUtils.currentTimeMs();
                    this.mGotFirstFrame = false;
                    int cameraConnectWithCert = PrivacyCertManager.cameraConnectWithCert(this.mCapture, this.mSettings);
                    AVLog.logKibana(4, "CameraVideoCapturer", "TECameraCapture: " + this.mCapture + " connect, CameraVideoCapturer: " + this, null);
                    if (cameraConnectWithCert != 0) {
                        this.mObserver.onVideoCapturerError(cameraConnectWithCert, new Exception("Capture connect failed(" + cameraConnectWithCert + ")"));
                    }
                } else {
                    this.mObserver.onVideoCapturerError(-204, new Exception("Capture already release"));
                }
            } finally {
                MethodCollector.o(10585);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.control.IVideoCapturerControl
    public int setFocusAreas(int i2, int i3, int i4, int i5) {
        final int[] iArr = {-1};
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                this.mISPFocuseStatus = true;
                tECameraCapture.focusAtPoint(i2, i3, 0.15f, i4, i5);
                postAndWait(this.mHandler, 3000, new Runnable() {
                    /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass12 */

                    static {
                        Covode.recordClassIndex(99963);
                    }

                    public void run() {
                        int i2;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPFocuseStatus) {
                            i2 = 0;
                        } else {
                            i2 = -1;
                        }
                        iArr[0] = i2;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i2, int i3, int i4, long j2) {
        return super.onFrame(buffer, i2, i3, i4, j2);
    }

    private void updateTexSubImage(int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
        GLES20.glActiveTexture(i2);
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexSubImage2D(3553, 0, 0, 0, i4, i5, 6409, 5121, byteBuffer);
    }

    public CameraVideoCapturer(Handler handler, boolean z, VideoCapturer.VideoCapturerObserver videoCapturerObserver, Context context, int i2, Bundle bundle) {
        super(videoCapturerObserver, handler);
        int i3;
        int i4;
        int i5;
        String str = null;
        this.mRealRateStatics = null;
        this.mEnableStabilization = 0;
        this.mEnableWideAngle = 0;
        this.mEnableFaceAE = false;
        this.mEnableWideFov = true;
        this.mEnableFallback = false;
        this.mDestFps = 0;
        this.mAdaptedWidth = 0;
        this.mAdaptedHeight = 0;
        this.mVideoCaptureMinFps = 0;
        this.mRawVideoDumpers = new VideoDumpProxy.RawVideoDumperProxy[2];
        this.mFrameFormat = 0;
        this.mFrameListener = null;
        this.mOesTex = i2;
        this.mParams = bundle;
        boolean z2 = bundle.getBoolean("useCamera2API");
        if (Build.VERSION.SDK_INT < 24 && z2) {
            if (!(handler == null || videoCapturerObserver == null)) {
                AVLog.iow("CameraVideoCapturer", "Find using CameraV2 at SDK " + Build.VERSION.SDK_INT + " with force using CameraV1");
            }
            bundle.putBoolean("useCamera2API", false);
            z2 = false;
        }
        this.mCapture = new TECameraCapture(new LiveCoreCameraObserver(new WeakReference(this)));
        String str2 = "TECameraCapture: " + this.mCapture + " is created, CameraVideoCapturer: " + this + ", front " + z + ", params " + bundle;
        AVLog.ioi("CameraVideoCapturer", str2);
        AVLog.logKibana(4, "CameraVideoCapturer", str2, null);
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99960);
            }

            public void run() {
                CameraVideoCapturer.this.mThreadChecker = new ThreadUtils.ThreadChecker();
                CameraVideoCapturer.this.mSurfaceTexture = new SurfaceTexture(CameraVideoCapturer.this.mOesTex);
            }
        });
        this.mHandler = handler;
        this.mObserver = videoCapturerObserver;
        this.mContext = context;
        enableSigalMode(true);
        if (z2) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        this.mCameraType = i3;
        this.mCameraOpenRetryCnt = bundle.getInt("camera_open_retry_cnt");
        this.mCameraRetryStartPreviewCnt = bundle.getInt("camera_retry_start_preview_cnt");
        this.mCameraLogLevel = bundle.getInt("camera_log_level");
        int i6 = -100;
        if (!z2) {
            i4 = -100;
        } else if (bundle.getInt("enableCameraStabilization") == 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        this.mEnableStabilization = i4;
        if (z) {
            i6 = -101;
        } else if (z2) {
            if (bundle.getBoolean("enableWideAngle")) {
                i6 = 1;
            } else {
                i6 = 0;
            }
        }
        this.mEnableWideAngle = i6;
        if (z) {
            i5 = 1;
        } else if (i6 == 1) {
            i5 = 2;
        } else {
            i5 = 0;
        }
        this.mCameraFacing = i5;
        this.mEnableFaceAE = bundle.getBoolean("enableFaceAE");
        this.mEnableWideFov = bundle.getBoolean("enableWideFov");
        this.mDestFps = bundle.getInt("destFps");
        this.mEnableFallback = bundle.getBoolean("enableFallback");
        this.mIsForceCloseCamera = bundle.getBoolean("isForceCloseCamera");
        this.mIsCameraOpenCloseSync = bundle.getBoolean("is_camera_open_close_sync");
        this.mFrameFormat = 0;
        this.mTextureMinFilter = bundle.containsKey("textureMinFilter") ? bundle.getString("textureMinFilter") : str;
        checkEnableMipmap();
        this.mVideoCaptureMinFps = bundle.getInt("videoCaptureMinFps");
        this.mDisplayRotation = ((WindowManager) com_ss_avframework_livestreamv2_capture_CameraVideoCapturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.mContext, "window")).getDefaultDisplay().getRotation();
        int i7 = this.mCameraLogLevel;
        if (i7 > 0 && i7 <= 5) {
            this.veCameraLog = new o.b() {
                /* class com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(99967);
                }

                @Override // com.ss.android.ttvecamera.o.b
                public void Log(byte b2, String str, String str2) {
                    if (b2 == 16) {
                        AVLog.iov(str, str2);
                    } else if (b2 == 8) {
                        AVLog.iod(str, str2);
                    } else if (b2 == 4) {
                        AVLog.ioi(str, str2);
                    } else if (b2 == 2) {
                        AVLog.iow(str, str2);
                    } else if (b2 == 1) {
                        AVLog.ioe(str, str2);
                    }
                }
            };
        }
        o.b bVar = this.veCameraLog;
        if (bVar != null) {
            int i8 = this.mCameraLogLevel;
            if (i8 == 0) {
                TECameraCapture.registerLogOutput((byte) 0, bVar);
            } else if (i8 == 1) {
                TECameraCapture.registerLogOutput((byte) 31, bVar);
            } else if (i8 == 2) {
                TECameraCapture.registerLogOutput((byte) 15, bVar);
            } else if (i8 == 3) {
                TECameraCapture.registerLogOutput((byte) 7, bVar);
            } else if (i8 == 4) {
                TECameraCapture.registerLogOutput((byte) 3, bVar);
            } else if (i8 != 5) {
                TECameraCapture.registerLogOutput((byte) 0, bVar);
            } else {
                TECameraCapture.registerLogOutput((byte) 1, bVar);
            }
        }
    }
}
