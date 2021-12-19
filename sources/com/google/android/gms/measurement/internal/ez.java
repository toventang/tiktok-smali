package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import java.lang.Thread;

/* access modifiers changed from: package-private */
public final class ez implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f51582a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ex f51583b;

    static {
        Covode.recordClassIndex(32220);
    }

    public ez(ex exVar, String str) {
        this.f51583b = exVar;
        r.a((Object) str);
        this.f51582a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        MethodCollector.i(7927);
        this.f51583b.q().f51468c.a(this.f51582a, th);
        MethodCollector.o(7927);
    }
}
