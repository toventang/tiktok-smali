package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalRemoteVideoStats {
    public int decoderOutputFrameRate;
    public long e2eDelay;
    public int frozenRate;
    public int height;
    public boolean isScreen;
    public float receivedKBitrate;
    public int rendererOutputFrameRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int videoIndex;
    public float videoLossRate;
    public int width;

    static {
        Covode.recordClassIndex(100765);
    }

    public InternalRemoteVideoStats() {
    }

    private static InternalRemoteVideoStats create(int i2, int i3, float f2, float f3, int i4, int i5, int i6, long j2, boolean z, int i7, int i8, int i9, int i10) {
        return new InternalRemoteVideoStats(i2, i3, f2, f3, i4, i5, i6, j2, z, i7, i8, i9, i10);
    }

    public InternalRemoteVideoStats(int i2, int i3, float f2, float f3, int i4, int i5, int i6, long j2, boolean z, int i7, int i8, int i9, int i10) {
        this.width = i2;
        this.height = i3;
        this.videoLossRate = f2;
        this.receivedKBitrate = f3;
        this.decoderOutputFrameRate = i4;
        this.rendererOutputFrameRate = i5;
        this.stallCount = i6;
        this.e2eDelay = j2;
        this.isScreen = z;
        this.statsInterval = i7;
        this.rtt = i8;
        this.frozenRate = i9;
        this.videoIndex = i10;
    }
}
