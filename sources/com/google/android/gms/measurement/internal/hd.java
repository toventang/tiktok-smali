package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class hd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f51751a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51752b;

    static {
        Covode.recordClassIndex(32279);
    }

    public final void run() {
        this.f51752b.r().f51530l.a(this.f51751a);
        this.f51752b.q().f51475j.a("Minimum session duration set", Long.valueOf(this.f51751a));
    }

    hd(gk gkVar, long j2) {
        this.f51752b = gkVar;
        this.f51751a = j2;
    }
}
