package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;

public enum co {
    TEXT_TYPE_TITLE(1),
    TEXT_TYPE_OTHER(2);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(82193);
    }

    private co(int i2) {
        this.value = i2;
    }
}
