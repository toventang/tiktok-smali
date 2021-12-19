package com.ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;

public enum b {
    ORIGIN,
    ZIP;

    static {
        Covode.recordClassIndex(102477);
    }

    public final b fromValue(int i2) {
        b[] values = values();
        for (b bVar : values) {
            if (bVar.ordinal() == i2) {
                return bVar;
            }
        }
        return ORIGIN;
    }
}
