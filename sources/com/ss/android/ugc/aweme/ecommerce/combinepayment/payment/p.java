package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class p extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85415a = new p();

    static {
        Covode.recordClassIndex(53452);
    }

    p() {
        super(PaymentState.class, "emailHintVisible", "getEmailHintVisible()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((PaymentState) obj).getEmailHintVisible());
    }
}
