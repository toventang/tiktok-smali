package com.ss.android.ugc.aweme.ecommerce.pdp.widget;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class n extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f86931a = new n();

    static {
        Covode.recordClassIndex(54492);
    }

    n() {
        super(PdpMainState.class, "reviewInfo", "getReviewInfo()Lcom/ss/android/ugc/aweme/ecommerce/pdp/repository/dto/ProductDetailReview;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((PdpMainState) obj).getReviewInfo();
    }
}
