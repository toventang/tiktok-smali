package com.bytedance.globalpayment.iap.common.ability.a;

import com.bytedance.covode.number.Covode;

public enum a {
    CreateOrder,
    PerformPay,
    UploadToken,
    QueryOrder,
    Consume,
    ExtraUploadToken,
    ExtraQueryOrder,
    ExtraConsume,
    PreregisterCreateOrder,
    PreregisterUploadToken,
    PreregisterQueryOrder,
    PreregisterConsume,
    AmazonPay;

    static {
        Covode.recordClassIndex(17560);
    }
}
