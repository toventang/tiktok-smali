package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30313a;

    /* renamed from: b  reason: collision with root package name */
    private final OrderInfo f30314b;

    static {
        Covode.recordClassIndex(17583);
    }

    h(e eVar, OrderInfo orderInfo) {
        this.f30313a = eVar;
        this.f30314b = orderInfo;
    }

    public final void run() {
        this.f30313a.a();
    }
}
