package com.bytedance.platform.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Field> f41805a = new HashMap();

    static {
        Covode.recordClassIndex(25561);
    }

    public static Field a(Class<?> cls, String str) {
        Field field;
        Field field2;
        MethodCollector.i(6317);
        Class cls2 = (Class) j.a(cls, "The class must not be null");
        j.a(!TextUtils.isEmpty(str), "The field name must not be blank");
        StringBuilder sb = new StringBuilder();
        sb.append(cls2.toString()).append("#").append(str);
        String sb2 = sb.toString();
        Map<String, Field> map = f41805a;
        synchronized (map) {
            try {
                field = map.get(sb2);
            } finally {
                MethodCollector.o(6317);
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
                if (!i.a() || (field2 = b.a(cls2, str)) == null) {
                    field2 = cls2.getDeclaredField(str);
                }
                if (!field2.isAccessible()) {
                    field2.setAccessible(true);
                }
                Map<String, Field> map2 = f41805a;
                synchronized (map2) {
                    try {
                        map2.put(sb2, field2);
                    } finally {
                        MethodCollector.o(6317);
                    }
                }
                return field2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        MethodCollector.o(6317);
        return null;
    }
}
