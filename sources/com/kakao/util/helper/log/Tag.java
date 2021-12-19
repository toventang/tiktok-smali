package com.kakao.util.helper.log;

import com.bytedance.covode.number.Covode;

public enum Tag {
    DEFAULT("kakao.sdk");
    
    private final String tag;

    public final String tag() {
        return this.tag;
    }

    static {
        Covode.recordClassIndex(34492);
    }

    private Tag(String str) {
        this.tag = str;
    }
}
