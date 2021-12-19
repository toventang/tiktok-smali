package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class en extends em {
    static {
        Covode.recordClassIndex(31761);
    }

    public static int a(int i2, int i3) {
        if (i3 <= 1073741823) {
            return Math.min(Math.max(i2, i3), 1073741823);
        }
        throw new IllegalArgumentException(cn.a("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i3), 1073741823));
    }
}
