package com.facebook.common.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private static c f47053a;

    static {
        Covode.recordClassIndex(28611);
    }

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            MethodCollector.i(5440);
            if (f47053a == null) {
                f47053a = new c();
            }
            cVar = f47053a;
            MethodCollector.o(5440);
        }
        return cVar;
    }
}
