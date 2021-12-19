package com.ss.android.ugc.aweme.commentStickerPanel.a;

import com.bytedance.covode.number.Covode;

public enum a {
    Favorites(1),
    Recommended(2),
    Both(3);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(45051);
    }

    private a(int i2) {
        this.value = i2;
    }
}
