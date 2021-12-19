package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

public enum FrameRate {
    FRAME_RATE_FPS_1(1),
    FRAME_RATE_FPS_7(7),
    FRAME_RATE_FPS_10(10),
    FRAME_RATE_FPS_15(15),
    FRAME_RATE_FPS_24(24),
    FRAME_RATE_FPS_30(30);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(101075);
    }

    private FrameRate(int i2) {
        this.value = i2;
    }
}
