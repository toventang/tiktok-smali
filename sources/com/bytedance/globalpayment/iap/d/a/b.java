package com.bytedance.globalpayment.iap.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.b.a;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import org.json.JSONObject;

public final class b extends a implements com.bytedance.globalpayment.iap.d.b.b {
    static {
        Covode.recordClassIndex(17612);
    }

    @Override // com.bytedance.globalpayment.iap.d.b.b
    public final void b(OrderData orderData) {
        a("pipo_pay_start", a(orderData));
    }

    @Override // com.bytedance.globalpayment.iap.d.b.b
    public final void a(OrderData orderData, d dVar) {
        JSONObject a2 = a(a(orderData), dVar);
        add(a2, "cur_pay_state", "unknown");
        a("pipo_pay_end", a2);
    }

    @Override // com.bytedance.globalpayment.iap.d.b.b
    public final void b(OrderData orderData, AbsResult absResult) {
        a("ack_after_query_failed", a(a(orderData), d.a(absResult)));
    }

    @Override // com.bytedance.globalpayment.iap.d.b.b
    public final void a(OrderData orderData, AbsResult absResult) {
        a("remove_invalid_order", a(a(orderData), d.a(absResult)));
    }
}
