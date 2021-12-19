package com.bytedance.sdk.xbridge.registry.core_api;

import com.bytedance.covode.number.Covode;

public interface Callback {
    static {
        Covode.recordClassIndex(26918);
    }

    void invoke(Object... objArr);
}
