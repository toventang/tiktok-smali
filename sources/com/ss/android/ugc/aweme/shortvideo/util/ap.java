package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;

public final class ap {
    static {
        Covode.recordClassIndex(86594);
    }

    public static boolean a(float f2, float f3, float f4) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            if (!Float.isNaN(f2) || !Float.isNaN(f3)) {
                return false;
            }
            return true;
        } else if (Math.abs(f3 - f2) < f4) {
            return true;
        } else {
            return false;
        }
    }
}
