package com.ss.android.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.account.c.a;

public class e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f58192b;

    /* renamed from: a  reason: collision with root package name */
    public a f58193a;

    static {
        Covode.recordClassIndex(36171);
    }

    private e() {
    }

    public static e a() {
        MethodCollector.i(11641);
        if (f58192b == null) {
            synchronized (e.class) {
                try {
                    if (f58192b == null) {
                        f58192b = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11641);
                    throw th;
                }
            }
        }
        e eVar = f58192b;
        MethodCollector.o(11641);
        return eVar;
    }
}
