package com.ss.android.ugc.aweme.setting.utils;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;

public final class l {
    static {
        Covode.recordClassIndex(80801);
    }

    public static <T> T a(String str, Class cls) {
        T t;
        try {
            t = (T) Reflect.on(str).create().get();
            try {
                cls.getSimpleName();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            t = null;
        }
        if (t == null) {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : declaredConstructors) {
                try {
                    constructor.setAccessible(true);
                    t = (T) constructor.newInstance(new Object[0]);
                    cls.getSimpleName();
                    break;
                } catch (Throwable unused3) {
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new RuntimeException("cannot find service in " + str + "  or cannot create service through " + cls.getSimpleName());
    }
}
