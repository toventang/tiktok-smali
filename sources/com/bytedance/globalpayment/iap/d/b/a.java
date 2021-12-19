package com.bytedance.globalpayment.iap.d.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.a.b;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.a.c;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(17614);
    }

    com.bytedance.globalpayment.iap.common.ability.f.a a(IapPaymentMethod iapPaymentMethod, Object... objArr);

    void a(IapPaymentMethod iapPaymentMethod);

    void a(IapPaymentMethod iapPaymentMethod, com.bytedance.globalpayment.iap.a.a aVar);

    void a(IapPaymentMethod iapPaymentMethod, b bVar);

    void a(IapPaymentMethod iapPaymentMethod, String str, String str2);

    void a(IapPaymentMethod iapPaymentMethod, List<String> list, boolean z, c<AbsIapProduct> cVar);

    void a(IapPaymentMethod iapPaymentMethod, boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    void b(IapPaymentMethod iapPaymentMethod);

    void c(IapPaymentMethod iapPaymentMethod);
}
