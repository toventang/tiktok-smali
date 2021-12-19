package com.bytedance.ies.xelement.defaultimpl.player.engine.a.a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class b {
    static {
        Covode.recordClassIndex(22112);
    }

    public static <T> T a(Object obj, String str) {
        try {
            return (T) b(obj, str);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static <T> T b(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }
}
