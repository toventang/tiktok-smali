package com.google.c.f;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f54126a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f54127b;

    static {
        Covode.recordClassIndex(33565);
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
        f54126a = Collections.unmodifiableMap(hashMap);
        f54127b = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
