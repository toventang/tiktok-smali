package com.bytedance.geckox.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.q.b.a;
import com.bytedance.q.d;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<? extends d<?, ?>>, com.bytedance.q.b.b> f29855a = new HashMap();

    static {
        Covode.recordClassIndex(17318);
    }

    public static a a(Class<? extends d<?, ?>> cls) {
        com.bytedance.q.b.b bVar;
        MethodCollector.i(11203);
        Map<Class<? extends d<?, ?>>, com.bytedance.q.b.b> map = f29855a;
        synchronized (map) {
            try {
                bVar = map.get(cls);
            } finally {
                MethodCollector.o(11203);
            }
        }
        return bVar;
    }

    public static void a(Class<? extends d<?, ?>> cls, a aVar) {
        MethodCollector.i(11202);
        Map<Class<? extends d<?, ?>>, com.bytedance.q.b.b> map = f29855a;
        synchronized (map) {
            try {
                com.bytedance.q.b.b bVar = map.get(cls);
                if (bVar == null) {
                    bVar = new com.bytedance.q.b.b(new a[0]);
                    map.put(cls, bVar);
                }
                bVar.f42368a.add(aVar);
            } finally {
                MethodCollector.o(11202);
            }
        }
    }
}
