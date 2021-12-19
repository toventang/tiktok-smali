package com.bytedance.globalpayment.iap.common.ability.model.enums;

import com.bytedance.covode.number.Covode;

public enum PayType {
    UNKNOWN,
    PRE,
    NOMAL,
    EXTRA_TOKEN,
    EXTRA_QUERY,
    CAIJING_CALLBACK,
    CAIJING_TOKEN;

    static {
        Covode.recordClassIndex(17608);
    }
}
