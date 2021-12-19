package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class m extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85412a = new m();

    static {
        Covode.recordClassIndex(53449);
    }

    m() {
        super(PaymentState.class, "showLoading", "getShowLoading()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((PaymentState) obj).getShowLoading());
    }
}
