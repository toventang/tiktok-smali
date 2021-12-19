package com.bytedance.android.ecommerce.j;

import com.bytedance.android.ecommerce.g.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements f {
    static {
        Covode.recordClassIndex(3406);
    }

    private static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version_name", "1.0.0-rc.5");
            jSONObject.put("sdk_version_code", 10000);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.ecommerce.j.f
    public final void a(long j2) {
        JSONObject a2 = a();
        try {
            a2.put("param_duration", j2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("ecommerce_init", a2);
    }

    @Override // com.bytedance.android.ecommerce.i.b
    public final void a(String str, JSONObject jSONObject) {
        com.bytedance.android.ecommerce.e.c.f7063a.d().f7039k.a(str, jSONObject);
    }

    @Override // com.bytedance.android.ecommerce.j.f
    public final void a(String str, String str2, String str3, String str4, String str5, long j2, String str6) {
        JSONObject a2 = a();
        try {
            a2.put("param_payment_method_id", str);
            a2.put("param_payment_reference", str2);
            a2.put("result_code", str3);
            a2.put("error_code", str4);
            a2.put("error_message", str5);
            a2.put("param_duration", j2);
            a2.put("param_response_str", str6);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("ecommerce_pay", a2);
    }

    @Override // com.bytedance.android.ecommerce.j.f
    public final void a(String str, String str2, a aVar, String str3, String str4, int i2, long j2, String str5) {
        JSONObject a2 = a();
        try {
            a2.put("merchant_order_id", str);
            a2.put("param_payment_reference", str2);
            a2.put("order_status", aVar.getStatus());
            a2.put("error_code", str3);
            a2.put("error_message", str4);
            a2.put("try_times", i2);
            a2.put("param_duration", j2);
            a2.put("param_response_str", str5);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("ecommerce_query", a2);
    }
}
