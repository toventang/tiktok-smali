package com.ss.android.ugc.aweme.global.config.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f99079a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f99080b;

    static {
        Covode.recordClassIndex(63005);
    }

    private d() {
    }

    public final boolean b() {
        boolean z;
        MethodCollector.i(135);
        synchronized (d.class) {
            try {
                z = this.f99080b;
            } finally {
                MethodCollector.o(135);
            }
        }
        return z;
    }

    public static d a() {
        MethodCollector.i(134);
        if (f99079a == null) {
            synchronized (d.class) {
                try {
                    if (f99079a == null) {
                        f99079a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(134);
                    throw th;
                }
            }
        }
        d dVar = f99079a;
        MethodCollector.o(134);
        return dVar;
    }

    public final void a(boolean z) {
        MethodCollector.i(136);
        synchronized (d.class) {
            try {
                this.f99080b = z;
            } finally {
                MethodCollector.o(136);
            }
        }
    }
}
