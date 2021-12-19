package com.bytedance.ies.im.core.api.a;

import com.bytedance.covode.number.Covode;

public enum a {
    UNKNOWN(-1),
    LOGIN(0),
    LOGOUT(1),
    SWITCH(2);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(20180);
    }

    private a(int i2) {
        this.value = i2;
    }
}
