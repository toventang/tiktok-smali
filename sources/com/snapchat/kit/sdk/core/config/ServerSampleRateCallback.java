package com.snapchat.kit.sdk.core.config;

import com.bytedance.covode.number.Covode;

public interface ServerSampleRateCallback {
    static {
        Covode.recordClassIndex(35573);
    }

    void onServerSampleRateAvailable(double d2);

    void onServerSampleRateFailure();
}
