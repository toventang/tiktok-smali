package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.google.gson.g;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static f f31870a;

    static {
        Covode.recordClassIndex(18633);
    }

    public static synchronized f a() {
        f fVar;
        synchronized (m.class) {
            MethodCollector.i(8538);
            if (f31870a == null) {
                g gVar = new g();
                gVar.f54715e = false;
                f31870a = gVar.b();
            }
            fVar = f31870a;
            MethodCollector.o(8538);
        }
        return fVar;
    }
}
