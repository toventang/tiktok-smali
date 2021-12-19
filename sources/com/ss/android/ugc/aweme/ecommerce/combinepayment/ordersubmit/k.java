package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import com.bytedance.covode.number.Covode;
import h.f.b.y;

final /* synthetic */ class k extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.k f84899a = new k();

    static {
        Covode.recordClassIndex(53079);
    }

    k() {
        super(OrderSubmitState.class, "pageLoadStatus", "getPageLoadStatus()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((OrderSubmitState) obj).getPageLoadStatus());
    }
}
