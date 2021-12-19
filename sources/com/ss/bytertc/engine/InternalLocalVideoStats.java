package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalLocalVideoStats {
    public int codecType;
    public int encodedBitrate;
    public int encodedFrameCount;
    public int encodedFrameHeight;
    public int encodedFrameWidth;
    public int encoderOutputFrameRate;
    public int inputFrameRate;
    public boolean isScreen;
    public int rendererOutputFrameRate;
    public int rtt;
    public int sentFrameRate;
    public float sentKBitrate;
    public int statsInterval;
    public int targetFrameRate;
    public int targetKBitrate;
    public float videoLossRate;

    static {
        Covode.recordClassIndex(100758);
    }

    public InternalLocalVideoStats() {
    }

    private static InternalLocalVideoStats create(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f3, int i9, int i10, int i11, int i12, int i13, int i14, boolean z) {
        return new InternalLocalVideoStats(f2, i2, i3, i4, i5, i6, i7, i8, f3, i9, i10, i11, i12, i13, i14, z);
    }

    public InternalLocalVideoStats(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f3, int i9, int i10, int i11, int i12, int i13, int i14, boolean z) {
        this.sentKBitrate = f2;
        this.inputFrameRate = i2;
        this.sentFrameRate = i3;
        this.encoderOutputFrameRate = i4;
        this.rendererOutputFrameRate = i5;
        this.targetKBitrate = i6;
        this.targetFrameRate = i7;
        this.statsInterval = i8;
        this.videoLossRate = f3;
        this.rtt = i9;
        this.encodedBitrate = i10;
        this.encodedFrameWidth = i11;
        this.encodedFrameHeight = i12;
        this.encodedFrameCount = i13;
        this.codecType = i14;
        this.isScreen = z;
    }
}
