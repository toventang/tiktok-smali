package com.ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class d extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87457a = new d();

    static {
        Covode.recordClassIndex(54957);
    }

    d() {
        super(SkuState.class, "currentMaxQuantity", "getCurrentMaxQuantity()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((SkuState) obj).getCurrentMaxQuantity());
    }
}
