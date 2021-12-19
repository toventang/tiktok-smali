package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;

public enum SearchCardType {
    TYPE_NORMAL(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(71685);
    }

    private SearchCardType(int i2) {
        this.value = i2;
    }
}
