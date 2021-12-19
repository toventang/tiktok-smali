package com.bytedance.globalpayment.iap.state.pre;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.b.b;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public class c extends com.bytedance.globalpayment.iap.common.ability.f.a {

    /* renamed from: c  reason: collision with root package name */
    private final String f30502c = c.class.getSimpleName();

    static {
        Covode.recordClassIndex(17703);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.PreregisterUploadToken;
    }

    public c(d dVar) {
        super(dVar);
    }

    class a implements com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity> {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.globalpayment.iap.c.d f30503a;

        static {
            Covode.recordClassIndex(17704);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final void a(AbsResult absResult) {
            this.f30503a.a(false, com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
            c.this.a(com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final /* synthetic */ void a(ResponseEntity responseEntity) {
            this.f30503a.a(true, null);
            c cVar = c.this;
            com.bytedance.globalpayment.iap.common.ability.f.a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(cVar);
            if (nextState != null) {
                nextState.a(cVar.f30286a);
            }
        }

        public a(com.bytedance.globalpayment.iap.c.d dVar) {
            this.f30503a = dVar;
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
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            com.bytedance.globalpayment.iap.c.d dVar = new com.bytedance.globalpayment.iap.c.d(orderData.getProductId(), orderData.getOrderId(), tokenInfo.isSubscription(), orderData.getPayType(), orderData);
            dVar.a();
            new b(iapPayRequest.f30262b, orderData.getHost(), tokenInfo).a(new a(dVar));
        }
    }
}
