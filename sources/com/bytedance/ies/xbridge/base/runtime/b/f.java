package com.bytedance.ies.xbridge.base.runtime.b;

import com.bytedance.covode.number.Covode;

public enum f {
    GET,
    POST,
    PUT,
    DELETE,
    DOWNLOAD;

    static {
        Covode.recordClassIndex(21390);
    }
}
