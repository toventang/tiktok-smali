package com.bytedance.bdturing.e;

import com.bytedance.covode.number.Covode;

public enum e {
    CN("cn"),
    SINGAPOER("sg"),
    USA_EAST("va"),
    INDIA("in"),
    BOE("boe");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(15563);
    }

    private e(String str) {
        this.value = str;
    }
}
