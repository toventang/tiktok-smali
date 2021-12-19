package com.bytedance.globalpayment.payment.common.lib.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;

public interface a<T> {
    static {
        Covode.recordClassIndex(17706);
    }

    void a(AbsResult absResult);

    void a(T t);
}
