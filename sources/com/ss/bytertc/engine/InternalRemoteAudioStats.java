package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalRemoteAudioStats {
    public float audioLossRate;
    public int concealedSamples;
    public int concealmentEvent;
    public int decDuration;
    public int decSampleRate;
    public long e2eDelay;
    public int frozenRate;
    public int jitterBufferDelay;
    public int numChannels;
    public int playoutSampleRate;
    public int quality;
    public int receivedKBitrate;
    public int receivedSampleRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int total_rtt;

    static {
        Covode.recordClassIndex(100762);
    }

    public InternalRemoteAudioStats() {
    }

    private static InternalRemoteAudioStats create(float f2, int i2, int i3, int i4, long j2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return new InternalRemoteAudioStats(f2, i2, i3, i4, j2, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public InternalRemoteAudioStats(float f2, int i2, int i3, int i4, long j2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.audioLossRate = f2;
        this.receivedKBitrate = i2;
        this.stallCount = i3;
        this.stallDuration = i4;
        this.e2eDelay = j2;
        this.statsInterval = i6;
        this.rtt = i7;
        this.total_rtt = i8;
        this.quality = i9;
        this.jitterBufferDelay = i10;
        this.numChannels = i11;
        this.receivedSampleRate = i12;
        this.frozenRate = i13;
        this.concealedSamples = i14;
        this.concealmentEvent = i15;
        this.decSampleRate = i16;
        this.decDuration = i17;
    }
}
