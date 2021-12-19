package com.google.c.c;

import com.bytedance.covode.number.Covode;

public final class k {
    static {
        Covode.recordClassIndex(33515);
    }

    public static int a(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    static void b(int i2, String str) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(str + " must be positive but was: " + i2);
        }
    }

    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}
