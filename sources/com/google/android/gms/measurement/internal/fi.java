package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

final class fi implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51613a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fg f51614b;

    static {
        Covode.recordClassIndex(32230);
    }

    public final void run() {
        this.f51614b.f51608a.k();
        jo joVar = this.f51614b.f51608a;
        zzn zzn = this.f51613a;
        joVar.p().c();
        joVar.h();
        r.a(zzn.f52073a);
        joVar.c(zzn);
    }

    fi(fg fgVar, zzn zzn) {
        this.f51614b = fgVar;
        this.f51613a = zzn;
    }
}
