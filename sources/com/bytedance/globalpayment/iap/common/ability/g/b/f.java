package com.bytedance.globalpayment.iap.common.ability.g.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.c.a;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

public interface f {
    static {
        Covode.recordClassIndex(17594);
    }

    void a(a aVar);

    void a(d dVar, OrderInfo orderInfo);

    void a(d dVar, IapChannelUserData iapChannelUserData);

    void a(d dVar, boolean z, List<AbsIapProduct> list);

    void a(OrderInfo orderInfo);

    void a(IapPaymentMethod iapPaymentMethod, d dVar);

    void a(IapPaymentMethod iapPaymentMethod, d dVar, List<AbsIapProduct> list);

    void b(a aVar);

    void b(d dVar, List<AbsIapProduct> list);

    void b(IapPaymentMethod iapPaymentMethod, d dVar, List<String> list);
}
