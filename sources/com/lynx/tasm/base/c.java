package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;

public class c {
    static {
        Covode.recordClassIndex(34876);
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    public static void a(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
