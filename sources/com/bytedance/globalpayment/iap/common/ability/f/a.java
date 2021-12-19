package com.bytedance.globalpayment.iap.common.ability.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.b;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public OrderData f30286a;

    /* renamed from: b  reason: collision with root package name */
    protected d f30287b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30288c = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17570);
    }

    public abstract com.bytedance.globalpayment.iap.common.ability.a.a a();

    public void a(OrderData orderData) {
        this.f30286a = orderData;
    }

    public a(d dVar) {
        this.f30287b = dVar;
    }

    public final void a(com.bytedance.globalpayment.iap.common.ability.d dVar) {
        String str;
        this.f30286a.finish();
        if (dVar.f30275c == PayType.UNKNOWN) {
            dVar.f30275c = this.f30286a.getPayType();
        }
        this.f30286a.getIapPayMonitor().a(dVar, a());
        b.e().c().a(this.f30286a, dVar, a());
        OrderInfo buildOrderInfo = this.f30286a.buildOrderInfo();
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e().a("notifyPayCallback. %s, %s", dVar, buildOrderInfo);
        if (this.f30286a.getIapPayRequest() == null) {
            str = "";
        } else {
            str = this.f30286a.getIapPayRequest().f30269i;
        }
        dVar.f30273a = str;
        dVar.f30274b = this.f30286a.getIapPayRequest();
        dVar.f30275c = this.f30286a.getPayType();
        if (this.f30286a.getPayType() == PayType.PRE && dVar.getCode() == 0) {
            this.f30287b.removeAcquireRewards(this.f30286a.getProductId());
        }
        b.e().a().a(dVar, buildOrderInfo);
        this.f30287b.onIapOrderFinished(this.f30286a);
    }
}
