package com.bytedance.globalpayment.iap.common.ability.g.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;

public interface d {
    static {
        Covode.recordClassIndex(17592);
    }

    void onIapOrderFinished(OrderData orderData);

    void removeAcquireRewards(String str);
}
