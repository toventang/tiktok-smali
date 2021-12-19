package com.bytedance.globalpayment.iap.state.nomal;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.c.b;
import com.bytedance.globalpayment.iap.common.ability.c;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

public class a extends com.bytedance.globalpayment.iap.common.ability.f.a {

    /* renamed from: c  reason: collision with root package name */
    private final String f30490c = a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17693);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.CreateOrder;
    }

    public a(d dVar) {
        super(dVar);
    }

    /* renamed from: com.bytedance.globalpayment.iap.state.nomal.a$a  reason: collision with other inner class name */
    class C0638a implements com.bytedance.globalpayment.payment.common.lib.a.a<CreateOrderResponseEntity> {

        /* renamed from: b  reason: collision with root package name */
        private b f30492b;

        static {
            Covode.recordClassIndex(17694);
        }

        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final void a(AbsResult absResult) {
            this.f30492b.a(false, absResult);
            if (absResult instanceof com.bytedance.globalpayment.iap.common.ability.d) {
                a.this.a((com.bytedance.globalpayment.iap.common.ability.d) absResult);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.globalpayment.payment.common.lib.a.a
        public final /* synthetic */ void a(CreateOrderResponseEntity createOrderResponseEntity) {
            this.f30492b.a(true, null);
            a aVar = a.this;
            com.bytedance.globalpayment.iap.common.ability.f.a nextState = PaymentServiceManager.get().getIapExternalService().getNextState(aVar);
            if (nextState != null) {
                nextState.a(aVar.f30286a);
            }
        }

        public C0638a(b bVar) {
            this.f30492b = bVar;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        super.a(orderData);
        if (orderData.isCanceled() || orderData.isFinished()) {
            orderData.isCanceled();
            orderData.isConsumed();
            orderData.getProductId();
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            return;
        }
        orderData.execute();
        c iapPayRequest = orderData.getIapPayRequest();
        b bVar = new b(orderData.getProductId(), orderData.getOrderId(), iapPayRequest.f30267g, orderData.getPayType(), orderData.getStartPayTimeStamp(), this.f30286a);
        bVar.a();
        com.bytedance.globalpayment.iap.d.b.d().b().a(iapPayRequest, orderData, new C0638a(bVar));
    }
}
