package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;

public enum g {
    UNKNOWN(0),
    HOURLY_RANK_ENTRANCE(1),
    HOURLY_RANK_LIST(2),
    HOURLY_RANK_BOTTOM(3),
    ONLINE_AUDIENCE(4);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(12200);
    }

    private g(int i2) {
        this.value = i2;
    }
}
