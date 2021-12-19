package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class o extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f53476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CameraCaptureSession.StateCallback f53477b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SharedCamera f53478c;

    static {
        Covode.recordClassIndex(33110);
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f53476a.post(new n(this.f53477b, cameraCaptureSession, 0));
        this.f53478c.onCaptureSessionActive(cameraCaptureSession);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f53476a.post(new n(this.f53477b, cameraCaptureSession, (byte) 0));
        this.f53478c.onCaptureSessionClosed(cameraCaptureSession);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f53476a.post(new n(this.f53477b, cameraCaptureSession, (char) 0));
        this.f53478c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f53476a.post(new n(this.f53477b, cameraCaptureSession));
        this.f53478c.onCaptureSessionConfigured(cameraCaptureSession);
        if (this.f53478c.sharedCameraInfo.f53479a != null) {
            this.f53478c.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f53476a.post(new n(this.f53477b, cameraCaptureSession, (short) 0));
        this.f53478c.onCaptureSessionReady(cameraCaptureSession);
    }

    o(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f53478c = sharedCamera;
        this.f53476a = handler;
        this.f53477b = stateCallback;
    }
}
