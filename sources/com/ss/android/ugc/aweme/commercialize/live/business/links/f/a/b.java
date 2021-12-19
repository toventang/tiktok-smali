package com.ss.android.ugc.aweme.commercialize.live.business.links.f.a;

import com.bytedance.covode.number.Covode;

public enum b {
    PIN(1),
    UNPIN(2),
    ADD(3),
    REMOVE(4);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(46015);
    }

    private b(int i2) {
        this.value = i2;
    }
}
