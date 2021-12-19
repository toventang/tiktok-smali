package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.video.ScreenSharingParameters;

public class InternalScreenSharingParams {
    public int bitrate = -1;
    public int frameRate = 15;
    public int maxHeight;
    public int maxWidth;

    static {
        Covode.recordClassIndex(100766);
    }

    public int getBitrate() {
        return this.bitrate;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.maxHeight;
    }

    public int getWidth() {
        return this.maxWidth;
    }

    public InternalScreenSharingParams(ScreenSharingParameters screenSharingParameters) {
        if (screenSharingParameters != null) {
            this.maxHeight = screenSharingParameters.maxHeight;
            this.maxWidth = screenSharingParameters.maxWidth;
            this.frameRate = screenSharingParameters.frameRate;
            this.bitrate = screenSharingParameters.bitrate;
        }
    }

    public InternalScreenSharingParams(int i2, int i3, int i4, int i5) {
        this.maxHeight = i3;
        this.maxWidth = i2;
        this.frameRate = i4;
        this.bitrate = i5;
    }
}
