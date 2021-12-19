package com.ss.android.ttve.model;

import com.bytedance.covode.number.Covode;

public class VEAudioTrackIndex {
    public int mTrackIndex = -1;
    public int mTrackType = -1;

    static {
        Covode.recordClassIndex(37645);
    }

    public VEAudioTrackIndex(int i2, int i3) {
        this.mTrackIndex = i2;
        this.mTrackType = i3;
    }
}
