package com.bytedance.platform.godzilla.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.d.a;
import com.bytedance.platform.godzilla.d.e;
import java.lang.reflect.Field;

public final class c {
    static {
        Covode.recordClassIndex(25619);
    }

    public static Field a(Class<?> cls, String str) {
        if (!e.a()) {
            return a.a(cls, str);
        }
        try {
            return d.a(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
