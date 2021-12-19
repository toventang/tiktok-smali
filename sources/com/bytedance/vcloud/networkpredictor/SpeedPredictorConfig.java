package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;

public class SpeedPredictorConfig {
    private static int sLogLevel = 3;

    public static int getLogLevel() {
        return sLogLevel;
    }

    static {
        Covode.recordClassIndex(28042);
    }

    public static void setLoglevel(int i2) {
        sLogLevel = i2;
    }
}
