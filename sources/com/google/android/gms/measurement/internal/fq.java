package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

final class fq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzao f51638a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51639b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fg f51640c;

    static {
        Covode.recordClassIndex(32238);
    }

    public final void run() {
        this.f51640c.f51608a.k();
        this.f51640c.f51608a.a(this.f51638a, this.f51639b);
    }

    fq(fg fgVar, zzao zzao, String str) {
        this.f51640c = fgVar;
        this.f51638a = zzao;
        this.f51639b = str;
    }
}
