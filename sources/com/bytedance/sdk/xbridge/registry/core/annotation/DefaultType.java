package com.bytedance.sdk.xbridge.registry.core.annotation;

import com.bytedance.covode.number.Covode;

public enum DefaultType {
    STRING,
    DOUBLE,
    INT,
    LONG,
    BOOL,
    NONE;

    static {
        Covode.recordClassIndex(26892);
    }
}
