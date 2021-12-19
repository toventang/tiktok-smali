package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30310a;

    /* renamed from: b  reason: collision with root package name */
    private final d f30311b;

    /* renamed from: c  reason: collision with root package name */
    private final OrderInfo f30312c;

    static {
        Covode.recordClassIndex(17582);
    }

    g(e eVar, d dVar, OrderInfo orderInfo) {
        this.f30310a = eVar;
        this.f30311b = dVar;
        this.f30312c = orderInfo;
    }

    public final void run() {
        this.f30310a.b(this.f30311b, this.f30312c);
    }
}
