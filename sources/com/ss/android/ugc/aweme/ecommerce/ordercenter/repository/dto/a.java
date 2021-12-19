package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;

public enum a {
    ALL,
    TO_PAY,
    TO_SHIP,
    SHIPPED,
    COMPLETED,
    CANCELLED,
    TO_REVIEW;

    static {
        Covode.recordClassIndex(53987);
    }
}
