package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;

public final class f {
    static {
        Covode.recordClassIndex(59161);
    }

    public static String a(String str, boolean z) {
        if ("opus".equals(str)) {
            if (z) {
                return "personal_homepage";
            }
            return "others_homepage";
        } else if (!"collection".equals(str)) {
            return str;
        } else {
            if (z) {
                return "personal_collection";
            }
            return "others_collection";
        }
    }
}
