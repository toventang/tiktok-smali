package com.ss.android.ugc.aweme.dsp.playerservice.d.b.a.a;

import com.bytedance.covode.number.Covode;

public enum a {
    FRAGMENT_PRELOADED(0),
    FULL_PRELOADED(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(52098);
    }

    private a(int i2) {
        this.value = i2;
    }
}
