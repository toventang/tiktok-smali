package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

final class fn implements Callable<List<jw>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51628a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51629b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51630c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ fg f51631d;

    static {
        Covode.recordClassIndex(32235);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jw> call() {
        this.f51631d.f51608a.k();
        return this.f51631d.f51608a.d().a(this.f51628a, this.f51629b, this.f51630c);
    }

    fn(fg fgVar, String str, String str2, String str3) {
        this.f51631d = fgVar;
        this.f51628a = str;
        this.f51629b = str2;
        this.f51630c = str3;
    }
}
