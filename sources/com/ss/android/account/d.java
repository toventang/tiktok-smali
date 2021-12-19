package com.ss.android.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.account.a.b;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f58190b;

    /* renamed from: a  reason: collision with root package name */
    public b f58191a;

    static {
        Covode.recordClassIndex(36170);
    }

    private d() {
    }

    public static d a() {
        MethodCollector.i(11642);
        if (f58190b == null) {
            synchronized (d.class) {
                try {
                    if (f58190b == null) {
                        f58190b = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11642);
                    throw th;
                }
            }
        }
        d dVar = f58190b;
        MethodCollector.o(11642);
        return dVar;
    }
}
