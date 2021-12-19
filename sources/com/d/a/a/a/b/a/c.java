package com.d.a.a.a.b.a;

import com.bytedance.covode.number.Covode;

public enum c {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");
    
    private final String position;

    static {
        Covode.recordClassIndex(28297);
    }

    private c(String str) {
        this.position = str;
    }

    public final String toString() {
        return this.position;
    }
}
