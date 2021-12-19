package com.ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class c extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87456a = new c();

    static {
        Covode.recordClassIndex(54956);
    }

    c() {
        super(SkuState.class, "currentQuantity", "getCurrentQuantity()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((SkuState) obj).getCurrentQuantity());
    }
}
