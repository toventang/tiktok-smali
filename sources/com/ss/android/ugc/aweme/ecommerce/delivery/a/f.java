package com.ss.android.ugc.aweme.ecommerce.delivery.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f85822a = new f();

    static {
        Covode.recordClassIndex(53695);
    }

    f() {
        super(DeliveryPanelState.class, "status", "getStatus()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((DeliveryPanelState) obj).getStatus());
    }
}
