package com.bytedance.globalpayment.payment.common.lib.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.a.a;

@a(a = "global_payment_local_settings")
public interface PaymentLocalSettings extends ILocalSettings {
    static {
        Covode.recordClassIndex(17755);
    }

    String a();

    void a(long j2);

    void a(String str);

    long b();
}
