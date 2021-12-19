package com.bytedance.globalpayment.payment.common.lib.h.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.c.a;
import org.json.JSONObject;

public final class b implements com.bytedance.globalpayment.payment.common.lib.h.b.b {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.globalpayment.payment.common.lib.e.b f30578a = new a();

    static {
        Covode.recordClassIndex(17726);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.b
    public final void a(com.bytedance.globalpayment.payment.common.lib.e.b bVar) {
        if (bVar != null) {
            this.f30578a = bVar;
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.e.b
    public final void a(String str, JSONObject jSONObject) {
        this.f30578a.a(str, jSONObject);
    }
}
