package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class js implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzn f51961a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ jo f51962b;

    static {
        Covode.recordClassIndex(32349);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        ec c2 = this.f51962b.c(this.f51961a);
        if (c2 != null) {
            return c2.c();
        }
        this.f51962b.q().f51471f.a("App info was null when attempting to get app instance id");
        return null;
    }

    js(jo joVar, zzn zzn) {
        this.f51962b = joVar;
        this.f51961a = zzn;
    }
}
