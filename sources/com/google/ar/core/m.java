package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;

/* access modifiers changed from: package-private */
public final class m extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f53470a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CameraDevice.StateCallback f53471b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SharedCamera f53472c;

    static {
        Covode.recordClassIndex(33108);
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f53470a.post(new k(this.f53471b, cameraDevice, (byte) 0));
        this.f53472c.onDeviceClosed(cameraDevice);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f53470a.post(new k(this.f53471b, cameraDevice, (char) 0));
        this.f53472c.onDeviceDisconnected(cameraDevice);
    }

    public final void onOpened(CameraDevice cameraDevice) {
        if (!((Boolean) a.a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
            a.a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
            this.f53472c.sharedCameraInfo.f53479a = cameraDevice;
            this.f53470a.post(new k(this.f53471b, cameraDevice));
            this.f53472c.onDeviceOpened(cameraDevice);
            this.f53472c.sharedCameraInfo.f53481c = this.f53472c.getGpuSurfaceTexture();
            this.f53472c.sharedCameraInfo.f53482d = this.f53472c.getGpuSurface();
        }
    }

    public final void onError(CameraDevice cameraDevice, int i2) {
        this.f53470a.post(new l(this.f53471b, cameraDevice, i2));
        this.f53472c.close();
    }

    m(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f53472c = sharedCamera;
        this.f53470a = handler;
        this.f53471b = stateCallback;
    }
}
