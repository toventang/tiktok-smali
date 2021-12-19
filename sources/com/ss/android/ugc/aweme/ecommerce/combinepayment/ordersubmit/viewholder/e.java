package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class e extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f85159a = new e();

    static {
        Covode.recordClassIndex(53222);
    }

    e() {
        super(OrderSubmitState.class, "userPaymentInfo", "getUserPaymentInfo()Lcom/ss/android/ugc/aweme/ecommerce/combinepayment/payment/dto/PaymentInfo;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((OrderSubmitState) obj).getUserPaymentInfo();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((OrderSubmitState) obj).setUserPaymentInfo((n) obj2);
    }
}
