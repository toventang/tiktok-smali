package com.ss.android.ugc.aweme.base.ui.session;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f68415b;

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, a> f68416a = new HashMap<>();

    static {
        Covode.recordClassIndex(42119);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(4169);
        if (f68415b == null) {
            synchronized (c.class) {
                try {
                    if (f68415b == null) {
                        f68415b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4169);
                    throw th;
                }
            }
        }
        c cVar = f68415b;
        MethodCollector.o(4169);
        return cVar;
    }

    public final synchronized void a(a aVar) {
        MethodCollector.i(4216);
        this.f68416a.values().remove(aVar);
        MethodCollector.o(4216);
    }

    public final synchronized <T> a<T> b(String str) {
        a<T> aVar;
        MethodCollector.i(4209);
        aVar = this.f68416a.get(str);
        MethodCollector.o(4209);
        return aVar;
    }

    public final synchronized <T> a<T> a(String str) {
        a<T> aVar;
        MethodCollector.i(4173);
        if (!this.f68416a.containsKey(str)) {
            this.f68416a.put(str, new a());
        }
        aVar = this.f68416a.get(str);
        MethodCollector.o(4173);
        return aVar;
    }
}
