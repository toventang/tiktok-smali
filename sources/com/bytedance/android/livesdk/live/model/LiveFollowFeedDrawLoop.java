package com.bytedance.android.livesdk.live.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class LiveFollowFeedDrawLoop {
    @c(a = "loop_enable")
    private boolean enable;
    @c(a = "threshold")
    private int threshold;

    static {
        Covode.recordClassIndex(10468);
    }

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public static LiveFollowFeedDrawLoop getDefault() {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = new LiveFollowFeedDrawLoop();
        liveFollowFeedDrawLoop.enable = false;
        liveFollowFeedDrawLoop.threshold = 3;
        return liveFollowFeedDrawLoop;
    }
}
