package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Constructor<?>> f5041a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final NoOpControllerHelper f5042b = new NoOpControllerHelper();

    static {
        Covode.recordClassIndex(2127);
    }

    static f a(n nVar) {
        Constructor<?> a2 = a(nVar.getClass());
        if (a2 == null) {
            return f5042b;
        }
        try {
            return (f) a2.newInstance(nVar);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(a2)), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Unable to invoke ".concat(String.valueOf(a2)), e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            } else if (cause instanceof Error) {
                throw cause;
            } else {
                throw new RuntimeException("Unable to get Epoxy helper class.", cause);
            }
        }
    }

    private static Constructor<?> a(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class<?>, Constructor<?>> map = f5041a;
        Constructor<?> constructor2 = map.get(cls);
        if (constructor2 != null || map.containsKey(cls)) {
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            constructor = Class.forName(name + "_EpoxyHelper").getConstructor(cls);
        } catch (ClassNotFoundException unused) {
            constructor = a(cls.getSuperclass());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Unable to find Epoxy Helper constructor for ".concat(String.valueOf(name)), e2);
        }
        f5041a.put(cls, constructor);
        return constructor;
    }
}
