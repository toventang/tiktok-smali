package com.ss.android.ugc.aweme.ecommerce.pdp.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class s extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f86936a = new s();

    static {
        Covode.recordClassIndex(54497);
    }

    s() {
        super(PdpMainState.class, "scrollOffset", "getScrollOffset()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
    }
}
