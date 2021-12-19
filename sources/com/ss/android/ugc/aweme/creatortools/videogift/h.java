package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;

public enum h {
    NOT_SET(0),
    NO_ACCEPT(1),
    ACCEPT(2);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(48744);
    }

    private h(int i2) {
        this.value = i2;
    }
}
