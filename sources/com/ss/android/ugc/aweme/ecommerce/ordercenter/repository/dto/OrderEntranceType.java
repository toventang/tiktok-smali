package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;

public enum OrderEntranceType {
    UNKNOWN,
    OPEN,
    CLOSE;

    static {
        Covode.recordClassIndex(53984);
    }
}
