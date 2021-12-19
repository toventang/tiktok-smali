package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class x {
    static {
        Covode.recordClassIndex(60394);
    }

    public static boolean a(Aweme aweme, int i2) {
        if (!aweme.isCollected() || i2 != 2004) {
            return false;
        }
        return true;
    }
}
