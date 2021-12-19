package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;

public enum d {
    UNKNOWN(0),
    VIEWER(1),
    ANCHOR(2);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(12197);
    }

    private d(int i2) {
        this.value = i2;
    }
}
