package com.d.a.a.a.b;

import com.bytedance.covode.number.Covode;

public enum i {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");
    
    private final String owner;

    static {
        Covode.recordClassIndex(28306);
    }

    private i(String str) {
        this.owner = str;
    }

    public final String toString() {
        return this.owner;
    }
}
