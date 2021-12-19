package com.bytedance.globalpayment.iap.common.ability.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import org.json.JSONObject;

public final class a extends com.bytedance.globalpayment.iap.common.ability.b.a implements com.bytedance.globalpayment.iap.common.ability.g.b.a {
    static {
        Covode.recordClassIndex(17571);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.a
    public final void a(OrderData orderData, d dVar, com.bytedance.globalpayment.iap.common.ability.a.a aVar) {
        JSONObject a2 = a(a(orderData), dVar);
        if (aVar != null) {
            add(a2, "cur_pay_state", aVar.name());
        } else {
            add(a2, "cur_pay_state", "unknown");
        }
        a("pipo_pay_end", a2);
    }
}
