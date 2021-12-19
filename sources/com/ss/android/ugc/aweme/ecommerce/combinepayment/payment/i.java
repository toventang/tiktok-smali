package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class i extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85408a = new i();

    static {
        Covode.recordClassIndex(53445);
    }

    i() {
        super(PaymentState.class, "checkedPaymentMethod", "getCheckedPaymentMethod()Lcom/ss/android/ugc/aweme/ecommerce/combinepayment/payment/dto/PaymentMethod;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((PaymentState) obj).getCheckedPaymentMethod();
    }
}
