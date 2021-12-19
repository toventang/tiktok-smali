package com.bytedance.globalpayment.iap.common.ability.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(17564);
    }

    void a(d dVar, OrderInfo orderInfo);

    void a(d dVar, List<AbsIapProduct> list);

    void a(IapPaymentMethod iapPaymentMethod, d dVar);

    void b(d dVar, OrderInfo orderInfo);

    void b(d dVar, List<AbsIapProduct> list);
}
