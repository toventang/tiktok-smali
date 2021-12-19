package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;

public final class ax {
    static {
        Covode.recordClassIndex(86604);
    }

    public static final boolean a(float f2, float f3) {
        if (Math.abs(f2 - f3) <= 0.01f) {
            return true;
        }
        return false;
    }
}
