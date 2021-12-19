package com.bytedance.lobby.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f40145a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, b> f40146b = new androidx.c.a();

    static {
        Covode.recordClassIndex(24748);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(7418);
        if (f40145a == null) {
            synchronized (a.class) {
                try {
                    if (f40145a == null) {
                        f40145a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7418);
                    throw th;
                }
            }
        }
        a aVar = f40145a;
        MethodCollector.o(7418);
        return aVar;
    }

    public final synchronized void a(b bVar) {
        MethodCollector.i(7423);
        this.f40146b.put(bVar.e().f40176b, bVar);
        MethodCollector.o(7423);
    }
}
