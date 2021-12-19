package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f72875a = new s();

    private s() {
    }

    static {
        Covode.recordClassIndex(44888);
    }

    public static final int a(Aweme aweme) {
        if (aweme == null || !aweme.isLike()) {
            return 0;
        }
        return 1;
    }

    public static final int b(Aweme aweme) {
        if (aweme == null || aweme.getFollowStatus() != 1) {
            return 0;
        }
        return 1;
    }
}
