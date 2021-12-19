package com.benchmark.b;

import com.bytedance.covode.number.Covode;

enum g {
    ON_ON,
    ON_OFF,
    OFF_ON,
    OFF_OFF;

    static {
        Covode.recordClassIndex(2951);
    }
}
