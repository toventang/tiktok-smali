package com.bytedance.sdk.xbridge.registry.core.model.idl;

import com.bytedance.covode.number.Covode;

public enum XDynamicType {
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
        Covode.recordClassIndex(26917);
    }
}
