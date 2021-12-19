package com.bytedance.globalpayment.iap.state.pre;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.f.a;
import com.bytedance.globalpayment.iap.common.ability.g.b.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.d.b;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;

public class PreregisterConsumeState extends a {

    /* renamed from: c  reason: collision with root package name */
    public final String f30497c = PreregisterConsumeState.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17698);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final com.bytedance.globalpayment.iap.common.ability.a.a a() {
        return com.bytedance.globalpayment.iap.common.ability.a.a.PreregisterConsume;
    }

    public PreregisterConsumeState(d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.f.a
    public final void a(OrderData orderData) {
        AbsIapChannelOrderData absIapChannelOrderData;
        super.a(orderData);
        if (!orderData.isCanceled() && !orderData.isFinished() && (absIapChannelOrderData = orderData.getAbsIapChannelOrderData()) != null) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            orderData.getProductId();
            com.bytedance.globalpayment.iap.c.a aVar = new com.bytedance.globalpayment.iap.c.a(orderData.getProductId(), orderData.getOrderId(), orderData.getPayType(), orderData.getIapPayRequest().f30267g, this.f30286a);
            aVar.a();
            b.d().c().a(orderData.getIapPaymentMethod(), orderData.getIapPayRequest().f30267g, absIapChannelOrderData.getChannelToken(), new ChannelPayConsumeFinishedListener(aVar));
        }
    }

    class ChannelPayConsumeFinishedListener implements ConsumeIapProductListener {
        private com.bytedance.globalpayment.iap.c.a mConsumeProductMonitor;

        static {
            Covode.recordClassIndex(17699);
        }

        @Override // com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener
        public void onConsumeFinished(AbsResult absResult) {
            int code = absResult.getCode();
            if (code == 0) {
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                PreregisterConsumeState.this.f30286a.getOrderId();
                this.mConsumeProductMonitor.a(true, null);
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().removePayload(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), PreregisterConsumeState.this.f30286a.getOrderId());
                PreregisterConsumeState.this.f30286a.setConsumed(true);
                if (PreregisterConsumeState.this.f30286a.isSuccess() && !PreregisterConsumeState.this.f30286a.isFinished()) {
                    PreregisterConsumeState.this.a(new com.bytedance.globalpayment.iap.common.ability.d(0, 0, "pay success in ChannelPayConsumeFinishedListener"));
                    return;
                }
                return;
            }
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            com.bytedance.globalpayment.iap.common.ability.d dVar = new com.bytedance.globalpayment.iap.common.ability.d(207, code, "preRegisterawards google consume product fail, " + absResult.getMessage());
            this.mConsumeProductMonitor.a(false, dVar);
            PreregisterConsumeState.this.a(dVar);
        }

        public ChannelPayConsumeFinishedListener(com.bytedance.globalpayment.iap.c.a aVar) {
            this.mConsumeProductMonitor = aVar;
        }
    }
}
