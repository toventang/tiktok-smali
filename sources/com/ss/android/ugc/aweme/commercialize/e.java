package com.ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;

public final class e {
    static {
        Covode.recordClassIndex(45447);
    }

    public static String a(String str, String str2) {
        if (str.contains("{UID}") || str.contains("__UID__")) {
            return str.replace("{UID}", str2).replace("__UID__", str2);
        }
        return str;
    }
}
