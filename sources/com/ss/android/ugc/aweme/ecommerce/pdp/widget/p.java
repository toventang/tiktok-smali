package com.ss.android.ugc.aweme.ecommerce.pdp.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class p extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f86933a = new p();

    static {
        Covode.recordClassIndex(54494);
    }

    p() {
        super(PdpMainState.class, "loadingStatus", "getLoadingStatus()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((PdpMainState) obj).getLoadingStatus());
    }
}
