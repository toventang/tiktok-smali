package com.bytedance.ies.im.core.api.g;

import com.bytedance.covode.number.Covode;

public enum e {
    WIFI,
    MOBILE,
    UNKNOWN;

    static {
        Covode.recordClassIndex(20229);
    }
}
