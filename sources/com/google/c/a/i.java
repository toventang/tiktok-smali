package com.google.c.a;

import com.bytedance.covode.number.Covode;

public final class i extends e {
    static {
        Covode.recordClassIndex(33245);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
