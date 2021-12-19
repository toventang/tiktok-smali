package com.bytedance.globalpayment.iap.state.nomal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.state.a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public class b extends a {

    /* renamed from: h  reason: collision with root package name */
    private final String f30493h = b.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17695);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.QueryOrder;
    }

    public b(d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        super.a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            String orderId = orderData.getOrderId();
            c iapPayRequest = orderData.getIapPayRequest();
            String productId = orderData.getProductId();
            String str = iapPayRequest.f30262b;
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            Context b2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b();
            if (b2 != null) {
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().addQueryOrderParam(b2, productId, orderId, str, orderData.getUserId(), orderData.getAbsIapChannelOrderData().isSubscription(), orderData.getAbsIapChannelOrderData().getExtraPayload(), orderData.getAbsIapChannelOrderData().isNewSubscription());
            }
            this.f30476e = new com.bytedance.globalpayment.iap.b.a(orderData.getIapPaymentMethod(), productId, orderId, str, orderData.getUserId(), orderData.getAbsIapChannelOrderData().isSubscription(), orderData.getHost(), orderData.getAbsIapChannelOrderData().isNewSubscription());
            com.bytedance.globalpayment.iap.c.c cVar = new com.bytedance.globalpayment.iap.c.c(productId, orderId, orderData.getIapPayRequest().f30267g, orderData.getPayType(), orderData);
            cVar.a();
            this.f30476e.a(this.f30477f, new a.C0637a(cVar, this.f30477f));
        }
    }
}
