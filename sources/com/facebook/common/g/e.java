package com.facebook.common.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private static e f47090a;

    static {
        Covode.recordClassIndex(28656);
    }

    @Override // com.facebook.common.g.d
    public final void a(c cVar) {
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            MethodCollector.i(5056);
            if (f47090a == null) {
                f47090a = new e();
            }
            eVar = f47090a;
            MethodCollector.o(5056);
        }
        return eVar;
    }
}
