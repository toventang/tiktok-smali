package com.toutiao.proxyserver.f;

import com.bytedance.covode.number.Covode;

public enum b {
    POOR,
    MODERATE,
    GOOD,
    EXCELLENT,
    UNKNOWN;

    static {
        Covode.recordClassIndex(103129);
    }
}
