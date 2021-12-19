package com.ss.bytertc.engine.game;

import com.bytedance.covode.number.Covode;

public class GameRTCPositionInfo {
    public int x;
    public int y;
    public int z;

    static {
        Covode.recordClassIndex(100894);
    }

    public GameRTCPositionInfo(int i2, int i3, int i4) {
        this.x = i2;
        this.y = i3;
        this.z = i4;
    }
}
