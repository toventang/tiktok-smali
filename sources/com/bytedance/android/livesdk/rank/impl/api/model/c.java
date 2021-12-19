package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;

public enum c {
    UNKNOWN_STATUS(0),
    VIEWER1_ANCHOR2(1),
    VIEWER1_ANCHOR1(2),
    VIEWER1_ANCHOR0(3),
    VIEWER0_ANCHOR1(4),
    NOT_SUPPORT_VIEWER(5);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(12196);
    }

    private c(int i2) {
        this.value = i2;
    }
}
