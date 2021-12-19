package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public enum AwemeBubbleBusiness {
    PROMOTE(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(59316);
    }

    private AwemeBubbleBusiness(int i2) {
        this.value = i2;
    }
}
