package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

final class fk implements Callable<List<jw>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51618a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51619b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51620c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ fg f51621d;

    static {
        Covode.recordClassIndex(32232);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jw> call() {
        this.f51621d.f51608a.k();
        return this.f51621d.f51608a.d().a(this.f51618a.f52073a, this.f51619b, this.f51620c);
    }

    fk(fg fgVar, zzn zzn, String str, String str2) {
        this.f51621d = fgVar;
        this.f51618a = zzn;
        this.f51619b = str;
        this.f51620c = str2;
    }
}
