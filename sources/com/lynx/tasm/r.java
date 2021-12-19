package com.lynx.tasm;

import com.bytedance.covode.number.Covode;

public enum r {
    ALL_ON_UI(0),
    MOST_ON_TASM(1),
    PART_ON_LAYOUT(2),
    MULTI_THREADS(3);
    
    private int mId;

    public final int id() {
        return this.mId;
    }

    static {
        Covode.recordClassIndex(35393);
    }

    private r(int i2) {
        this.mId = i2;
    }
}
