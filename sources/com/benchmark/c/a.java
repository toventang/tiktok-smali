package com.benchmark.c;

import com.benchmark.port.b;
import com.benchmark.port.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f6092a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<Integer, c> f6093b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(2960);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(1203);
        if (f6092a == null) {
            synchronized (a.class) {
                try {
                    if (f6092a == null) {
                        f6092a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1203);
                    throw th;
                }
            }
        }
        a aVar = f6092a;
        MethodCollector.o(1203);
        return aVar;
    }

    public final synchronized c a(int i2) {
        MethodCollector.i(1207);
        c cVar = null;
        if (!b.a()) {
            MethodCollector.o(1207);
            return null;
        }
        if (i2 <= 0) {
            i2 = b.f6095l.f6099d;
        }
        if (this.f6093b.containsKey(Integer.valueOf(i2))) {
            c cVar2 = this.f6093b.get(Integer.valueOf(i2));
            MethodCollector.o(1207);
            return cVar2;
        }
        synchronized (a.class) {
            try {
                if (this.f6093b.containsKey(Integer.valueOf(i2))) {
                    cVar = this.f6093b.get(Integer.valueOf(i2));
                } else if (b.a()) {
                    cVar = new com.benchmark.strategy.b();
                    this.f6093b.put(Integer.valueOf(i2), cVar);
                }
            } finally {
                MethodCollector.o(1207);
            }
        }
        return cVar;
    }
}
