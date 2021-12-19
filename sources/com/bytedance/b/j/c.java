package com.bytedance.b.j;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Class, Object> f26302a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, a<?>> f26303b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, b> f26304c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(15269);
    }

    public static <T> T a(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = f26302a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (c.class) {
                ConcurrentHashMap<Class, a<?>> concurrentHashMap2 = f26303b;
                a<?> aVar = concurrentHashMap2.get(cls);
                if (aVar != null) {
                    t = (T) aVar.a();
                    concurrentHashMap2.remove(cls);
                    if (t != null) {
                        concurrentHashMap.put(cls, t);
                        ConcurrentHashMap<Class, b> concurrentHashMap3 = f26304c;
                        if (concurrentHashMap3.get(cls) != null) {
                            concurrentHashMap3.remove(cls);
                        }
                        return t;
                    }
                }
            }
        }
        return t;
    }

    public static <T> void a(Class<T> cls, a<T> aVar) {
        f26303b.put(cls, aVar);
    }
}
