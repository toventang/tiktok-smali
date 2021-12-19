package com.ss.android.ugc.aweme.ug.dynamicresource;

import com.bytedance.covode.number.Covode;

public enum k {
    IMAGE(0),
    AUDIO(1),
    VIDEO(2),
    FILE(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(92688);
    }

    private k(int i2) {
        this.value = i2;
    }
}
