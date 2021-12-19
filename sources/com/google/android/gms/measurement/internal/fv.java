package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

final class fv implements Callable<List<jw>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51652a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fg f51653b;

    static {
        Covode.recordClassIndex(32243);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jw> call() {
        this.f51653b.f51608a.k();
        return this.f51653b.f51608a.d().a(this.f51652a.f52073a);
    }

    fv(fg fgVar, zzn zzn) {
        this.f51653b = fgVar;
        this.f51652a = zzn;
    }
}
