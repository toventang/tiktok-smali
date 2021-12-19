package com.bytedance.globalpayment.iap.d.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;

public interface b {
    static {
        Covode.recordClassIndex(17615);
    }

    void a(OrderData orderData, d dVar);

    void a(OrderData orderData, AbsResult absResult);

    void b(OrderData orderData);

    void b(OrderData orderData, AbsResult absResult);
}
