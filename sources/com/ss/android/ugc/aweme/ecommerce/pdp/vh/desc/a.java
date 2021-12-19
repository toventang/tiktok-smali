package com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class a extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f86780a = new a();

    static {
        Covode.recordClassIndex(54357);
    }

    a() {
        super(PdpMainState.class, "scrollOffset", "getScrollOffset()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
    }
}
