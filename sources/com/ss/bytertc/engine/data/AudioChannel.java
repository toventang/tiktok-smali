package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public enum AudioChannel {
    AUDIO_CHANNEL_MONO(1),
    AUDIO_CHANNEL_STEREO(2);
    
    private int value = 1;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        if (this == AUDIO_CHANNEL_MONO) {
            return "kAudioChannelMono";
        }
        return "kAudioChannelStereo";
    }

    static {
        Covode.recordClassIndex(100838);
    }

    public static AudioChannel fromId(int i2) {
        AudioChannel[] values = values();
        for (AudioChannel audioChannel : values) {
            if (audioChannel.value() == i2) {
                return audioChannel;
            }
        }
        return null;
    }

    private AudioChannel(int i2) {
        this.value = i2;
    }
}
