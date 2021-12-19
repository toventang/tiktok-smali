package com.bytedance.globalpayment.iap.state.pre;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.c.b;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public class a extends com.bytedance.globalpayment.iap.common.ability.f.a {

    /* renamed from: c  reason: collision with root package name */
    private final String f30498c = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17700);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.PreregisterCreateOrder;
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.pre.a$a  reason: collision with other inner class name */
    class C0639a implements com.bytedance.globalpayment.payment.common.lib.a.a<CreateOrderResponseEntity> {

        /* renamed from: b  reason: collision with root package name */
        private b f30500b;

        static {
            Covode.recordClassIndex(17701);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final void a(AbsResult absResult) {
            this.f30500b.a(false, absResult);
            a.this.a(d.a(absResult));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final /* synthetic */ void a(CreateOrderResponseEntity createOrderResponseEntity) {
            this.f30500b.a(true, null);
            a aVar = a.this;
            com.bytedance.globalpayment.iap.common.ability.f.a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(aVar);
            if (nextState != null) {
                nextState.a(aVar.f30286a);
            }
        }

        public C0639a(b bVar) {
            this.f30500b = bVar;
        }
    }

    public a(com.bytedance.globalpayment.iap.common.ability.g.b.d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        super.a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished()) {
            orderData.execute();
            c iapPayRequest = orderData.getIapPayRequest();
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            b bVar = new b(orderData.getProductId(), orderData.getOrderId(), iapPayRequest.f30267g, orderData.getPayType(), orderData.getStartPayTimeStamp(), orderData);
            bVar.a();
            com.bytedance.globalpayment.iap.d.b.d().b().a(iapPayRequest, orderData, new C0639a(bVar));
        }
    }
}
