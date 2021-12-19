package com.bytedance.globalpayment.service.manager.iap.google;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;

public interface ConsumeIapProductListener {
    static {
        Covode.recordClassIndex(17781);
    }

    void onConsumeFinished(AbsResult absResult);
}
