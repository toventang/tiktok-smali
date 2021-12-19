package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalLocalStreamStats {
    public InternalLocalAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public InternalLocalVideoStats videoStats;

    static {
        Covode.recordClassIndex(100757);
    }

    public InternalLocalStreamStats() {
    }

    public static InternalLocalStreamStats create(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i2, int i3) {
        return new InternalLocalStreamStats(internalLocalAudioStats, internalLocalVideoStats, z, i2, i3);
    }

    public InternalLocalStreamStats(InternalLocalAudioStats internalLocalAudioStats, InternalLocalVideoStats internalLocalVideoStats, boolean z, int i2, int i3) {
        this.audioStats = internalLocalAudioStats;
        this.videoStats = internalLocalVideoStats;
        this.isScreen = z;
        this.txQuality = i2;
        this.rxQuality = i3;
    }
}
