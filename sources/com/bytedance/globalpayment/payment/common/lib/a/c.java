package com.bytedance.globalpayment.payment.common.lib.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;
import java.util.List;

public interface c<T> {
    static {
        Covode.recordClassIndex(17708);
    }

    void a(AbsResult absResult, List<T> list);
}
