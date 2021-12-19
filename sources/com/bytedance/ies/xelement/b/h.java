package com.bytedance.ies.xelement.b;

import com.bytedance.covode.number.Covode;

public enum h {
    SINGLE("single"),
    ORDER("order"),
    LIST("list");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(22036);
    }

    private h(String str) {
        this.desc = str;
    }
}
