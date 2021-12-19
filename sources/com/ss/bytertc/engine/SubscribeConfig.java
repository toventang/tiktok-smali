package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class SubscribeConfig {
    public boolean isScreen;
    public boolean subAudio;
    public boolean subVideo;
    public int videoIndex;

    static {
        Covode.recordClassIndex(100815);
    }

    public SubscribeConfig() {
    }

    public String toString() {
        return "SubscribeConfig{isScreen=" + this.isScreen + ", subVideo=" + this.subVideo + ", subAudio=" + this.subAudio + ", videoIndex=" + this.videoIndex + "}";
    }

    public SubscribeConfig(SubscribeConfig subscribeConfig) {
        if (subscribeConfig != null) {
            this.isScreen = subscribeConfig.isScreen;
            this.subVideo = subscribeConfig.subVideo;
            this.subAudio = subscribeConfig.subAudio;
            this.videoIndex = subscribeConfig.videoIndex;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SubscribeConfig subscribeConfig = (SubscribeConfig) obj;
            if (this.isScreen == subscribeConfig.isScreen && this.subVideo == subscribeConfig.subVideo && this.subAudio == subscribeConfig.subAudio && this.videoIndex == subscribeConfig.videoIndex) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static SubscribeConfig create(boolean z, boolean z2, boolean z3, int i2) {
        return new SubscribeConfig(z, z2, z3, i2);
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i2) {
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i2;
    }
}
