package com.bytedance.android.livesdk.ah;

import com.bytedance.covode.number.Covode;

final class a {
    static {
        Covode.recordClassIndex(7608);
    }

    public static <T> int a(T... tArr) {
        int hashCode;
        if (tArr == null) {
            return 0;
        }
        int i2 = 1;
        for (T t : tArr) {
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            i2 = ((i2 << 5) - i2) ^ hashCode;
        }
        return i2;
    }
}
