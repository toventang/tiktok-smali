package com.ss.android.ugc.aweme.ecommerce.delivery.page.logistic;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class g extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85885a = new g();

    static {
        Covode.recordClassIndex(53778);
    }

    g() {
        super(DeliveryPanelState.class, "selectedShipToInfo", "getSelectedShipToInfo()Lcom/ss/android/ugc/aweme/ecommerce/delivery/vo/ShipToInfo;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((DeliveryPanelState) obj).getSelectedShipToInfo();
    }
}
