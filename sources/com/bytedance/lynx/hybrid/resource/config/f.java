package com.bytedance.lynx.hybrid.resource.config;

import com.bytedance.covode.number.Covode;

public enum f {
    GECKO,
    BUILTIN,
    CDN;

    static {
        Covode.recordClassIndex(25191);
    }
}
