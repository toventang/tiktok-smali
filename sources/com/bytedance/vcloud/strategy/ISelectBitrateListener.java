package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;

public interface ISelectBitrateListener {
    static {
        Covode.recordClassIndex(28056);
    }

    String selectBitrateJsonString(String str, int i2);
}
