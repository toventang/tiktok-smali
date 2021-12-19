package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class l {
    static {
        Covode.recordClassIndex(60379);
    }

    public static final String a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        String aid = aweme.getAid();
        if (aid == null || aid.length() == 0) {
            return aweme.getFakeAid();
        }
        return aweme.getAid();
    }
}
