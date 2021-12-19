package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;

public enum l {
    CENTER(0),
    START(1),
    END(2);
    
    private final int gravity;

    public final int getGravity() {
        return this.gravity;
    }

    static {
        Covode.recordClassIndex(55660);
    }

    private l(int i2) {
        this.gravity = i2;
    }
}
