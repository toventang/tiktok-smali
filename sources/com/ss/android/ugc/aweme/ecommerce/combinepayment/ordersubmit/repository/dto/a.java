package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84930a = new a();

    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "" : "payment_discount" : "coupon" : "shipping_fee" : "tax" : "sub_total";
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(53120);
    }
}
