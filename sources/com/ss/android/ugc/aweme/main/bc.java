package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;

public abstract /* synthetic */ class bc {
    static {
        Covode.recordClassIndex(69926);
    }

    public static String a(String str) {
        try {
            return a(Integer.valueOf(str));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "HOME";
        }
        if (intValue == 1) {
            return "DISCOVER";
        }
        if (intValue == 2) {
            return "PUBLISH";
        }
        if (intValue == 3) {
            return "NOTIFICATION";
        }
        if (intValue != 4) {
            return intValue != 5 ? "" : "DISCOVER";
        }
        return "USER";
    }
}
