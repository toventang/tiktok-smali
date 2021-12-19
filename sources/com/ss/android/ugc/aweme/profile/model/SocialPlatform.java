package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;

public final class SocialPlatform {
    public static final SocialPlatform INSTANCE = new SocialPlatform();

    private SocialPlatform() {
    }

    static {
        Covode.recordClassIndex(75259);
    }
}
