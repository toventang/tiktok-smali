package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;

public enum o {
    Null,
    Boolean,
    Number,
    Int,
    String,
    Map,
    Array;

    static {
        Covode.recordClassIndex(21783);
    }
}
