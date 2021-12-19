package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public enum EventTypeEnum {
    Live_Event(1);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(59374);
    }

    private EventTypeEnum(int i2) {
        this.type = i2;
    }
}
