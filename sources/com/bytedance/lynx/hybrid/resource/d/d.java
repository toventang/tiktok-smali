package com.bytedance.lynx.hybrid.resource.d;

import com.bytedance.covode.number.Covode;

public enum d {
    GECKO,
    BUILTIN,
    CDN,
    LOCAL_FILE;

    static {
        Covode.recordClassIndex(25204);
    }
}
