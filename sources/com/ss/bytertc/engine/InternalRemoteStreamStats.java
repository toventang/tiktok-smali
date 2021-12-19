package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalRemoteStreamStats {
    public InternalRemoteAudioStats audioStats;
    public boolean isScreen;
    public int rxQuality;
    public int txQuality;
    public String uid;
    public InternalRemoteVideoStats videoStats;

    static {
        Covode.recordClassIndex(100763);
    }

    public InternalRemoteStreamStats() {
    }

    public static InternalRemoteStreamStats create(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i2, int i3) {
        return new InternalRemoteStreamStats(str, internalRemoteAudioStats, internalRemoteVideoStats, z, i2, i3);
    }

    public InternalRemoteStreamStats(String str, InternalRemoteAudioStats internalRemoteAudioStats, InternalRemoteVideoStats internalRemoteVideoStats, boolean z, int i2, int i3) {
        this.uid = str;
        this.audioStats = internalRemoteAudioStats;
        this.videoStats = internalRemoteVideoStats;
        this.isScreen = z;
        this.txQuality = i2;
        this.rxQuality = i3;
    }
}
