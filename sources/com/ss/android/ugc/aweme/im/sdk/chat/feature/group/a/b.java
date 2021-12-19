package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a;

import com.bytedance.covode.number.Covode;

public enum b {
    ONLY_CACHE(1),
    AT_MOST_DB(3);
    
    private final int flag;

    static {
        Covode.recordClassIndex(64268);
    }

    private b(int i2) {
        this.flag = i2;
    }
}
