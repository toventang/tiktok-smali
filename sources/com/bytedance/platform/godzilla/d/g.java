package com.bytedance.platform.godzilla.d;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public final class g {
    static {
        Covode.recordClassIndex(25662);
    }

    private static List<Class<?>> a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public static Object a(Object obj, InvocationHandler invocationHandler) {
        Class[] clsArr;
        List<Class<?>> a2 = a(obj.getClass());
        if (a2 == null || a2.size() <= 0) {
            clsArr = new Class[0];
        } else {
            clsArr = (Class[]) a2.toArray(new Class[a2.size()]);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), clsArr, invocationHandler);
    }

    private static void a(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (hashSet.add(cls2)) {
                    a(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
