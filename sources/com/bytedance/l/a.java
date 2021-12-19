package com.bytedance.l;

import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.utility.reflect.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class a extends com.bytedance.android.live.t.a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f39758a;

    static {
        Covode.recordClassIndex(24542);
    }

    /* renamed from: com.bytedance.l.a$a  reason: collision with other inner class name */
    static class C0975a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Object f39759a = null;

        static {
            Covode.recordClassIndex(24543);
        }

        C0975a() {
        }

        private static Object a(Class cls) {
            if (cls == Boolean.class) {
                return false;
            }
            if (cls == Integer.class || cls == Short.class || cls == Byte.class) {
                return 0;
            }
            if (cls == Double.class) {
                return Double.valueOf(0.0d);
            }
            if (cls == Character.class) {
                return "";
            }
            if (cls == Long.class) {
                return 0L;
            }
            if (cls == Float.class) {
                return Float.valueOf(0.0f);
            }
            return null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2 = this.f39759a;
            if (obj2 == null) {
                return a(Reflect.wrapper(method.getReturnType()));
            }
            try {
                return Reflect.on(obj2).call(method.getName(), method.getParameterTypes(), objArr).get();
            } catch (b unused) {
                return a(Reflect.wrapper(method.getReturnType()));
            }
        }
    }

    public static d a() {
        MethodCollector.i(1343);
        if (f39758a == null) {
            synchronized (a.class) {
                try {
                    if (f39758a == null) {
                        f39758a = (d) com.bytedance.common.utility.reflect.a.a("com.ss.android.ugc.aweme.live.Live", "getService", new Object[0]);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1343);
                    throw th;
                }
            }
        }
        d dVar = f39758a;
        MethodCollector.o(1343);
        return dVar;
    }

    public static <T extends com.bytedance.android.live.base.a> T b(Class<T> cls) {
        T t = (T) a(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) ((com.bytedance.android.live.base.a) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0975a()));
        a(cls, t2);
        return t2;
    }
}
