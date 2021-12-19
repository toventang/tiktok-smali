package com.ss.bytertc.engine.game;

import com.bytedance.covode.number.Covode;

public class GameRTCReceiveRange {
    public int max;
    public int min;

    static {
        Covode.recordClassIndex(100895);
    }

    public GameRTCReceiveRange(int i2, int i3) {
        this.min = i2;
        this.max = i3;
    }
}
