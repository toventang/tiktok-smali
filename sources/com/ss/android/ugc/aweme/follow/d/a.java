package com.ss.android.ugc.aweme.follow.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class a {
    static {
        Covode.recordClassIndex(60955);
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13 || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 2 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 61 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
            return true;
        }
        return false;
    }
}
