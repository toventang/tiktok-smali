package com.bytedance.monitor.a.b;

import com.bytedance.covode.number.Covode;

public enum b {
    IO,
    TIME_SENSITIVE,
    LIGHT_WEIGHT;

    static {
        Covode.recordClassIndex(25363);
    }
}
