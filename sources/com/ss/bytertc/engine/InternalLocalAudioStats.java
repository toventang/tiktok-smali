package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalLocalAudioStats {
    public float audioLossRate;
    public int numChannels;
    public int recordSampleRate;
    public int rtt;
    public int sendKBitrate;
    public int sentSampleRate;
    public int statsInterval;

    static {
        Covode.recordClassIndex(100756);
    }

    public InternalLocalAudioStats() {
    }

    private static InternalLocalAudioStats create(float f2, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new InternalLocalAudioStats(f2, i2, i3, i4, i5, i6, i7);
    }

    public InternalLocalAudioStats(float f2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.audioLossRate = f2;
        this.sendKBitrate = i2;
        this.recordSampleRate = i3;
        this.statsInterval = i4;
        this.rtt = i5;
        this.numChannels = i6;
        this.sentSampleRate = i7;
    }
}
