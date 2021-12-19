package com.ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;

public final class CouponRedeemApi {

    public interface RetroApi {
        static {
            Covode.recordClassIndex(77760);
        }

        @h(a = "/aweme/v2/coupon/qrcode/detail/")
        q<Object> getCouponDetail(@z(a = "code_id") String str, @z(a = "source") int i2);

        @h(a = "/aweme/v2/coupon/validate/")
        q<Object> redeemCoupon(@z(a = "code_id") String str);
    }

    static {
        Covode.recordClassIndex(77759);
    }
}
