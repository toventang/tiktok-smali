package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class h extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85180a = new h();

    static {
        Covode.recordClassIndex(53249);
    }

    h() {
        super(OrderSubmitState.class, "reachableAny", "getReachableAny()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((OrderSubmitState) obj).getReachableAny());
    }
}
