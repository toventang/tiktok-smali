package com.bytedance.globalpayment.iap.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.List;

public interface b {
    static {
        Covode.recordClassIndex(17547);
    }

    void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list);
}
