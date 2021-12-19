package com.ttnet.org.chromium.base.metrics;

import com.bytedance.covode.number.Covode;

public final class StatisticsRecorderAndroid {
    static {
        Covode.recordClassIndex(103328);
    }

    private static native String nativeToJson(int i2);

    private StatisticsRecorderAndroid() {
    }
}
