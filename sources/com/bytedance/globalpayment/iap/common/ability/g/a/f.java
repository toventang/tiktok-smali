package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30307a;

    /* renamed from: b  reason: collision with root package name */
    private final IapPaymentMethod f30308b;

    /* renamed from: c  reason: collision with root package name */
    private final d f30309c;

    static {
        Covode.recordClassIndex(17581);
    }

    f(e eVar, IapPaymentMethod iapPaymentMethod, d dVar) {
        this.f30307a = eVar;
        this.f30308b = iapPaymentMethod;
        this.f30309c = dVar;
    }

    public final void run() {
        this.f30307a.b(this.f30308b, this.f30309c);
    }
}
