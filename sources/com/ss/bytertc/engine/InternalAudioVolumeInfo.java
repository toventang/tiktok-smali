package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalAudioVolumeInfo {
    public int smooth_volume;
    public String uid;
    public int volume;

    static {
        Covode.recordClassIndex(100754);
    }

    public InternalAudioVolumeInfo(String str, int i2) {
        this.uid = str;
        this.volume = i2;
    }

    private static InternalAudioVolumeInfo create(String str, int i2) {
        return new InternalAudioVolumeInfo(str, i2);
    }
}
