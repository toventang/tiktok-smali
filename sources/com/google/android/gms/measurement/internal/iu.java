package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.covode.number.Covode;

final class iu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ iq f51891a;

    static {
        Covode.recordClassIndex(32323);
    }

    public final void run() {
        hv hvVar = this.f51891a.f51885c;
        Context m2 = this.f51891a.f51885c.m();
        this.f51891a.f51885c.t();
        hv.a(hvVar, new ComponentName(m2, "com.google.android.gms.measurement.AppMeasurementService"));
    }

    iu(iq iqVar) {
        this.f51891a = iqVar;
    }
}
