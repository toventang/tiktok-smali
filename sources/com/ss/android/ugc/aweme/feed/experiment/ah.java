package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;

public final class ah {
    static {
        Covode.recordClassIndex(59008);
    }

    public static boolean a(String str) {
        if ("homepage_hot".equalsIgnoreCase(str) || "homepage_follow".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }
}
