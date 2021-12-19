package com.google.c.f;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(33564);
    }

    public static int a(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }
}
