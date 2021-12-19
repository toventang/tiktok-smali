package com.ss.android.ugc.aweme.tools.beauty.g;

import com.bytedance.covode.number.Covode;

public enum c {
    NONE(0),
    OVER(1),
    EXCLUDE(-1);
    
    private final int flag;

    public final int getFlag() {
        return this.flag;
    }

    static {
        Covode.recordClassIndex(90858);
    }

    private c(int i2) {
        this.flag = i2;
    }
}
