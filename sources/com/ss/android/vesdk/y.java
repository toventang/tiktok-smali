package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public enum y {
    EFFECT_NEW_ENGINE(1),
    EFFECT_NEW_OLD_ENGINE_COEXIST(2);
    
    public int mode;

    static {
        Covode.recordClassIndex(99649);
    }

    private y(int i2) {
        this.mode = i2;
    }
}
