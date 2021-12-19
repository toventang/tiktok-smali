package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;

public enum ao {
    GECKO,
    BUILTIN,
    CDN,
    LOCAL_FILE;

    static {
        Covode.recordClassIndex(19323);
    }
}
