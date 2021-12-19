package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CameraCaptureSession.StateCallback f53473a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraCaptureSession f53474b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f53475c;

    static {
        Covode.recordClassIndex(33109);
    }

    n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f53473a = stateCallback;
        this.f53474b = cameraCaptureSession;
    }

    n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, byte b2) {
        this.f53475c = 1;
        this.f53473a = stateCallback;
        this.f53474b = cameraCaptureSession;
    }

    n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, char c2) {
        this.f53475c = 2;
        this.f53473a = stateCallback;
        this.f53474b = cameraCaptureSession;
    }

    n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, int i2) {
        this.f53475c = 4;
        this.f53473a = stateCallback;
        this.f53474b = cameraCaptureSession;
    }

    n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, short s) {
        this.f53475c = 3;
        this.f53473a = stateCallback;
        this.f53474b = cameraCaptureSession;
    }

    public final void run() {
        int i2 = this.f53475c;
        if (i2 == 0) {
            this.f53473a.onConfigured(this.f53474b);
        } else if (i2 == 1) {
            this.f53473a.onClosed(this.f53474b);
        } else if (i2 == 2) {
            this.f53473a.onConfigureFailed(this.f53474b);
        } else if (i2 != 3) {
            this.f53473a.onActive(this.f53474b);
        } else {
            this.f53473a.onReady(this.f53474b);
        }
    }
}
