package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;

public enum i {
    BPEA_ENTRY(1),
    DIRECT_AUTH(2);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(15668);
    }

    private i(int i2) {
        this.type = i2;
    }
}
