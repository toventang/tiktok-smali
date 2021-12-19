package com.ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class l extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87465a = new l();

    static {
        Covode.recordClassIndex(54965);
    }

    l() {
        super(SkuState.class, "lowStockWarning", "getLowStockWarning()Ljava/lang/String;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((SkuState) obj).getLowStockWarning();
    }
}
