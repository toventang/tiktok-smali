package com.bytedance.platform.a.a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class b {
    static {
        Covode.recordClassIndex(25559);
    }

    public static Field a(Class<?> cls, String str) {
        if (!i.a()) {
            return d.a(cls, str);
        }
        try {
            return c.a(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (!i.a()) {
            return h.a(cls, str, (Class[]) clsArr);
        }
        try {
            return c.a(cls, str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
