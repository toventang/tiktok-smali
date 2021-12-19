package com.bytedance.monitor.collector.a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b;
import com.bytedance.monitor.a.e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a {
    static {
        Covode.recordClassIndex(25391);
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 27 || Build.VERSION.PREVIEW_SDK_INT <= 0) {
            return false;
        }
        return true;
    }

    public static Object a(Object obj, String str) {
        try {
            return a(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static Field b(Class<?> cls, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field a(Class<?> cls, String str) {
        if (!a()) {
            return b.a(cls, str);
        }
        try {
            return b(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method b(Class<?> cls, String str, Class... clsArr) {
        if (a()) {
            try {
                return a(cls, str, clsArr);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            try {
                return e.a(cls, str, (Class<?>[]) clsArr);
            } catch (Throwable unused2) {
                return null;
            }
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
