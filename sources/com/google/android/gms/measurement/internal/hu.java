package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class hu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f51804a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hq f51805b;

    static {
        Covode.recordClassIndex(32296);
    }

    public final void run() {
        this.f51805b.d().a(this.f51804a);
        this.f51805b.f51785c = null;
    }

    hu(hq hqVar, long j2) {
        this.f51805b = hqVar;
        this.f51804a = j2;
    }
}
