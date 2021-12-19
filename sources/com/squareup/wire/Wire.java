package com.squareup.wire;

import com.bytedance.covode.number.Covode;

public final class Wire {
    static {
        Covode.recordClassIndex(36135);
    }

    public static <T> T get(T t, T t2) {
        return t != null ? t : t2;
    }

    private Wire() {
    }
}
