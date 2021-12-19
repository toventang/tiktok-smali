package com.ss.android.ugc.aweme.ug.dynamicresource;

import com.bytedance.covode.number.Covode;

public enum f {
    NO_PRELOAD(0),
    HIGH(1),
    NORMAL(2),
    LOW(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(92682);
    }

    private f(int i2) {
        this.value = i2;
    }
}
