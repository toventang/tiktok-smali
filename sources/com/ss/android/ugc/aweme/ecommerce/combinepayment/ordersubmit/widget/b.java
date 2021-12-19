package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85174a = new b();

    static {
        Covode.recordClassIndex(53243);
    }

    b() {
        super(OrderSubmitState.class, "orderSummaryPanelOpened", "getOrderSummaryPanelOpened()Z", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Boolean.valueOf(((OrderSubmitState) obj).getOrderSummaryPanelOpened());
    }
}
