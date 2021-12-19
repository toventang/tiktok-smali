package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class EncStrategyConfig {
    @Serialized(name = "qulity_mode")
    private int qualityMode;

    static {
        Covode.recordClassIndex(100456);
    }

    public final int getQualityMode() {
        return this.qualityMode;
    }

    public final void setQualityMode(int i2) {
        this.qualityMode = i2;
    }
}
