package com.bytedance.ies.bullet.kit.lynx.api;

import com.bytedance.covode.number.Covode;

public enum BulletReadableType {
    Null,
    Boolean,
    Int,
    Number,
    String,
    Map,
    Array;

    static {
        Covode.recordClassIndex(18949);
    }
}
