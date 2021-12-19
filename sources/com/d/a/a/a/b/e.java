package com.d.a.a.a.b;

import com.bytedance.covode.number.Covode;

public enum e {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    static {
        Covode.recordClassIndex(28302);
    }

    private e(String str) {
        this.typeString = str;
    }

    public final String toString() {
        return this.typeString;
    }
}
