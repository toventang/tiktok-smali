package com.bytedance.globalpayment.payment.common.lib.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.ISettings;
import com.bytedance.push.settings.a.a;
import org.json.JSONObject;

@a(a = "global_payment_online_settings")
public interface PaymentOnlineSettings extends ISettings {
    static {
        Covode.recordClassIndex(17758);
    }

    JSONObject a();

    boolean b();

    long c();

    long d();

    boolean e();
}
