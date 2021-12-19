package com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class e extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85883a = new e();

    static {
        Covode.recordClassIndex(53776);
    }

    e() {
        super(DeliveryPanelState.class, "selectedLogistic", "getSelectedLogistic()Lcom/ss/android/ugc/aweme/ecommerce/delivery/repo/dto/LogisticDTO;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((DeliveryPanelState) obj).getSelectedLogistic();
    }
}
