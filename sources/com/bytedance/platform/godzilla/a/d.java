package com.bytedance.platform.godzilla.a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class d {
    static {
        Covode.recordClassIndex(25620);
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
