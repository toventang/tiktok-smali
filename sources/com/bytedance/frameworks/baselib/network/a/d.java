package com.bytedance.frameworks.baselib.network.a;

import com.bytedance.covode.number.Covode;

public enum d {
    POOR,
    MODERATE,
    GOOD,
    EXCELLENT,
    UNKNOWN;

    static {
        Covode.recordClassIndex(16953);
    }
}
