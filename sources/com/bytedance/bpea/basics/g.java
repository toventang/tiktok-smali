package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;

public enum g {
    PRIVACY_CERT(1),
    TOKEN_CERT(2);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(15666);
    }

    private g(int i2) {
        this.type = i2;
    }
}
