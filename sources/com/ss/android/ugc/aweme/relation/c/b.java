package com.ss.android.ugc.aweme.relation.c;

import com.bytedance.covode.number.Covode;

public enum b {
    NONE(0),
    CONSENT(1),
    RECOMMEND(2),
    NEW_VERSION_CONTACT(3),
    NEW_VERSION_FACEBOOK(4),
    NEW_VERSION_RECOMMEND(5);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(78316);
    }

    private b(int i2) {
        this.value = i2;
    }
}
