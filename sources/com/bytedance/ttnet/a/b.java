package com.bytedance.ttnet.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f44449a;

    static {
        Covode.recordClassIndex(27232);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(7285);
        if (f44449a == null) {
            synchronized (b.class) {
                try {
                    if (f44449a == null) {
                        f44449a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7285);
                    throw th;
                }
            }
        }
        b bVar = f44449a;
        MethodCollector.o(7285);
        return bVar;
    }
}
