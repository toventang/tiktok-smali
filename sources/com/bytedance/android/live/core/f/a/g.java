package com.bytedance.android.live.core.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static g f9044b;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Integer> f9045a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(4604);
    }

    private g() {
    }

    public static g a() {
        MethodCollector.i(10162);
        g gVar = f9044b;
        if (gVar != null) {
            MethodCollector.o(10162);
            return gVar;
        }
        synchronized (g.class) {
            try {
                if (f9044b == null) {
                    f9044b = new g();
                }
            } catch (Throwable th) {
                MethodCollector.o(10162);
                throw th;
            }
        }
        g gVar2 = f9044b;
        MethodCollector.o(10162);
        return gVar2;
    }
}
