package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

/* access modifiers changed from: package-private */
public class Camera2Session implements CameraSession {
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private final Context applicationContext;
    public final CameraSession.CreateSessionCallback callback;
    public CameraCharacteristics cameraCharacteristics;
    public CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    public int cameraOrientation;
    public final Handler cameraThreadHandler;
    public CameraEnumerationAndroid.CaptureFormat captureFormat;
    public CameraCaptureSession captureSession;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public int fpsUnitFactor;
    private final int framerate;
    private final int height;
    public boolean isCameraFrontFacing;
    public SessionState state = SessionState.RUNNING;
    public Surface surface;
    public final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.Camera2Session$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(106517);
        }
    }

    private static void org_webrtc_Camera2Session_android_hardware_camera2_CameraDevice_close(CameraDevice cameraDevice2) {
        if (!((Boolean) a.a(cameraDevice2, new Object[0], 100201, "void", false, null).first).booleanValue()) {
            a.a(null, cameraDevice2, new Object[0], 100205, "org_webrtc_Camera2Session_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
            cameraDevice2.close();
            a.a(null, cameraDevice2, new Object[0], 100201, "org_webrtc_Camera2Session_android_hardware_camera2_CameraDevice_close(Landroid/hardware/camera2/CameraDevice;)V");
        }
    }

    @Override // org.webrtc.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
    }

    static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        static {
            Covode.recordClassIndex(106518);
        }

        private CameraCaptureCallback() {
        }

        /* synthetic */ CameraCaptureCallback(AnonymousClass1 r1) {
            this();
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Logging.i("Camera2Session", "Capture failed: ".concat(String.valueOf(captureFailure)));
        }
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public int getFrameOrientation() {
        int deviceOrientation$$STATIC$$ = CameraSession$$CC.getDeviceOrientation$$STATIC$$(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation$$STATIC$$ = 360 - deviceOrientation$$STATIC$$;
        }
        return (this.cameraOrientation + deviceOrientation$$STATIC$$) % 360;
    }

    /* access modifiers changed from: package-private */
    public enum SessionState {
        RUNNING,
        STOPPED;

        static {
            Covode.recordClassIndex(106522);
        }
    }

    static {
        Covode.recordClassIndex(106516);
    }

    private void openCamera() {
        checkIsOnCameraThread();
        Logging.i("Camera2Session", "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(this, null), this.cameraThreadHandler);
        } catch (CameraAccessException e2) {
            reportError("Failed to open camera: ".concat(String.valueOf(e2)));
        }
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        Logging.i("Camera2Session", "Stop camera2 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            this.state = SessionState.STOPPED;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public void stopInternal() {
        Logging.i("Camera2Session", "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface2 = this.surface;
        if (surface2 != null) {
            surface2.release();
            this.surface = null;
        }
        CameraDevice cameraDevice2 = this.cameraDevice;
        if (cameraDevice2 != null) {
            org_webrtc_Camera2Session_android_hardware_camera2_CameraDevice_close(cameraDevice2);
            this.cameraDevice = null;
        }
        Logging.i("Camera2Session", "Stop done");
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor2 = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor2;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor2);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        Logging.i("Camera2Session", "Available preview sizes: ".concat(String.valueOf(supportedSizes)));
        Logging.i("Camera2Session", "Available fps ranges: ".concat(String.valueOf(convertFramerates)));
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        Logging.i("Camera2Session", "Using capture format: " + this.captureFormat);
    }

    private void start() {
        boolean z;
        checkIsOnCameraThread();
        Logging.i("Camera2Session", "start");
        try {
            CameraCharacteristics cameraCharacteristics2 = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics2;
            this.cameraOrientation = ((Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.isCameraFrontFacing = z;
            findCaptureFormat();
            openCamera();
        } catch (CameraAccessException e2) {
            reportError("getCameraCharacteristics(): " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public class CameraStateCallback extends CameraDevice.StateCallback {
        static {
            Covode.recordClassIndex(106519);
        }

        private CameraStateCallback() {
        }

        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.i("Camera2Session", "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        private String getErrorDescription(int i2) {
            if (i2 == 1) {
                return "Camera device is in use already.";
            }
            if (i2 == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i2 == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i2 == 4) {
                return "Camera device has encountered a fatal error.";
            }
            if (i2 != 5) {
                return "Unknown camera error: ".concat(String.valueOf(i2));
            }
            return "Camera service has encountered a fatal error.";
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            boolean z;
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.captureSession != null || Camera2Session.this.state == SessionState.STOPPED) {
                z = false;
            } else {
                z = true;
            }
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            if (z) {
                Camera2Session.this.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            if (!((Boolean) a.a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
                a.a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
                Camera2Session.this.checkIsOnCameraThread();
                Logging.i("Camera2Session", "Camera opened.");
                Camera2Session.this.cameraDevice = cameraDevice;
                Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
                Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
                try {
                    cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.this.surface), new CaptureSessionCallback(Camera2Session.this, null), Camera2Session.this.cameraThreadHandler);
                } catch (CameraAccessException e2) {
                    Camera2Session.this.reportError("Failed to create capture session. ".concat(String.valueOf(e2)));
                }
            }
        }

        /* synthetic */ CameraStateCallback(Camera2Session camera2Session, AnonymousClass1 r2) {
            this();
        }

        public void onError(CameraDevice cameraDevice, int i2) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        static {
            Covode.recordClassIndex(106520);
        }

        private CaptureSessionCallback() {
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i2 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i2 == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    Logging.i("Camera2Session", "Using continuous video auto-focus.");
                    return;
                }
            }
            Logging.i("Camera2Session", "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        Logging.i("Camera2Session", "Using optical stabilization.");
                        return;
                    }
                }
            }
            for (int i3 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i3 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    Logging.i("Camera2Session", "Using video stabilization.");
                    return;
                }
            }
            Logging.i("Camera2Session", "Stabilization not available.");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onConfigured$0$Camera2Session$CaptureSessionCallback(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                Logging.i("Camera2Session", "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            VideoFrame videoFrame2 = new VideoFrame(CameraSession$$CC.createTextureBufferWithModifiedTransformMatrix$$STATIC$$((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.i("Camera2Session", "Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                CaptureRequest.Builder createCaptureRequest = Camera2Session.this.cameraDevice.createCaptureRequest(3);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, false);
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                Camera2Session.this.events.onCameraConfig(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height, Camera2Session.this.captureFormat.framerate);
                createCaptureRequest.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new CameraCaptureCallback(null), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new Camera2Session$CaptureSessionCallback$$Lambda$0(this));
                Logging.i("Camera2Session", "Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (CameraAccessException e2) {
                Camera2Session.this.reportError("Failed to start capture request. ".concat(String.valueOf(e2)));
            }
        }

        /* synthetic */ CaptureSessionCallback(Camera2Session camera2Session, AnonymousClass1 r2) {
            this();
        }
    }

    public void reportError(String str) {
        boolean z;
        checkIsOnCameraThread();
        Logging.e("Camera2Session", "Error: ".concat(String.valueOf(str)));
        if (this.captureSession != null || this.state == SessionState.STOPPED) {
            z = false;
        } else {
            z = true;
        }
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i2, int i3, int i4) {
        new Camera2Session(createSessionCallback, events2, context, cameraManager2, surfaceTextureHelper2, str, i2, i3, i4);
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i2, int i3, int i4) {
        Logging.i("Camera2Session", "Create new camera2 session on camera ".concat(String.valueOf(str)));
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events2;
        this.applicationContext = context;
        this.cameraManager = cameraManager2;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = str;
        this.width = i2;
        this.height = i3;
        this.framerate = i4;
        start();
    }
}
