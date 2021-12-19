package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;

public enum l {
    NORMAL_BLOCK,
    COLD_DOWN_BLOCK,
    AGE_GATE_BLOCK;

    static {
        Covode.recordClassIndex(3926);
    }
}
