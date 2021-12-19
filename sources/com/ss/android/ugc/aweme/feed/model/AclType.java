package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public enum AclType {
    SHARE_THIRD_PLATFORM,
    PLATFORM_LIST,
    SHARE_GENERAL;

    static {
        Covode.recordClassIndex(59286);
    }
}
