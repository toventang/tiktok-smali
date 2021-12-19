package com.ss.android.ugc.aweme.qainvitation.a;

import com.bytedance.covode.number.Covode;

public enum a {
    Recent("recent"),
    Friends("friends"),
    Following("following"),
    Search("search");
    
    private final String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(77278);
    }

    private a(String str) {
        this.value = str;
    }
}
