package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CameraDevice.StateCallback f53467a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraDevice f53468b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53469c;

    static {
        Covode.recordClassIndex(33107);
    }

    l(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i2) {
        this.f53467a = stateCallback;
        this.f53468b = cameraDevice;
        this.f53469c = i2;
    }

    public final void run() {
        this.f53467a.onError(this.f53468b, this.f53469c);
    }
}
