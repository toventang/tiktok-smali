package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e f30315a;

    /* renamed from: b  reason: collision with root package name */
    private final IapPaymentMethod f30316b;

    /* renamed from: c  reason: collision with root package name */
    private final d f30317c;

    /* renamed from: d  reason: collision with root package name */
    private final List f30318d;

    static {
        Covode.recordClassIndex(17584);
    }

    i(e eVar, IapPaymentMethod iapPaymentMethod, d dVar, List list) {
        this.f30315a = eVar;
        this.f30316b = iapPaymentMethod;
        this.f30317c = dVar;
        this.f30318d = list;
    }

    public final void run() {
        this.f30315a.a(this.f30317c, this.f30318d);
    }
}
