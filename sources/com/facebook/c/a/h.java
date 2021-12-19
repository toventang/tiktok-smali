package com.facebook.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private static h f46955a;

    static {
        Covode.recordClassIndex(28575);
    }

    private h() {
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            MethodCollector.i(2375);
            if (f46955a == null) {
                f46955a = new h();
            }
            hVar = f46955a;
            MethodCollector.o(2375);
        }
        return hVar;
    }
}
