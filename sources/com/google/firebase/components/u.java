package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class u {
    static {
        Covode.recordClassIndex(33741);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
