package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30322a;

    /* renamed from: b  reason: collision with root package name */
    private final IapPaymentMethod f30323b;

    /* renamed from: c  reason: collision with root package name */
    private final d f30324c;

    /* renamed from: d  reason: collision with root package name */
    private final List f30325d;

    static {
        Covode.recordClassIndex(17586);
    }

    k(e eVar, IapPaymentMethod iapPaymentMethod, d dVar, List list) {
        this.f30322a = eVar;
        this.f30323b = iapPaymentMethod;
        this.f30324c = dVar;
        this.f30325d = list;
    }

    public final void run() {
        this.f30322a.b();
    }
}
