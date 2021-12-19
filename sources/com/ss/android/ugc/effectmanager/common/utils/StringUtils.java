package com.ss.android.ugc.effectmanager.common.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class StringUtils {
    static {
        Covode.recordClassIndex(95348);
    }

    public static boolean substringSafetyCheck(String str, int i2, int i3) {
        if (!TextUtils.isEmpty(str) && i2 >= 0 && i3 >= 0 && i2 < i3 && i2 < str.length() && i3 <= str.length()) {
            return true;
        }
        return false;
    }
}
