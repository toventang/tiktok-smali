package com.bytedance.lighten.a;

import com.bytedance.covode.number.Covode;

public enum q {
    LOW,
    MEDIUM,
    HIGH;

    static {
        Covode.recordClassIndex(24614);
    }

    public static q getHigherPriority(q qVar, q qVar2) {
        if (qVar == null) {
            return qVar2;
        }
        if (qVar2 != null && qVar.ordinal() <= qVar2.ordinal()) {
            return qVar2;
        }
        return qVar;
    }
}
