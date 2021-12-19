package com.bytedance.bpea.core.c;

import com.bytedance.covode.number.Covode;

public enum d {
    INFO(0),
    WARN(2),
    ERROR(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(15686);
    }

    private d(int i2) {
        this.value = i2;
    }
}
