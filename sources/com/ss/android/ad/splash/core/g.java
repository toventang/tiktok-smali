package com.ss.android.ad.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.b;

public class g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile g f58555c;

    /* renamed from: a  reason: collision with root package name */
    volatile b f58556a;

    /* renamed from: b  reason: collision with root package name */
    long f58557b;

    static {
        Covode.recordClassIndex(36313);
    }

    private g() {
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f58556a = null;
        this.f58557b = 0;
    }

    /* access modifiers changed from: package-private */
    public final b b() {
        if (Math.abs(System.currentTimeMillis() - this.f58557b) <= 10000) {
            return this.f58556a;
        }
        this.f58556a = null;
        return null;
    }

    public static g a() {
        MethodCollector.i(2523);
        if (f58555c == null) {
            synchronized (g.class) {
                try {
                    if (f58555c == null) {
                        f58555c = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2523);
                    throw th;
                }
            }
        }
        g gVar = f58555c;
        MethodCollector.o(2523);
        return gVar;
    }
}
