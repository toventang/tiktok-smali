package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CameraDevice.StateCallback f53464a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraDevice f53465b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f53466c;

    static {
        Covode.recordClassIndex(33106);
    }

    k(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f53464a = stateCallback;
        this.f53465b = cameraDevice;
    }

    k(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, byte b2) {
        this.f53466c = 1;
        this.f53464a = stateCallback;
        this.f53465b = cameraDevice;
    }

    k(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, char c2) {
        this.f53466c = 2;
        this.f53464a = stateCallback;
        this.f53465b = cameraDevice;
    }

    public final void run() {
        int i2 = this.f53466c;
        if (i2 == 0) {
            this.f53464a.onOpened(this.f53465b);
        } else if (i2 != 1) {
            this.f53464a.onDisconnected(this.f53465b);
        } else {
            this.f53464a.onClosed(this.f53465b);
        }
    }
}
