package com.bytedance.globalpayment.iap.common.ability.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import org.json.JSONObject;

public final class a extends com.bytedance.globalpayment.payment.common.lib.g.a {

    /* renamed from: b  reason: collision with root package name */
    private String f30276b;

    /* renamed from: c  reason: collision with root package name */
    private String f30277c;

    static {
        Covode.recordClassIndex(17568);
    }

    public final void a() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "request_id", this.f30276b);
        add(jSONObject, "product_id", this.f30277c);
        a(jSONObject);
    }

    public final void a(boolean z, d dVar) {
        long j2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        add(jSONObject, "status", j2);
        add(jSONObject, "api_name", this.f30566a);
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject, "result_message", dVar.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "request_id", this.f30276b);
        add(jSONObject2, "product_id", this.f30277c);
        a(jSONObject, jSONObject2);
    }

    public a(String str, String str2, String str3) {
        super(str);
        this.f30276b = str2;
        this.f30277c = str3;
    }
}
