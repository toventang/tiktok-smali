package com.ss.avframework.livestreamv2.strategy;

import com.bytedance.covode.number.Covode;

public class EncoderFpsAdjustStrategyAvg implements EncodeFpsAdjustStrategy {
    private int mChangeEncodeFpsThreshold;
    private int mChangeVideoFpsCount;
    private int mMaxChangeEncodeFpsTimes;
    private int mVideoEncodeFpsAdjustEventCount;
    private int mVideoEncodeFpsCount;

    static {
        Covode.recordClassIndex(100471);
    }

    @Override // com.ss.avframework.livestreamv2.strategy.EncodeFpsAdjustStrategy
    public int getChangeVideoFpsCount() {
        return this.mChangeVideoFpsCount;
    }

    public EncoderFpsAdjustStrategyAvg(int i2, int i3) {
        this.mChangeEncodeFpsThreshold = i2;
        this.mMaxChangeEncodeFpsTimes = i3;
    }

    @Override // com.ss.avframework.livestreamv2.strategy.EncodeFpsAdjustStrategy
    public int getAdjustFps(int i2, int i3) {
        int i4;
        if (this.mChangeEncodeFpsThreshold > 0 && (i4 = this.mMaxChangeEncodeFpsTimes) > 0 && this.mChangeVideoFpsCount < i4) {
            int i5 = this.mVideoEncodeFpsAdjustEventCount;
            if (i5 < 4) {
                if (i3 > 0 && i3 <= 60) {
                    this.mVideoEncodeFpsCount += i3;
                    this.mVideoEncodeFpsAdjustEventCount = i5 + 1;
                }
            } else if (i5 == 4) {
                if (i3 > 0 && i3 <= 60) {
                    this.mVideoEncodeFpsCount += i3;
                    this.mVideoEncodeFpsAdjustEventCount = 5;
                }
                int i6 = this.mVideoEncodeFpsCount / 5;
                this.mVideoEncodeFpsCount = 0;
                this.mVideoEncodeFpsAdjustEventCount = 0;
                if (i6 > 0 && i6 <= 60 && Math.abs(i6 - i2) >= this.mChangeEncodeFpsThreshold) {
                    this.mChangeVideoFpsCount++;
                    return i6;
                }
            }
        }
        return 0;
    }
}
