package com.benchmark.a;

import com.benchmark.tools.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static e.c f6028a;

    static {
        Covode.recordClassIndex(2938);
    }

    public static void a(Throwable th) {
        e.c cVar = f6028a;
        if (cVar != null) {
            cVar.a(th);
        }
    }

    public static synchronized void a(e.c cVar) {
        synchronized (c.class) {
            MethodCollector.i(6421);
            f6028a = cVar;
            MethodCollector.o(6421);
        }
    }
}
