package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

public final class ck extends ci {
    static {
        Covode.recordClassIndex(31704);
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
