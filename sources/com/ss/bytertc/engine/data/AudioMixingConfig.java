package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public class AudioMixingConfig {
    public int playCount;
    public AudioMixingType type;

    static {
        Covode.recordClassIndex(100840);
    }

    public String toString() {
        return "AudioMixingConfig{type='" + this.type + '\'' + ", int='" + this.playCount + '\'' + '}';
    }

    public AudioMixingConfig(AudioMixingType audioMixingType, int i2) {
        this.type = audioMixingType;
        this.playCount = i2;
    }
}
