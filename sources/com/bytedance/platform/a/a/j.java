package com.bytedance.platform.a.a;

import com.bytedance.covode.number.Covode;

public final class j {
    static {
        Covode.recordClassIndex(25569);
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
