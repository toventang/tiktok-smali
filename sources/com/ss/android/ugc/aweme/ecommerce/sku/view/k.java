package com.ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import h.f.b.y;

final /* synthetic */ class k extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.k f87464a = new k();

    static {
        Covode.recordClassIndex(54964);
    }

    k() {
        super(SkuState.class, "currentPrice", "getCurrentPrice()Ljava/lang/String;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((SkuState) obj).getCurrentPrice();
    }
}
