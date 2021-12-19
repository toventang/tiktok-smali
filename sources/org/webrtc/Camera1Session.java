package org.webrtc;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.realx.base.RXLogging;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.VideoFrame;

class Camera1Session implements CameraSession {
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
    private static int sMinFramerate;
    private final Context applicationContext;
    public final Camera camera;
    private final int cameraId;
    public final Handler cameraThreadHandler;
    public final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    public final long constructionTimeNs;
    public final CameraSession.Events events;
    public boolean firstFrameReported;
    public final Camera.CameraInfo info;
    private boolean isDesktopMode;
    private int mDisplayRotationCheckCounter;
    private int mLastDisplayRotation;
    private int mLastValidDisplayRotation;
    private CameraVideoCapturer.ORIENTATION_MODE mOrientation = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    private final int scaleHeight;
    private final int scaleWidth;
    public SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;

    private static Camera org_webrtc_Camera1Session_android_hardware_Camera_open(int i2) {
        Pair<Boolean, Object> a2 = a.a(Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "android.hardware.Camera", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (Camera) a2.second;
        }
        Camera open = Camera.open(i2);
        a.a(open, Camera.class, new Object[]{Integer.valueOf(i2)}, 100100, "org_webrtc_Camera1Session_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
        return open;
    }

    private static void org_webrtc_Camera1Session_android_hardware_Camera_release(Camera camera2) {
        if (!((Boolean) a.a(camera2, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            a.a(null, camera2, new Object[0], 100106, "org_webrtc_Camera1Session_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera2.release();
            a.a(null, camera2, new Object[0], 100101, "org_webrtc_Camera1Session_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() {
            /* class org.webrtc.Camera1Session.AnonymousClass2 */

            static {
                Covode.recordClassIndex(106510);
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void lambda$null$0$Camera1Session$2(byte[] bArr) {
                if (Camera1Session.this.state == SessionState.RUNNING) {
                    Camera1Session.this.camera.addCallbackBuffer(bArr);
                }
            }

            /* access modifiers changed from: package-private */
            public final /* synthetic */ void lambda$onPreviewFrame$1$Camera1Session$2(byte[] bArr) {
                Camera1Session.this.cameraThreadHandler.post(new Camera1Session$2$$Lambda$1(this, bArr));
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                boolean z;
                Camera1Session.this.checkIsOnCameraThread();
                if (camera != Camera1Session.this.camera) {
                    RXLogging.e("Camera1Session", "Callback from a different camera. This should never happen.");
                } else if (Camera1Session.this.state != SessionState.RUNNING) {
                    RXLogging.w("Camera1Session", "Bytebuffer frame captured but camera is no longer running.");
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                    if (!Camera1Session.this.firstFrameReported) {
                        Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                        Camera1Session.this.firstFrameReported = true;
                    }
                    NV21Buffer nV21Buffer = new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Camera1Session$2$$Lambda$0(this, bArr));
                    int frameOrientation = Camera1Session.this.getFrameOrientation();
                    if (Camera1Session.this.info.facing == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    VideoFrame videoFrame = new VideoFrame(nV21Buffer, frameOrientation, nanos, z);
                    Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                    videoFrame.release();
                }
            }
        });
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new Camera1Session$$Lambda$0(this));
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    /* access modifiers changed from: package-private */
    public enum SessionState {
        RUNNING,
        STOPPED;

        static {
            Covode.recordClassIndex(106513);
        }
    }

    static {
        Covode.recordClassIndex(106507);
    }

    private void startCapturing() {
        RXLogging.w("Camera1Session", "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() {
            /* class org.webrtc.Camera1Session.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106509);
            }

            public void onError(int i2, Camera camera) {
                String concat;
                if (i2 == 100) {
                    concat = "Camera server died!";
                } else {
                    concat = "Camera error: ".concat(String.valueOf(i2));
                }
                RXLogging.e("Camera1Session", concat);
                Camera1Session.this.stopInternal();
                if (i2 == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, concat);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e2) {
            stopInternal();
            this.events.onCameraError(this, e2.getMessage());
        }
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
        RXLogging.w("Camera1Session", "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public int getFrameOrientation() {
        int deviceOrientation$$STATIC$$ = CameraSession$$CC.getDeviceOrientation$$STATIC$$(this.applicationContext);
        int i2 = this.mLastValidDisplayRotation;
        int i3 = this.mDisplayRotationCheckCounter;
        if (i3 > 0) {
            this.mDisplayRotationCheckCounter = i3 - 1;
        } else if (i3 == 0) {
            if (!isInForeground(this.applicationContext)) {
                i2 = this.mLastValidDisplayRotation;
            } else {
                i2 = deviceOrientation$$STATIC$$;
            }
            this.mDisplayRotationCheckCounter = -1;
        } else if (deviceOrientation$$STATIC$$ != this.mLastDisplayRotation) {
            int i4 = sMinFramerate;
            if (i4 > 0) {
                this.mDisplayRotationCheckCounter = i4;
            } else {
                this.mDisplayRotationCheckCounter = 5;
            }
        }
        this.mLastDisplayRotation = deviceOrientation$$STATIC$$;
        this.mLastValidDisplayRotation = i2;
        if (this.info.facing == 0) {
            i2 = 360 - i2;
        }
        return (this.info.orientation + i2) % 360;
    }

    public void stopInternal() {
        RXLogging.w("Camera1Session", "Stop internal");
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            RXLogging.w("Camera1Session", "Camera is already stopped");
            return;
        }
        this.state = SessionState.STOPPED;
        this.surfaceTextureHelper.stopListening();
        try {
            this.camera.stopPreview();
            if (this.captureToTexture) {
                this.camera.setPreviewTexture(null);
            }
            org_webrtc_Camera1Session_android_hardware_Camera_release(this.camera);
            this.events.onCameraClosed(this);
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Error e3) {
            e3.printStackTrace();
        }
        RXLogging.w("Camera1Session", "Stop done");
    }

    @Override // org.webrtc.CameraSession
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientation = orientation_mode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isInForeground(android.content.Context r5) {
        /*
            java.lang.String r0 = "activity"
            java.lang.Object r0 = org_webrtc_Camera1Session_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(r5, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.lang.String r5 = r5.getPackageName()
            java.util.List r0 = r0.getRunningAppProcesses()
            r4 = 0
            if (r0 != 0) goto L_0x0014
            return r4
        L_0x0014:
            java.util.Iterator r3 = r0.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            java.lang.String r0 = r2.processName
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0032
            int r1 = r2.importance
            r0 = 100
            if (r1 == r0) goto L_0x0038
        L_0x0032:
            int r1 = r2.importance
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x0018
        L_0x0038:
            r0 = 1
            return r0
        L_0x003a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera1Session.isInForeground(android.content.Context):boolean");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$listenForTextureFrames$0$Camera1Session(VideoFrame videoFrame) {
        VideoFrame.Buffer cropAndScale;
        boolean z;
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            RXLogging.w("Camera1Session", "Texture frame captured but camera is no longer running.");
            return;
        }
        boolean z2 = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        if (this.scaleWidth == 0 || this.scaleHeight == 0 || (this.captureFormat.width == this.scaleWidth && this.captureFormat.height == this.scaleHeight)) {
            cropAndScale = videoFrame.getBuffer().cropAndScale(0, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else if (((float) this.captureFormat.width) / ((float) this.captureFormat.height) > ((float) this.scaleWidth) / ((float) this.scaleHeight)) {
            cropAndScale = videoFrame.getBuffer().cropAndScale(((int) (((float) this.captureFormat.width) - ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)))) / 2, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else {
            cropAndScale = videoFrame.getBuffer().cropAndScale(0, ((int) (((float) this.captureFormat.height) - ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)))) / 2, this.captureFormat.width, (int) ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)), this.scaleWidth, this.scaleHeight);
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) cropAndScale;
        if (this.info.facing == 1) {
            z = true;
        } else {
            z = false;
        }
        VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix$$STATIC$$ = CameraSession$$CC.createTextureBufferWithModifiedTransformMatrix$$STATIC$$(textureBufferImpl, z, 0);
        int frameOrientation = getFrameOrientation();
        long timestampNs = videoFrame.getTimestampNs();
        if (this.info.facing != 1) {
            z2 = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(createTextureBufferWithModifiedTransformMatrix$$STATIC$$, frameOrientation, timestampNs, z2);
        cropAndScale.release();
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    public static Object org_webrtc_Camera1Session_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(7368);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
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
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7368);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i2, int i3) {
        if (parameters != null) {
            return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i2, i3);
        }
        RXLogging.e("Camera1Session", "camera parameters is null!");
        return null;
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i2, int i3, int i4) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        RXLogging.w("Camera1Session", "Available fps ranges: ".concat(String.valueOf(convertFramerates)));
        if (!Build.MODEL.equalsIgnoreCase("PEGM00") || i4 != 15) {
            closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i4);
        } else {
            closestSupportedFramerateRange = new CameraEnumerationAndroid.CaptureFormat.FramerateRange(15000, 20000);
            RXLogging.w("Camera1Session", "unsupported framerate for special device found, hardcode framerange to:" + closestSupportedFramerateRange.toString());
        }
        RXLogging.w("Camera1Session", "selected fps range :" + closestSupportedFramerateRange.toString());
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i2, i3);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        RXLogging.w("Camera1Session", "selected preview size" + closestSupportedSize.toString());
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static void updateCameraParameters(Camera camera2, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat2, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        parameters.setPreviewFpsRange(captureFormat2.framerate.min, captureFormat2.framerate.max);
        parameters.setPreviewSize(captureFormat2.width, captureFormat2.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            captureFormat2.getClass();
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera2.setParameters(parameters);
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events2, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i2, int i3, int i4, int i5) {
        long nanoTime = System.nanoTime();
        RXLogging.w("Camera1Session", "Open camera " + i2 + " brand:" + Build.BRAND + ", modle:" + Build.MODEL + ", width:" + i3 + ", height:" + i4 + ", framerate:" + i5);
        events2.onCameraOpening();
        try {
            Camera org_webrtc_Camera1Session_android_hardware_Camera_open = org_webrtc_Camera1Session_android_hardware_Camera_open(i2);
            if (org_webrtc_Camera1Session_android_hardware_Camera_open == null) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "android.hardware.Camera.open returned null for camera id = ".concat(String.valueOf(i2)));
                return;
            }
            try {
                org_webrtc_Camera1Session_android_hardware_Camera_open.setPreviewTexture(surfaceTextureHelper2.getSurfaceTexture());
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                try {
                    Camera.Parameters parameters = org_webrtc_Camera1Session_android_hardware_Camera_open.getParameters();
                    CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i3, i4, i5);
                    Size findClosestPictureSize = findClosestPictureSize(parameters, i3, i4);
                    events2.onCameraConfig(findClosestPictureSize.width, findClosestPictureSize.height, findClosestCaptureFormat.framerate);
                    sMinFramerate = findClosestCaptureFormat.framerate.min / 1000;
                    updateCameraParameters(org_webrtc_Camera1Session_android_hardware_Camera_open, parameters, findClosestCaptureFormat, findClosestPictureSize, z);
                    if (!z) {
                        int frameSize = findClosestCaptureFormat.frameSize();
                        int i6 = 0;
                        do {
                            org_webrtc_Camera1Session_android_hardware_Camera_open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                            i6++;
                        } while (i6 < 3);
                    }
                    org_webrtc_Camera1Session_android_hardware_Camera_open.setDisplayOrientation(0);
                    createSessionCallback.onDone(new Camera1Session(events2, z, z2, context, surfaceTextureHelper2, i2, org_webrtc_Camera1Session_android_hardware_Camera_open, cameraInfo, findClosestCaptureFormat, nanoTime, i3, i4));
                } catch (RuntimeException e2) {
                    org_webrtc_Camera1Session_android_hardware_Camera_release(org_webrtc_Camera1Session_android_hardware_Camera_open);
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
                }
            } catch (IOException | RuntimeException e3) {
                org_webrtc_Camera1Session_android_hardware_Camera_release(org_webrtc_Camera1Session_android_hardware_Camera_open);
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
            }
        } catch (RuntimeException e4) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e4.getMessage());
        }
    }

    private Camera1Session(CameraSession.Events events2, boolean z, boolean z2, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i2, Camera camera2, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat2, long j2, int i3, int i4) {
        RXLogging.w("Camera1Session", "Create new camera1 session on camera ".concat(String.valueOf(i2)));
        this.cameraThreadHandler = new Handler();
        this.events = events2;
        this.captureToTexture = z;
        this.isDesktopMode = z2;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = i2;
        this.camera = camera2;
        this.info = cameraInfo;
        this.captureFormat = captureFormat2;
        this.constructionTimeNs = j2;
        this.scaleWidth = i3;
        this.scaleHeight = i4;
        surfaceTextureHelper2.setTextureSize(captureFormat2.width, captureFormat2.height);
        startCapturing();
    }
}
