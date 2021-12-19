package com.ss.android.ugc.aweme.cc;

import com.bytedance.covode.number.Covode;

public enum b {
    SUCCESS(0),
    FAIL(1),
    CANCEL(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(43029);
    }

    private b(int i2) {
        this.value = i2;
    }
}
