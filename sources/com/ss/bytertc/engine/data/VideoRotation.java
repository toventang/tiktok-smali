package com.ss.bytertc.engine.data;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;

public enum VideoRotation {
    VIDEO_ROTATION_0(0),
    VIDEO_ROTATION_90(90),
    VIDEO_ROTATION_180(LiveFeedRefreshTimeSetting.DEFAULT),
    VIDEO_ROTATION_270(270);
    
    private int value;

    public final int value() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(100876);
    }

    public static VideoRotation fromId(int i2) {
        VideoRotation[] values = values();
        for (VideoRotation videoRotation : values) {
            if (videoRotation.value() == i2) {
                return videoRotation;
            }
        }
        return null;
    }

    private VideoRotation(int i2) {
        this.value = i2;
    }
}
