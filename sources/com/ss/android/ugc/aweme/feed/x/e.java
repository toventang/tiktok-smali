package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class e {
    static {
        Covode.recordClassIndex(60371);
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return true;
    }
}
