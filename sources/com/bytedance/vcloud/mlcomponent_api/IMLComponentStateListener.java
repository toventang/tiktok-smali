package com.bytedance.vcloud.mlcomponent_api;

import com.bytedance.covode.number.Covode;

public interface IMLComponentStateListener {
    static {
        Covode.recordClassIndex(28025);
    }

    void onEngineStateChange(String str, int i2, String str2);
}
