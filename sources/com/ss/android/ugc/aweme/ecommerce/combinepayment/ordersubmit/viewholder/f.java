package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85160a = new f();

    static {
        Covode.recordClassIndex(53223);
    }

    f() {
        super(OrderSubmitState.class, "checkPayment", "getCheckPayment()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((OrderSubmitState) obj).getCheckPayment());
    }
}
