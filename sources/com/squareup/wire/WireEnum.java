package com.squareup.wire;

import com.bytedance.covode.number.Covode;

public interface WireEnum {
    static {
        Covode.recordClassIndex(36137);
    }

    int getValue();
}
