package com.ss.avframework.livestreamv2.strategy;

import com.bytedance.covode.number.Covode;

public interface EncodeFpsAdjustStrategy {
    static {
        Covode.recordClassIndex(100470);
    }

    int getAdjustFps(int i2, int i3);

    int getChangeVideoFpsCount();
}
