package com.bytedance.mobsec.metasec.ov;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import ms.bd.o.n1;

public final class c {
    static {
        Covode.recordClassIndex(25340);
    }

    public static synchronized b a(String str) {
        b bVar;
        synchronized (c.class) {
            MethodCollector.i(10775);
            n1.a a2 = n1.a(str);
            bVar = a2 != null ? new b(a2) : null;
            MethodCollector.o(10775);
        }
        return bVar;
    }

    public static synchronized boolean a(Context context, a aVar) {
        boolean a2;
        synchronized (c.class) {
            MethodCollector.i(10776);
            a2 = n1.a(context, aVar.f41347a, "metasec_ov");
            MethodCollector.o(10776);
        }
        return a2;
    }
}
