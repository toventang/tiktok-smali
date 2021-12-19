package com.bytedance.globalpayment.service.manager.ecommerce.wecht;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.c.c;

public interface IWeChtExternalService {
    static {
        Covode.recordClassIndex(17772);
    }

    c getPayChannel();
}
