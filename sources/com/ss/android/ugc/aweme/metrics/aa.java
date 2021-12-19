package com.ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.in;

public final class aa {
    static {
        Covode.recordClassIndex(70095);
    }

    public static String a(Aweme aweme) {
        if (b.g().isLogin() && aweme != null && aweme.getAuthor() != null && !in.g(aweme.getAuthor())) {
            return String.valueOf(aweme.getFollowStatus());
        }
        return "";
    }
}
