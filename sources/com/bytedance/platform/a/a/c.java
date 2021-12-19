package com.bytedance.platform.a.a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class c {
    static {
        Covode.recordClassIndex(25560);
    }

    public static Field a(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            return null;
        }
    }
}
