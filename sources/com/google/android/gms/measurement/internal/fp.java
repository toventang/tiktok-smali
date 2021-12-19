package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

final class fp implements Callable<List<zzw>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51634a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51635b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51636c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ fg f51637d;

    static {
        Covode.recordClassIndex(32237);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzw> call() {
        this.f51637d.f51608a.k();
        return this.f51637d.f51608a.d().b(this.f51634a, this.f51635b, this.f51636c);
    }

    fp(fg fgVar, String str, String str2, String str3) {
        this.f51637d = fgVar;
        this.f51634a = str;
        this.f51635b = str2;
        this.f51636c = str3;
    }
}
