package com.bytedance.globalpayment.payment.common.lib.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;

public interface b {
    static {
        Covode.recordClassIndex(17707);
    }

    void a(AbsResult absResult);

    void a(String str);
}
