package com.ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class a extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f87454a = new a();

    static {
        Covode.recordClassIndex(54954);
    }

    a() {
        super(SkuState.class, "addToCartButton", "getAddToCartButton()Lcom/ss/android/ugc/aweme/ecommerce/sku/model/dto/AddToCartButton;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((SkuState) obj).getAddToCartButton();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((SkuState) obj).setAddToCartButton((AddToCartButton) obj2);
    }
}
