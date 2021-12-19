package com.facebook.imagepipeline.common;

import com.bytedance.covode.number.Covode;

public enum c {
    LOW,
    MEDIUM,
    HIGH;

    static {
        Covode.recordClassIndex(28925);
    }

    public static c getHigherPriority(c cVar, c cVar2) {
        if (cVar == null) {
            return cVar2;
        }
        if (cVar2 != null && cVar.ordinal() <= cVar2.ordinal()) {
            return cVar2;
        }
        return cVar;
    }
}
