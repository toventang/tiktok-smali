package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ gb f51977a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f51978b;

    static {
        Covode.recordClassIndex(32357);
    }

    public final void run() {
        this.f51977a.t();
        if (kl.a()) {
            this.f51977a.p().a(this);
            return;
        }
        boolean b2 = this.f51978b.b();
        this.f51978b.f51739a = 0;
        if (b2) {
            this.f51978b.a();
        }
    }

    k(h hVar, gb gbVar) {
        this.f51978b = hVar;
        this.f51977a = gbVar;
    }
}
