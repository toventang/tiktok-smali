package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;

public enum f {
    UNKNOWN(0),
    INVITATION(1),
    RECOMMEND(2),
    FAVORITE(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(77459);
    }

    private f(int i2) {
        this.value = i2;
    }
}
