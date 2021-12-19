package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;

public enum a {
    LEFT_TOP(0),
    MIDDLE_TOP(1),
    RIGHT_TOP(2),
    LEFT_MIDDLE(3),
    MIDDLE_MIDDLE(4),
    RIGHT_MIDDLE(5),
    LEFT_BOTTOM(6),
    MIDDLE_BOTTOM(7),
    RIGHT_BOTTOM(8);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(88109);
    }

    private a(int i2) {
        this.value = i2;
    }
}
