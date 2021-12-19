package com.ss.avframework.livestreamv2.sdkparams;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.tinyjson.Serialized;

public final class SandboxParams {
    @Serialized(name = "enable")
    private int enable = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(100467);
    }

    public final int getEnable() {
        return this.enable;
    }

    public final void setEnable(int i2) {
        this.enable = i2;
    }
}
