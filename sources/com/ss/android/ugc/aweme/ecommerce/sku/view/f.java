package com.ss.android.ugc.aweme.ecommerce.sku.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87459a = new f();

    static {
        Covode.recordClassIndex(54959);
    }

    f() {
        super(SkuState.class, "currentImage", "getCurrentImage()Lcom/ss/android/ugc/aweme/ecommerce/api/model/Image;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((SkuState) obj).getCurrentImage();
    }
}
