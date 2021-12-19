package com.bytedance.news.common.service.manager;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, Object> f41598a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, a<?>> f41599b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, b> f41600c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(25452);
    }

    private static <T> T b(Class<T> cls) {
        try {
            Object newInstance = Class.forName(a.a("%s__ServiceProxy", new Object[]{cls.getName()})).newInstance();
            if (newInstance instanceof IServiceProxy) {
                return (T) ((IServiceProxy) newInstance).newInstance();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(Class<T> cls) {
        MethodCollector.i(3928);
        ConcurrentHashMap<Class, Object> concurrentHashMap = f41598a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (cls) {
                try {
                    T t2 = (T) concurrentHashMap.get(cls);
                    if (t2 != null) {
                        return t2;
                    }
                    ConcurrentHashMap<Class, a<?>> concurrentHashMap2 = f41599b;
                    a<?> aVar = concurrentHashMap2.get(cls);
                    if (aVar != null) {
                        T t3 = (T) aVar.a();
                        concurrentHashMap2.remove(cls);
                        if (t3 != null) {
                            b(cls, t3);
                            MethodCollector.o(3928);
                            return t3;
                        }
                    }
                    t = (T) b(cls);
                    if (t != null) {
                        b(cls, t);
                        MethodCollector.o(3928);
                        return t;
                    }
                } finally {
                    MethodCollector.o(3928);
                }
            }
        }
        MethodCollector.o(3928);
        return t;
    }

    public static <T> void a(Class<T> cls, a<T> aVar) {
        f41599b.put(cls, aVar);
    }

    public static <T> void a(Class<T> cls, T t) {
        f41598a.put(cls, t);
    }

    private static <T> void b(Class<T> cls, T t) {
        f41598a.put(cls, t);
        ConcurrentHashMap<Class, b> concurrentHashMap = f41600c;
        if (concurrentHashMap.get(cls) != null) {
            concurrentHashMap.remove(cls);
        }
    }
}
