package com.bytedance.globalpayment.service.manager.ecommerce;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.a.b;
import com.bytedance.globalpayment.a.a.a.c.c;
import com.bytedance.globalpayment.a.b.a;

public interface ECommerceExternalService extends ECommerceService {
    static {
        Covode.recordClassIndex(17768);
    }

    ECommerceService getECommerceService();

    c getPayChannel(int i2);

    void init();

    void pay(int i2, a aVar, b bVar);

    void startBankCardOcr(String str, com.bytedance.globalpayment.a.a.a.a.a aVar);
}
