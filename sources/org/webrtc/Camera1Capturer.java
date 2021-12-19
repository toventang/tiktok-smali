package org.webrtc;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;
    private final boolean isDesktopMode;

    static {
        Covode.recordClassIndex(106505);
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

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i2, int i3, int i4) {
        super.changeCaptureFormat(i2, i3, i4);
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i2, int i3, int i4) {
        super.startCapture(i2, i3, i4);
    }

    @Override // org.webrtc.VideoCapturer, org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i2, int i3, int i4, int i5) {
        super.startCapture(i2, i3, i4, i5);
    }

    public Camera1Capturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z, boolean z2) {
        super(str, cameraEventsHandler, new Camera1Enumerator(z, z2));
        this.captureToTexture = z;
        this.isDesktopMode = z2;
    }

    /* access modifiers changed from: protected */
    @Override // org.webrtc.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i2, int i3, int i4) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, this.isDesktopMode, context, surfaceTextureHelper, Camera1Enumerator.getCameraIndex(str), i2, i3, i4);
    }
}
