package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

final class fm implements Callable<List<zzw>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51624a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51625b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51626c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ fg f51627d;

    static {
        Covode.recordClassIndex(32234);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzw> call() {
        this.f51627d.f51608a.k();
        return this.f51627d.f51608a.d().b(this.f51624a.f52073a, this.f51625b, this.f51626c);
    }

    fm(fg fgVar, zzn zzn, String str, String str2) {
        this.f51627d = fgVar;
        this.f51624a = zzn;
        this.f51625b = str;
        this.f51626c = str2;
    }
}
