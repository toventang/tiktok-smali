package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalGameAudioVolumeInfo {
    public String userId;
    public int volume;

    static {
        Covode.recordClassIndex(100755);
    }

    public InternalGameAudioVolumeInfo(String str, int i2) {
        this.userId = str;
        this.volume = i2;
    }

    private static InternalGameAudioVolumeInfo create(String str, int i2) {
        return new InternalGameAudioVolumeInfo(str, i2);
    }
}
