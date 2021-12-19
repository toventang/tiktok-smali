package com.bytedance.apm.c.b;

import com.bytedance.apm.n.c;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements com.bytedance.apm.c.b {

    /* renamed from: a  reason: collision with root package name */
    public String f24727a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f24728b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24729c;

    static {
        Covode.recordClassIndex(14518);
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return "common_log";
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return this.f24727a;
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        JSONObject jSONObject = this.f24728b;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("log_type", this.f24727a);
        } catch (JSONException unused) {
        }
        return this.f24728b;
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        return c.a(this.f24727a);
    }

    public b(String str, JSONObject jSONObject, boolean z) {
        this.f24727a = str;
        this.f24728b = jSONObject;
        this.f24729c = z;
    }
}
