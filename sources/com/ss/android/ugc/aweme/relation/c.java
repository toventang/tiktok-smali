package com.ss.android.ugc.aweme.relation;

import com.bytedance.covode.number.Covode;

public enum c {
    TRIGGER_IN_JOURNEY_FRONT(1),
    TRIGGER_IN_JOURNEY_BACK(2),
    TRIGGER_WITHOUT_JOURNEY(3);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(78313);
    }

    private c(int i2) {
        this.type = i2;
    }
}
