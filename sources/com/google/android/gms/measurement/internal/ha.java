package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f51742a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gk f51743b;

    static {
        Covode.recordClassIndex(32276);
    }

    public final void run() {
        boolean r = this.f51743b.z.r();
        boolean o = this.f51743b.z.o();
        this.f51743b.z.a(this.f51742a);
        if (o == this.f51742a) {
            this.f51743b.z.q().f51476k.a("Default data collection state already set to", Boolean.valueOf(this.f51742a));
        }
        if (this.f51743b.z.r() == r || this.f51743b.z.r() != this.f51743b.z.o()) {
            this.f51743b.z.q().f51473h.a("Default data collection is different than actual status", Boolean.valueOf(this.f51742a), Boolean.valueOf(r));
        }
        this.f51743b.G();
    }

    ha(gk gkVar, boolean z) {
        this.f51743b = gkVar;
        this.f51742a = z;
    }
}
