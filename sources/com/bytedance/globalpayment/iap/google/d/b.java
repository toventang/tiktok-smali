package com.bytedance.globalpayment.iap.google.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.a;
import org.json.JSONObject;

public final class b extends a {
    static {
        Covode.recordClassIndex(17638);
    }

    public final void a(String str, String str2, boolean z, int i2) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", str);
        add(jSONObject, "request_id", str2);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) PayType.EXTRA_TOKEN.ordinal());
        add(jSONObject2, "is_subscription", z);
        add(jSONObject2, "restore_order_type", (long) i2);
        add(jSONObject2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_google_pay_restore_order_event", jSONObject2, null, jSONObject);
    }
}
