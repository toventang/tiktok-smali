package com.ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;

public enum d {
    Failed(0),
    Success(1),
    ArgumentError(10001),
    NoPermission(10003),
    AlreadyExists(10004);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(69636);
    }

    private d(int i2) {
        this.value = i2;
    }
}
