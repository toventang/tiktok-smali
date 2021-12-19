package com.bytedance.android.livesdkapi.depend.model.live.a;

import com.bytedance.covode.number.Covode;

public enum j {
    UNKNOWN(0),
    NORMAL(1),
    ACTIVITY(2);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(13677);
    }

    private j(int i2) {
        this.type = i2;
    }
}
