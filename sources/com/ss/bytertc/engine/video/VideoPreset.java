package com.ss.bytertc.engine.video;

import com.bytedance.covode.number.Covode;

public class VideoPreset {
    private int bandwidth;
    private int fps;
    private int height;
    private int width;

    static {
        Covode.recordClassIndex(101086);
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public VideoPreset(int i2, int i3, int i4, int i5) {
        this.width = i2;
        this.height = i3;
        this.fps = i4;
        this.bandwidth = i5;
    }
}
