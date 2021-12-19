package com.ss.android.ugc.aweme.ug.dynamicresource;

import com.bytedance.covode.number.Covode;

public enum g {
    IDLE(0),
    DOWNLOADING(1),
    SUCCESS(2),
    FAIL(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(92683);
    }

    private g(int i2) {
        this.value = i2;
    }
}
