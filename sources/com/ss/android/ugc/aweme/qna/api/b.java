package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;

public enum b {
    UNKNOWN(0),
    CAMERA(1),
    SUGGEST(2);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(77455);
    }

    private b(int i2) {
        this.value = i2;
    }
}
