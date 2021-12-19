package com.facebook.login;

import com.bytedance.covode.number.Covode;

public enum b {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    
    private final String nativeProtocolAudience;

    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }

    static {
        Covode.recordClassIndex(29471);
    }

    private b(String str) {
        this.nativeProtocolAudience = str;
    }
}
