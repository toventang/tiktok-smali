package com.ss.android.ugc.aweme.base.utils;

import com.bytedance.covode.number.Covode;

public final class g {
    static {
        Covode.recordClassIndex(42133);
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
