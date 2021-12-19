package com.ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;

public enum u {
    VIDEO("video"),
    SHOUTOUTS("shoutouts");
    
    private final String desc;

    public final String getDesc() {
        return this.desc;
    }

    static {
        Covode.recordClassIndex(85250);
    }

    private u(String str) {
        this.desc = str;
    }
}
