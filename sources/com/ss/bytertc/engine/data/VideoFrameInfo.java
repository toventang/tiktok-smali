package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public class VideoFrameInfo {
    private int height;
    public VideoRotation rotation = VideoRotation.VIDEO_ROTATION_0;
    private int width;

    static {
        Covode.recordClassIndex(100874);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "VideoFrameInfo{width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + '}';
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public VideoFrameInfo(int i2, int i3, int i4) {
        this.width = i2;
        this.height = i3;
        this.rotation = VideoRotation.fromId(i4);
    }
}
