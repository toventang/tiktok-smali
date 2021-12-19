package com.ss.android.ugc.aweme.cs.b;

import com.bytedance.covode.number.Covode;

public enum b {
    CACHE("cache"),
    RESOURCE("resource"),
    DRAFT("draft"),
    STORY("story");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(49030);
    }

    private b(String str) {
        this.type = str;
    }
}
