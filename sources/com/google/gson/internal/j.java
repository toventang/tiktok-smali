package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f54887a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f54888b;

    static {
        Covode.recordClassIndex(34046);
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        a(hashMap, hashMap2, Character.TYPE, Character.class);
        a(hashMap, hashMap2, Double.TYPE, Double.class);
        a(hashMap, hashMap2, Float.TYPE, Float.class);
        a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        a(hashMap, hashMap2, Long.TYPE, Long.class);
        a(hashMap, hashMap2, Short.TYPE, Short.class);
        a(hashMap, hashMap2, Void.TYPE, Void.class);
        f54887a = Collections.unmodifiableMap(hashMap);
        f54888b = Collections.unmodifiableMap(hashMap2);
    }

    public static <T> Class<T> a(Class<T> cls) {
        Class<T> cls2 = (Class<T>) f54887a.get(a.a(cls));
        if (cls2 == null) {
            return cls;
        }
        return cls2;
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
