package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;

public class ValueConvertUtil {
    static {
        Covode.recordClassIndex(95351);
    }

    public static long ConvertStringToLong(String str, long j2) {
        if (str == null || str.isEmpty()) {
            return j2;
        }
        try {
            j2 = Long.valueOf(str).longValue();
            return j2;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return j2;
        }
    }
}
