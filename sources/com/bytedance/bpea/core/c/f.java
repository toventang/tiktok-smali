package com.bytedance.bpea.core.c;

import com.bytedance.covode.number.Covode;

public enum f {
    START_CHECK,
    END_CHECK,
    START_LEGAL_CHECK,
    END_LEGAL_CHECK,
    START_CONDITION_CHECK,
    END_CONDITION_CHECK,
    WARN,
    ERROR;

    static {
        Covode.recordClassIndex(15688);
    }
}
