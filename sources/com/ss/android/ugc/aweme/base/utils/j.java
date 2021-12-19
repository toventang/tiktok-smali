package com.ss.android.ugc.aweme.base.utils;

import com.bytedance.covode.number.Covode;

public final class j {
    static {
        Covode.recordClassIndex(42136);
    }

    public static boolean a(String str) {
        int length;
        if (!(str == null || (length = str.length()) == 0)) {
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(str.charAt(i2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
