package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class go implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f51704a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51705b;

    static {
        Covode.recordClassIndex(32263);
    }

    public final void run() {
        this.f51705b.r().f51531m.a(this.f51704a);
        this.f51705b.q().f51475j.a("Session timeout duration set", Long.valueOf(this.f51704a));
    }

    go(gk gkVar, long j2) {
        this.f51705b = gkVar;
        this.f51704a = j2;
    }
}
