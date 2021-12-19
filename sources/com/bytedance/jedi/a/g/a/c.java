package com.bytedance.jedi.a.g.a;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class c {
    static {
        Covode.recordClassIndex(23987);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalStateException(d.a(str, Long.valueOf(j2)));
        }
    }
}
