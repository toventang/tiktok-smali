package com.bytedance.globalpayment;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.h.a;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapService;
import org.json.JSONObject;

public final class b implements c {
    static {
        Covode.recordClassIndex(17544);
    }

    @Override // com.bytedance.globalpayment.c
    public final IapService a() {
        return PaymentServiceManager.get().getIapExternalService();
    }

    @Override // com.bytedance.globalpayment.c
    public final void a(JSONObject jSONObject) {
        a.a().h().a(jSONObject);
    }

    @Override // com.bytedance.globalpayment.c
    public final void a(com.bytedance.globalpayment.payment.common.lib.b.a aVar) {
        a.a().i().a(aVar);
        a.a().b();
        PaymentServiceManager.get().getIapExternalService().init();
        PaymentServiceManager.get().getECommerceExternalService().init();
        PaymentServiceManager.get().getFeAbilityExternalService().init();
    }
}
