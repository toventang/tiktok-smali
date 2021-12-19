package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static HashMap<Class, HashMap<String, Method>> f56452a = new HashMap<>();

    static {
        Covode.recordClassIndex(35223);
    }

    public static HashMap<String, Method> a(Class<? extends LynxBaseUI> cls) {
        if (cls == null) {
            return null;
        }
        return b(cls);
    }

    private static HashMap<String, Method> b(Class<?> cls) {
        if (f56452a.containsKey(cls)) {
            return f56452a.get(cls);
        }
        HashMap<String, Method> hashMap = new HashMap<>();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (method.getAnnotation(p.class) != null) {
                hashMap.put(method.getName(), method);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            hashMap.putAll(b(superclass));
        }
        f56452a.put(cls, hashMap);
        return hashMap;
    }
}
