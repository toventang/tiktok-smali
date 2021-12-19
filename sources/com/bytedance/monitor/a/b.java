package com.bytedance.monitor.a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Field> f41360a = new HashMap();

    static {
        Covode.recordClassIndex(25350);
    }

    public static Object a(Field field, Object obj) {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field.get(obj);
    }

    public static Object a(Object obj, String str) {
        Field a2 = a(obj.getClass(), str);
        if (a2 != null) {
            return a(a2, obj);
        }
        return null;
    }

    public static Field a(Class<?> cls, String str) {
        Field field;
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString()).append("#").append(str);
        String sb2 = sb.toString();
        Map<String, Field> map = f41360a;
        synchronized (map) {
            field = map.get(sb2);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Map<String, Field> map2 = f41360a;
                synchronized (map2) {
                    map2.put(sb2, declaredField);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }
}
