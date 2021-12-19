package com.bytedance.globalpayment.payment.common.lib.h.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.a.d;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import org.json.JSONObject;

public interface g extends d {
    static {
        Covode.recordClassIndex(17746);
    }

    void a(JSONObject jSONObject);

    PaymentOnlineSettings b();

    PaymentLocalSettings c();

    boolean d();

    long e();

    long f();

    long g();

    boolean h();

    long i();
}
