package com.bytedance.android.livesdk.rank.api;

import com.bytedance.covode.number.Covode;

public enum i {
    DEFALUT(-1),
    RANKINGS_SWITCH_STATUS_HIDE(0),
    RANKINGS_SWITCH_STATUS_ON(1),
    RANKINGS_SWITCH_STATUS_OFF(2);
    
    private final long value;

    public final long getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(12166);
    }

    private i(long j2) {
        this.value = j2;
    }
}
