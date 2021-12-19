package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public enum AwemeBubbleType {
    LEFT(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(59319);
    }

    private AwemeBubbleType(int i2) {
        this.value = i2;
    }
}
