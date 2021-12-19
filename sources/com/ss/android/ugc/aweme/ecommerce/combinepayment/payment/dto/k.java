package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;

public enum k {
    DONE,
    REDIRECT,
    NEED_INFO,
    IS_DEEPLINK,
    ERROR;

    static {
        Covode.recordClassIndex(53383);
    }
}
