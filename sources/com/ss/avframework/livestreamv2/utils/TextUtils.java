package com.ss.avframework.livestreamv2.utils;

import com.bytedance.covode.number.Covode;

public class TextUtils {
    static {
        Covode.recordClassIndex(100495);
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean equals(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (str2 == null) {
            return false;
        } else {
            return str.equals(str2);
        }
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (str2 == null) {
            return false;
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }
}
