package com.bytedance.apm.c.b;

import com.bytedance.apm.c.b;
import com.bytedance.apm.n.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f24752a;

    /* renamed from: b  reason: collision with root package name */
    public String f24753b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f24754c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f24755d = null;

    static {
        Covode.recordClassIndex(14523);
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return "ui_action";
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return "ui_action";
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        try {
            if (this.f24755d == null) {
                this.f24755d = new JSONObject();
            }
            this.f24755d.put("log_type", "ui_action");
            this.f24755d.put("action", this.f24752a);
            this.f24755d.put("page", this.f24753b);
            this.f24755d.put("context", this.f24754c);
            return this.f24755d;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        return c.d("ui");
    }

    public g(String str, String str2, JSONObject jSONObject) {
        this.f24752a = str;
        this.f24753b = str2;
        this.f24754c = jSONObject;
    }
}
