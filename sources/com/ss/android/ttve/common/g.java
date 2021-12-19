package com.ss.android.ttve.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static volatile g f61076b;

    /* renamed from: a  reason: collision with root package name */
    public TESpdLogInvoker f61077a = new TESpdLogInvoker();

    static {
        Covode.recordClassIndex(37612);
    }

    private g() {
    }

    public enum a {
        LEVEL0,
        LEVEL1,
        LEVEL2,
        LEVEL3;

        static {
            Covode.recordClassIndex(37613);
        }
    }

    public static g a() {
        MethodCollector.i(3190);
        if (f61076b == null) {
            synchronized (g.class) {
                try {
                    if (f61076b == null) {
                        f61076b = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3190);
                    throw th;
                }
            }
        }
        g gVar = f61076b;
        MethodCollector.o(3190);
        return gVar;
    }
}
