package com.bytedance.sdk.xbridge.registry.core;

import com.bytedance.covode.number.Covode;

public enum g {
    RN,
    WEB,
    LYNX,
    NONE,
    ALL;

    static {
        Covode.recordClassIndex(26909);
    }
}
