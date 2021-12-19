package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final class ft implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzao f51647a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51648b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ fg f51649c;

    static {
        Covode.recordClassIndex(32241);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.f51649c.f51608a.k();
        jo joVar = this.f51649c.f51608a;
        jo.a(joVar.f51939a);
        return joVar.f51939a.a(this.f51647a, this.f51648b);
    }

    ft(fg fgVar, zzao zzao, String str) {
        this.f51649c = fgVar;
        this.f51647a = zzao;
        this.f51648b = str;
    }
}
