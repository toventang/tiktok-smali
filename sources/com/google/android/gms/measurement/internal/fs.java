package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class fs implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzkr f51644a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f51645b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fg f51646c;

    static {
        Covode.recordClassIndex(32240);
    }

    public final void run() {
        this.f51646c.f51608a.k();
        if (this.f51644a.a() == null) {
            this.f51646c.f51608a.b(this.f51644a, this.f51645b);
        } else {
            this.f51646c.f51608a.a(this.f51644a, this.f51645b);
        }
    }

    fs(fg fgVar, zzkr zzkr, zzn zzn) {
        this.f51646c = fgVar;
        this.f51644a = zzkr;
        this.f51645b = zzn;
    }
}
