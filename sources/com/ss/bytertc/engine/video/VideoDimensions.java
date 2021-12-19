package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

public class VideoDimensions {
    public int height;
    public int width;

    static {
        Covode.recordClassIndex(101083);
    }

    public VideoDimensions() {
    }

    public VideoDimensions(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }
}
