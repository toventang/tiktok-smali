package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;

public enum PowerPageState {
    Reset(0),
    Loading(1),
    Loaded(2),
    Error(3),
    End(4);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(20516);
    }

    private PowerPageState(int i2) {
        this.value = i2;
    }
}
