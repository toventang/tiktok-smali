package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(33941);
    }

    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
