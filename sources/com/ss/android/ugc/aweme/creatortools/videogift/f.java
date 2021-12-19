package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;

public enum f {
    STATUS_UNKNOWN(0),
    STATUS_PASS(1),
    STATUS_FAIL(2);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(48742);
    }

    private f(int i2) {
        this.value = i2;
    }
}
