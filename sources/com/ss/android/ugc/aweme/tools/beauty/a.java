package com.ss.android.ugc.aweme.tools.beauty;

import com.bytedance.covode.number.Covode;

public enum a {
    MALE("0"),
    FEMALE("1"),
    ALL("2"),
    CUR("-1");
    
    private final String flag;

    public final String getFlag() {
        return this.flag;
    }

    static {
        Covode.recordClassIndex(90766);
    }

    private a(String str) {
        this.flag = str;
    }
}
