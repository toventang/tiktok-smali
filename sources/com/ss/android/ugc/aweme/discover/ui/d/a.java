package com.ss.android.ugc.aweme.discover.ui.d;

import com.bytedance.covode.number.Covode;

public enum a {
    NEED_LOGIN(1),
    LIMIT(2),
    EMPTY(3),
    SENSITIVE(4),
    HIT_CORE_TABLE(5);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(51385);
    }

    private a(int i2) {
        this.type = i2;
    }
}
