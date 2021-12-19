package com.ss.android.http.a.d;

import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(36769);
    }

    public static int a(int i2, Object obj) {
        int i3;
        if (obj != null) {
            i3 = obj.hashCode();
        } else {
            i3 = 0;
        }
        return (i2 * 37) + i3;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
