package com.ss.android.ugc.aweme.commercialize.coupon.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class CouponMessage {
    @c(a = "code_id")
    public String codeId;
    @c(a = "msg_type")
    public int msgType;

    static {
        Covode.recordClassIndex(45376);
    }
}
