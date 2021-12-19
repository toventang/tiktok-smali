package com.bytedance.globalpayment.iap.common.ability.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.a.b;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import java.util.List;

public interface a extends b {
    static {
        Covode.recordClassIndex(17566);
    }

    void onCJBillingCallback(OrderData orderData);

    void onPurchasesUpdated(d dVar, List<AbsIapChannelOrderData> list);
}
