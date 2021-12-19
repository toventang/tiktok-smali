package com.lynx.react.bridge;

import com.bytedance.covode.number.Covode;

public enum ReadableType {
    Null,
    Boolean,
    Int,
    Number,
    String,
    Map,
    Array,
    Long,
    ByteArray;

    static {
        Covode.recordClassIndex(34773);
    }
}
