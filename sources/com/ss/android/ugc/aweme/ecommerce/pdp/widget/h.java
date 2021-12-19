package com.ss.android.ugc.aweme.ecommerce.pdp.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class h extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f86925a = new h();

    static {
        Covode.recordClassIndex(54486);
    }

    h() {
        super(PdpMainState.class, "scrollOffset", "getScrollOffset()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
    }
}
