package com.bytedance.platform.godzilla.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Field> f41982a = new HashMap();

    static {
        Covode.recordClassIndex(25656);
    }

    private static Object a(Field field) {
        return a((Field) f.a(field, "The field must not be null"), (Object) null);
    }

    public static Object b(Class<?> cls, String str) {
        Field a2 = a(cls, str);
        if (a2 != null) {
            return a(a2);
        }
        return null;
    }

    public static Object a(Object obj, String str) {
        Object a2 = f.a(obj, "target object must not be null");
        Field a3 = a(a2.getClass(), str);
        if (a3 != null) {
            return a(a3, a2);
        }
        return null;
    }

    private static Object a(Field field, Object obj) {
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    public static Field a(Class<?> cls, String str) {
        Field field;
        Field field2;
        MethodCollector.i(3192);
        Class cls2 = (Class) f.a(cls, "The class must not be null");
        f.a(!TextUtils.isEmpty(str), "The field name must not be blank");
        StringBuilder sb = new StringBuilder();
        sb.append(cls2.toString()).append("#").append(str);
        String sb2 = sb.toString();
        Map<String, Field> map = f41982a;
        synchronized (map) {
            try {
                field = map.get(sb2);
            } finally {
                MethodCollector.o(3192);
            }
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls2 != null) {
            try {
                if (!e.a() || c.f41986a == null || (field2 = c.f41986a.a()) == null) {
                    field2 = cls2.getDeclaredField(str);
                }
                if (field2 != null) {
                    if (!field2.isAccessible()) {
                        field2.setAccessible(true);
                    }
                    Map<String, Field> map2 = f41982a;
                    synchronized (map2) {
                        try {
                            map2.put(sb2, field2);
                        } finally {
                            MethodCollector.o(3192);
                        }
                    }
                }
                return field2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        MethodCollector.o(3192);
        return null;
    }

    public static void a(Object obj, String str, Object obj2) {
        Object a2 = f.a(obj, "target object must not be null");
        Field a3 = a(a2.getClass(), str);
        if (a3 != null) {
            a(a3, a2, obj2);
        }
    }

    private static void a(Field field, Object obj, Object obj2) {
        Field field2 = (Field) f.a(field, "The field must not be null");
        if (!field2.isAccessible()) {
            field2.setAccessible(true);
        }
        field2.set(obj, obj2);
    }
}
