package com.bytedance.push.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, Object> f42308a = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25845);
    }

    public static <T> T a(Class<T> cls, c cVar) {
        MethodCollector.i(6936);
        ConcurrentHashMap<Class, Object> concurrentHashMap = f42308a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (b.class) {
                try {
                    t = concurrentHashMap.get(cls);
                    if (t == null && (t = (T) cVar.a(cls)) != null) {
                        concurrentHashMap.put(cls, t);
                    }
                } finally {
                    MethodCollector.o(6936);
                }
            }
        }
        return t;
    }
}
