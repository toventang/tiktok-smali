package com.bytedance.bddatefmt;

import com.bytedance.covode.number.Covode;

public enum a {
    YEAR,
    MONTH,
    WEEK,
    DAY,
    HOUR,
    MINUTE,
    SECOND,
    MILLISECOND;

    static {
        Covode.recordClassIndex(15422);
    }
}
