package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;

public final class FollowingVisibility {
    public static final FollowingVisibility INSTANCE = new FollowingVisibility();

    private FollowingVisibility() {
    }

    static {
        Covode.recordClassIndex(75224);
    }
}
