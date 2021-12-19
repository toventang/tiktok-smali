package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public enum InteractionTagInterestLevel {
    UNDEFINED(0),
    LOW(1),
    HIGH(2);
    
    private final int level;

    public final int getLevel() {
        return this.level;
    }

    static {
        Covode.recordClassIndex(59408);
    }

    private InteractionTagInterestLevel(int i2) {
        this.level = i2;
    }
}
