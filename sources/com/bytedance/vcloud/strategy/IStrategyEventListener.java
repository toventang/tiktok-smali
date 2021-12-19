package com.bytedance.vcloud.strategy;

import com.bytedance.covode.number.Covode;

public interface IStrategyEventListener {
    static {
        Covode.recordClassIndex(28057);
    }

    void onEvent(String str, int i2, int i3, String str2);

    void onEventLog(String str, String str2);
}
