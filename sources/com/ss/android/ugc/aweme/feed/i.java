package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;

public enum i {
    SCENE_CARD(0),
    SCENE_FOR_YOU_PAGE(1);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(59205);
    }

    private i(int i2) {
        this.value = i2;
    }
}
