package com.bytedance.globalpayment;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.b.a;
import com.bytedance.globalpayment.service.manager.iap.IapService;
import org.json.JSONObject;

public interface c {
    static {
        Covode.recordClassIndex(17545);
    }

    IapService a();

    void a(a aVar);

    void a(JSONObject jSONObject);
}
