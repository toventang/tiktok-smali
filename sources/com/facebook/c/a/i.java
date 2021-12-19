package com.facebook.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    private static i f46956a;

    static {
        Covode.recordClassIndex(28576);
    }

    @Override // com.facebook.c.a.d
    public final void a(c cVar) {
    }

    private i() {
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            MethodCollector.i(1076);
            if (f46956a == null) {
                f46956a = new i();
            }
            iVar = f46956a;
            MethodCollector.o(1076);
        }
        return iVar;
    }
}
