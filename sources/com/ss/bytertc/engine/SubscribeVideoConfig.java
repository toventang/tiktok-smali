package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class SubscribeVideoConfig {
    private int priority;
    private int videoIndex;

    static {
        Covode.recordClassIndex(100817);
    }

    public int getPriority() {
        return this.priority;
    }

    public int getVideoIndex() {
        return this.videoIndex;
    }

    public String toString() {
        return "SubscribeVideoConfig{videoIndex=" + this.videoIndex + ", priority=" + this.priority + '}';
    }

    public SubscribeVideoConfig(int i2, int i3) {
        this.videoIndex = i2;
        this.priority = i3;
    }
}
