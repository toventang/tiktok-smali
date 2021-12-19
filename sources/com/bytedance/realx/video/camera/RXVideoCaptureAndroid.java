package com.bytedance.realx.video.camera;

import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import androidx.core.content.b;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.realx.RXNativeFunctions;
import com.bytedance.realx.base.RXLogging;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;

public class RXVideoCaptureAndroid {
    private EglBase cameraEglBase;
    private CapturerObserver localCapturerObserver = new CapturerObserver() {
        /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25942);
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            MethodCollector.i(9664);
            RXLogging.w("RXVideoCaptureAndroid", "onCapturerStopped...");
            RXNativeFunctions.nativeOnCapturerStopped(RXVideoCaptureAndroid.this.mNativeCaptureObserver);
            MethodCollector.o(9664);
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            MethodCollector.i(9838);
            RXNativeFunctions.nativeOnFrameCaptured(RXVideoCaptureAndroid.this.mNativeCaptureObserver, videoFrame);
            MethodCollector.o(9838);
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerError(String str) {
            MethodCollector.i(9837);
            RXLogging.e("RXVideoCaptureAndroid", "onCapturerError: ".concat(String.valueOf(str)));
            RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, 0);
            MethodCollector.o(9837);
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z) {
            MethodCollector.i(9663);
            if (z) {
                RXLogging.w("RXVideoCaptureAndroid", "onCapturerStarted...");
                RXNativeFunctions.nativeOnCapturerStarted(RXVideoCaptureAndroid.this.mNativeCaptureObserver, z);
                MethodCollector.o(9663);
                return;
            }
            RXNativeFunctions.nativeOnCapturerError(RXVideoCaptureAndroid.this.mNativeCaptureObserver, 0);
            MethodCollector.o(9663);
        }
    };
    private CameraVideoCapturer.CameraEventsHandler mCameraEventsHandler;
    private int mCaptureBufferType;
    private Intent mCaptureScreenIntent;
    private int mHeight;
    private boolean mIsCaptureScreen;
    public boolean mIsFrontCamera = true;
    private boolean mIsVideoCaptureInited;
    private boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private VideoCapturer mVideoCapturer;
    private int mWidth;
    private EglBase.Context sharedEglGroup;

    static {
        Covode.recordClassIndex(25941);
    }

    private boolean isCaptureToTextureSupported() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    public int getCameraFace() {
        if (this.mIsFrontCamera) {
            return 1;
        }
        return 0;
    }

    public void stopCapture() {
        RXLogging.w("RXVideoCaptureAndroid", "stopCapture...");
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
            try {
                videoCapturer.stopCapture();
                this.mIsVideoCaptureWorking = false;
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void switchCamera() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null && this.mIsVideoCaptureInited && (videoCapturer instanceof CameraVideoCapturer)) {
            this.mIsFrontCamera = !this.mIsFrontCamera;
            ((CameraVideoCapturer) videoCapturer).switchCamera(new CameraVideoCapturer.CameraSwitchHandler() {
                /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(25943);
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchError(String str) {
                }

                @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
                public void onCameraSwitchDone(boolean z) {
                    RXVideoCaptureAndroid.this.mIsFrontCamera = z;
                }
            });
        }
    }

    public void release() {
        if (this.mVideoCapturer != null) {
            stopCapture();
            this.mVideoCapturer.dispose();
            this.mVideoCapturer = null;
        }
        EglBase eglBase = this.cameraEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.cameraEglBase = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mIsVideoCaptureInited = false;
        this.mIsVideoCaptureWorking = false;
        this.sharedEglGroup = null;
        this.mCaptureScreenIntent = null;
    }

    public class BufferType {
        static {
            Covode.recordClassIndex(25945);
        }

        public BufferType() {
        }
    }

    RXVideoCaptureAndroid(boolean z, long j2, EglBase.Context context) {
        RXLogging.w("RXVideoCaptureAndroid", "RXVideoCaptureAndroid Created, CaptureScreen=".concat(String.valueOf(z)));
        this.mIsCaptureScreen = z;
        this.mNativeCaptureObserver = j2;
        this.sharedEglGroup = context;
    }

    private VideoCapturer createVideoCapturer(boolean z, int i2, Intent intent) {
        boolean z2;
        CameraVideoCapturer createCapturer;
        CameraVideoCapturer createCapturer2;
        if (z) {
            try {
                return new ScreenCapturerAndroid(intent, new MediaProjection.Callback() {
                    /* class com.bytedance.realx.video.camera.RXVideoCaptureAndroid.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(25944);
                    }

                    public void onStop() {
                        RXLogging.e("RXVideoCaptureAndroid", "User revoked permission to capture the screen.");
                    }
                });
            } catch (IllegalArgumentException e2) {
                RXLogging.e("RXVideoCaptureAndroid", "Create VideoCapture fail : " + e2.getMessage());
                return null;
            }
        } else {
            if (this.mCaptureBufferType == 1 || !isCaptureToTextureSupported()) {
                z2 = false;
            } else {
                z2 = true;
            }
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(z2, false);
            String[] deviceNames = camera1Enumerator.getDeviceNames();
            for (String str : deviceNames) {
                if (camera1Enumerator.isFrontFacing(str) && i2 == 1 && (createCapturer2 = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler)) != null) {
                    return createCapturer2;
                }
                if (camera1Enumerator.isBackFacing(str) && i2 == 0 && (createCapturer = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler)) != null) {
                    return createCapturer;
                }
            }
            return null;
        }
    }

    private void startVideoCapture(int i2, int i3, int i4) {
        RXLogging.w("RXVideoCaptureAndroid", a.a("startVideoCapture: width: %d, height: &d, fps: &d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            try {
                videoCapturer.startCapture(i2, i3, i4);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e2) {
                RXLogging.e("RXVideoCaptureAndroid", "VideoCapture startCapture fail : " + e2.getMessage());
            }
        }
    }

    public void startCapture(int i2, int i3, int i4, int i5, int i6, Intent intent) {
        MethodCollector.i(11802);
        RXLogging.w("RXVideoCaptureAndroid", "startCapture...");
        this.mWidth = i2;
        this.mHeight = i3;
        this.mCaptureScreenIntent = intent;
        this.mCaptureBufferType = i6;
        if (b.a(ContextUtils.getApplicationContext(), "android.permission.CAMERA") != 0) {
            RXNativeFunctions.nativeOnCapturerError(this.mNativeCaptureObserver, -100);
            MethodCollector.o(11802);
            return;
        }
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.dispose();
            this.mVideoCapturer = null;
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        }
        this.mVideoCapturer = createVideoCapturer(this.mIsCaptureScreen, i5, this.mCaptureScreenIntent);
        if (this.cameraEglBase == null) {
            this.cameraEglBase = EglBase$$CC.create$$STATIC$$(this.sharedEglGroup);
        }
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RXLocalCapturer", this.cameraEglBase.getEglBaseContext());
        this.mSurfaceTextureHelper = create;
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 == null || create == null) {
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
            MethodCollector.o(11802);
            return;
        }
        videoCapturer2.initialize(create, ContextUtils.getApplicationContext(), this.localCapturerObserver);
        this.mIsVideoCaptureInited = true;
        startVideoCapture(i2, i3, i4);
        MethodCollector.o(11802);
    }
}
