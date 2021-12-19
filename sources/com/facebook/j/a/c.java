package com.facebook.j.a;

import com.bytedance.covode.number.Covode;

public enum c {
    POOR,
    MODERATE,
    GOOD,
    EXCELLENT,
    UNKNOWN;

    static {
        Covode.recordClassIndex(29376);
    }
}
