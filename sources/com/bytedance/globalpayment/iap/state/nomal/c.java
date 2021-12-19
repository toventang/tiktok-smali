package com.bytedance.globalpayment.iap.state.nomal;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.b.b;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public class c extends com.bytedance.globalpayment.iap.common.ability.f.a {

    /* renamed from: c  reason: collision with root package name */
    private final String f30494c = c.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17696);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.UploadToken;
    }

    public c(d dVar) {
        super(dVar);
    }

    class a implements com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity> {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.globalpayment.iap.c.d f30495a;

        static {
            Covode.recordClassIndex(17697);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final void a(AbsResult absResult) {
            if (absResult instanceof com.bytedance.globalpayment.iap.common.ability.d) {
                com.bytedance.globalpayment.iap.common.ability.d dVar = (com.bytedance.globalpayment.iap.common.ability.d) absResult;
                this.f30495a.a(false, dVar);
                c.this.a(dVar);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final /* synthetic */ void a(ResponseEntity responseEntity) {
            this.f30495a.a(true, null);
            c cVar = c.this;
            com.bytedance.globalpayment.iap.common.ability.f.a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(cVar);
            if (nextState != null) {
                nextState.a(cVar.f30286a);
            }
        }

        public a(com.bytedance.globalpayment.iap.c.d dVar) {
            this.f30495a = dVar;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        super.a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            com.bytedance.globalpayment.iap.common.ability.c iapPayRequest = orderData.getIapPayRequest();
            TokenInfo tokenInfo = new TokenInfo();
            tokenInfo.setOrderId(orderData.getOrderId()).setProductId(orderData.getProductId()).setUserId(orderData.getUserId()).setChannelUserId(orderData.getChannelUserId()).setPaymentMethod(orderData.getIapPaymentMethod().channelName).setSubscription(iapPayRequest.f30267g).setNewSubscription(orderData.isNewSubscription());
            AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
            if (absIapChannelOrderData != null) {
                tokenInfo.setToken(absIapChannelOrderData.getSelfToken()).setChannelOrderId(absIapChannelOrderData.getChannelOrderId());
            }
            AbsIapProduct absIapProduct = orderData.getAbsIapProduct();
            if (absIapProduct != null) {
                double priceAmountMicros = (double) absIapProduct.getPriceAmountMicros();
                Double.isNaN(priceAmountMicros);
                tokenInfo.setAmountValue(String.valueOf(priceAmountMicros / 1000000.0d)).setCurrency(absIapProduct.getPriceCurrencyCode());
            }
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            com.bytedance.globalpayment.iap.c.d dVar = new com.bytedance.globalpayment.iap.c.d(orderData.getProductId(), orderData.getOrderId(), tokenInfo.isSubscription(), orderData.getPayType(), orderData);
            dVar.a();
            new b(iapPayRequest.f30262b, orderData.getHost(), tokenInfo).a(new a(dVar));
        }
    }
}
