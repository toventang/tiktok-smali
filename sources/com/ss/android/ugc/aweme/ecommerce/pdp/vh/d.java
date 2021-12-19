package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class d extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f86754a = new d();

    static {
        Covode.recordClassIndex(54340);
    }

    d() {
        super(PdpMainState.class, "cartEntry", "getCartEntry()Lcom/ss/android/ugc/aweme/ecommerce/pdp/repository/dto/CartEntry;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((PdpMainState) obj).getCartEntry();
    }
}
