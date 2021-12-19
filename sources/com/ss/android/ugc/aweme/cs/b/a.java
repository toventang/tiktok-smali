package com.ss.android.ugc.aweme.cs.b;

import com.bytedance.covode.number.Covode;

public enum a {
    SHOOT(0),
    VIDEOEDIT(1),
    VIDEOCUT(2),
    PUBLISH(3);
    
    private final int stage;

    public final int getStage() {
        return this.stage;
    }

    static {
        Covode.recordClassIndex(49029);
    }

    private a(int i2) {
        this.stage = i2;
    }
}
