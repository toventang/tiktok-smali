package com.bytedance.bpea.core.checker.a;

import com.bytedance.covode.number.Covode;

public enum c {
    CONFIG("config"),
    PLACEHOLDER("placeholder"),
    INVALID("invalid"),
    ENTRY_VERIFY("entryVerify");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(15693);
    }

    private c(String str) {
        this.value = str;
    }
}
