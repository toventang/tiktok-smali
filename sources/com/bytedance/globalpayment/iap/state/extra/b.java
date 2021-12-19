package com.bytedance.globalpayment.iap.state.extra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public class b extends com.bytedance.globalpayment.iap.common.ability.f.a {

    /* renamed from: c  reason: collision with root package name */
    private final String f30486c = b.class.getSimpleName();

    static {
        Covode.recordClassIndex(17689);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.ExtraUploadToken;
    }

    public b(d dVar) {
        super(dVar);
    }

    class a implements com.bytedance.globalpayment.payment.common.lib.a.a<ResponseEntity> {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.globalpayment.iap.c.d f30487a;

        static {
            Covode.recordClassIndex(17690);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final void a(AbsResult absResult) {
            this.f30487a.a(false, com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
            b.this.a(com.bytedance.globalpayment.iap.common.ability.d.a(absResult));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final /* synthetic */ void a(ResponseEntity responseEntity) {
            ResponseEntity responseEntity2 = responseEntity;
            this.f30487a.a(true, null);
            if (TextUtils.isEmpty(b.this.f30286a.getOrderId())) {
                b.this.f30286a.setOrderId(responseEntity2.getOrderId());
            }
            b bVar = b.this;
            com.bytedance.globalpayment.iap.common.ability.f.a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(bVar);
            if (nextState != null) {
                nextState.a(bVar.f30286a);
            }
        }

        public a(com.bytedance.globalpayment.iap.c.d dVar) {
            this.f30487a = dVar;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        super.a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            orderData.execute();
            c iapPayRequest = orderData.getIapPayRequest();
            TokenInfo tokenInfo = new TokenInfo();
            tokenInfo.setOrderId(orderData.getOrderId()).setProductId(orderData.getProductId()).setUserId(orderData.getUserId()).setSubscription(iapPayRequest.f30267g).setNewSubscription(orderData.isNewSubscription()).setChannelUserId(orderData.getChannelUserId()).setPaymentMethod(orderData.getIapPaymentMethod().channelName).setOrderFromOtherSystem(orderData.isOrderFromOtherSystem());
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
            new com.bytedance.globalpayment.iap.b.b(iapPayRequest.f30262b, orderData.getHost(), tokenInfo).a(new a(dVar));
        }
    }
}
