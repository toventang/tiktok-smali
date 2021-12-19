package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;

public final class ShoutoutsProductStatus {
    public static final ShoutoutsProductStatus INSTANCE = new ShoutoutsProductStatus();

    private ShoutoutsProductStatus() {
    }

    static {
        Covode.recordClassIndex(87105);
    }
}
