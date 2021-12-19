package com.bytedance.android.live.wallet.base;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class PayOrderResultResponse extends a {
    @c(a = "data")
    public PayOrderResultStruct data;

    static {
        Covode.recordClassIndex(7252);
    }
}
