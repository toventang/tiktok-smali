package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

public enum CardType {
    TYPE_NORMAL(1),
    TYPE_CLUSTER(2),
    TYPE_MUSICIAN(3),
    TYPE_USER_NOTE(4),
    TYPE_TRENDING_SOUNDS_TITLE(5);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(50874);
    }

    private CardType(int i2) {
        this.value = i2;
    }
}
