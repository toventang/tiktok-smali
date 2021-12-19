package com.bytedance.globalpayment.iap.state.extra;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.state.a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public class a extends com.bytedance.globalpayment.iap.state.a {

    /* renamed from: h  reason: collision with root package name */
    private final String f30485h = a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17688);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.ExtraQueryOrder;
    }

    public a(d dVar) {
        super(dVar);
        this.f30475d = 8;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        super.a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            String orderId = orderData.getOrderId();
            c iapPayRequest = orderData.getIapPayRequest();
            String productId = orderData.getProductId();
            String str = iapPayRequest.f30262b;
            Context b2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b();
            if (b2 != null) {
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().addQueryOrderParam(b2, productId, orderId, str, orderData.getUserId(), iapPayRequest.f30267g, iapPayRequest.f30269i, orderData.isNewSubscription());
            }
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            IapPaymentMethod iapPaymentMethod = orderData.getIapPaymentMethod();
            int i2 = this.f30475d;
            String userId = orderData.getUserId();
            boolean z = iapPayRequest.f30267g;
            this.f30286a.getPayType();
            this.f30476e = new com.bytedance.globalpayment.iap.b.a(iapPaymentMethod, productId, orderId, str, i2, userId, z, orderData.getHost(), orderData.isNewSubscription());
            com.bytedance.globalpayment.iap.c.c cVar = new com.bytedance.globalpayment.iap.c.c(productId, orderId, orderData.getIapPayRequest().f30267g, orderData.getPayType(), orderData);
            cVar.a();
            this.f30476e.a(this.f30477f, new a.C0637a(cVar, this.f30477f));
        }
    }
}
