package com.bytedance.ies.lynx.lynx_adapter.wrapper;

import com.bytedance.covode.number.Covode;

public enum ReadableTypeWrapper {
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
        Covode.recordClassIndex(20429);
    }
}
