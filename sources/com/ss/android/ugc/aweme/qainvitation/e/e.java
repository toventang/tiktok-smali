package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;

public enum e {
    NEW_QUESTION(0),
    QUESTION_DETAIL(1),
    VIDEO(2);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(77370);
    }

    private e(int i2) {
        this.type = i2;
    }
}
