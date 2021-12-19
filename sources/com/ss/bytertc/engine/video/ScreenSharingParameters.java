package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

public class ScreenSharingParameters {
    public int bitrate = -1;
    public int frameRate = 15;
    public int maxHeight;
    public int maxWidth;

    static {
        Covode.recordClassIndex(101082);
    }

    public ScreenSharingParameters() {
    }

    public ScreenSharingParameters(int i2, int i3, int i4, int i5) {
        this.maxHeight = i3;
        this.maxWidth = i2;
        this.frameRate = i4;
        this.bitrate = i5;
    }
}
