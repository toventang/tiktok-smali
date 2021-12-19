package org.webrtc;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

public class Camera2Capturer extends CameraCapturer {
    private final CameraManager cameraManager;
    private final Context context;

    static {
        Covode.recordClassIndex(106514);
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // org.webrtc.CameraVideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        super.setOrientationMode(orientation_mode);
    }

    @Override // org.webrtc.CameraVideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    public static Object org_webrtc_Camera2Capturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context2, String str) {
        Object obj;
        MethodCollector.i(13432);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context2.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context2.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context2.getSystemService(str);
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
                    MethodCollector.o(13432);
                }
            }
        } else {
            obj = context2.getSystemService(str);
        }
        return obj;
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i2, int i3, int i4) {
        super.changeCaptureFormat(i2, i3, i4);
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context2, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context2, capturerObserver);
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i2, int i3, int i4) {
        super.startCapture(i2, i3, i4);
    }

    public Camera2Capturer(Context context2, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context2));
        this.context = context2;
        this.cameraManager = (CameraManager) org_webrtc_Camera2Capturer_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context2, "camera");
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i2, int i3, int i4, int i5) {
        super.startCapture(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    @Override // org.webrtc.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context2, SurfaceTextureHelper surfaceTextureHelper, String str, int i2, int i3, int i4) {
        Camera2Session.create(createSessionCallback, events, context2, this.cameraManager, surfaceTextureHelper, str, i2, i3, i4);
    }
}
