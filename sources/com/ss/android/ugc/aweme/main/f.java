package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class f {
    static {
        Covode.recordClassIndex(69964);
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
}
