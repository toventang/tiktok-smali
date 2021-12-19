package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;

public @interface Serialized {
    static {
        Covode.recordClassIndex(100482);
    }

    String name();
}
