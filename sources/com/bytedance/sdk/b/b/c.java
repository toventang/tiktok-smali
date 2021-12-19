package com.bytedance.sdk.b.b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f43508a;

    /* renamed from: b  reason: collision with root package name */
    public long f43509b;

    /* renamed from: c  reason: collision with root package name */
    public String f43510c;

    /* renamed from: d  reason: collision with root package name */
    public a f43511d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f43512a;

        /* renamed from: b  reason: collision with root package name */
        public String f43513b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f43514c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f43515d = "";

        static {
            Covode.recordClassIndex(26642);
        }
    }

    static {
        Covode.recordClassIndex(26641);
    }

    public static c a(String str) {
        c cVar = new c();
        JSONObject jSONObject = new JSONObject(str);
        cVar.f43510c = str;
        if (jSONObject.has("data_plan_info")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data_plan_info");
            if (jSONObject2 != null) {
                a aVar = new a();
                cVar.f43511d = aVar;
                aVar.f43512a = jSONObject2.getBoolean("product_active");
                cVar.f43511d.f43513b = jSONObject2.getString("product_id");
                cVar.f43511d.f43514c = jSONObject2.getString("product_name");
                cVar.f43511d.f43515d = jSONObject2.getString("product_start_time");
                cVar.f43509b = jSONObject2.optLong("residual_flow");
                cVar.f43508a = cVar.f43511d.f43512a;
            } else {
                cVar.f43508a = false;
            }
        } else {
            cVar.f43508a = false;
        }
        return cVar;
    }
}
