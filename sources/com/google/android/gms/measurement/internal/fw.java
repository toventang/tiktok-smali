package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class fw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzw f51654a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f51655b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fg f51656c;

    static {
        Covode.recordClassIndex(32244);
    }

    public final void run() {
        this.f51656c.f51608a.k();
        if (this.f51654a.f52088c.a() == null) {
            this.f51656c.f51608a.b(this.f51654a, this.f51655b);
        } else {
            this.f51656c.f51608a.a(this.f51654a, this.f51655b);
        }
    }

    fw(fg fgVar, zzw zzw, zzn zzn) {
        this.f51656c = fgVar;
        this.f51654a = zzw;
        this.f51655b = zzn;
    }
}
