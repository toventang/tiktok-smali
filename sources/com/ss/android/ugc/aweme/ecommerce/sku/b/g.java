package com.ss.android.ugc.aweme.ecommerce.sku.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class g extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f87390a = new g();

    static {
        Covode.recordClassIndex(54881);
    }

    g() {
        super(SkuState.class, "showLoadingView", "getShowLoadingView()Z", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return Boolean.valueOf(((SkuState) obj).getShowLoadingView());
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((SkuState) obj).setShowLoadingView(((Boolean) obj2).booleanValue());
    }
}
