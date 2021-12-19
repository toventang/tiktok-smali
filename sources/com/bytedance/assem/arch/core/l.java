package com.bytedance.assem.arch.core;

import com.bytedance.covode.number.Covode;

public enum l {
    SYNC,
    ASYNC,
    X2C,
    ASYNC_X2C;

    static {
        Covode.recordClassIndex(14892);
    }
}
