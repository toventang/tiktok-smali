package com.bytedance.apm.c.b;

import com.bytedance.apm.c.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f24730a;

    /* renamed from: b  reason: collision with root package name */
    public int f24731b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f24732c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f24733d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f24734e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f24735f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24736g;

    static {
        Covode.recordClassIndex(14519);
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return "service_monitor";
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return "service_monitor";
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        if (this.f24735f == null) {
            this.f24735f = new JSONObject();
        }
        try {
            this.f24735f.put("log_type", "service_monitor");
            this.f24735f.put("service", this.f24730a);
            this.f24735f.put("status", this.f24731b);
            JSONObject jSONObject = this.f24732c;
            if (jSONObject != null) {
                this.f24735f.put("value", jSONObject);
            }
            JSONObject jSONObject2 = this.f24733d;
            if (jSONObject2 != null) {
                this.f24735f.put("category", jSONObject2);
            }
            JSONObject jSONObject3 = this.f24734e;
            if (jSONObject3 != null) {
                this.f24735f.put("metric", jSONObject3);
            }
            return this.f24735f;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        return com.bytedance.apm.n.c.b(this.f24730a);
    }

    public c(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f24730a = str;
        this.f24731b = i2;
        this.f24732c = jSONObject;
        this.f24733d = jSONObject2;
        this.f24734e = jSONObject3;
        this.f24735f = jSONObject4;
    }

    public c(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z) {
        this.f24730a = str;
        this.f24731b = i2;
        this.f24732c = null;
        this.f24733d = jSONObject;
        this.f24734e = jSONObject2;
        this.f24735f = jSONObject3;
        this.f24736g = z;
    }
}
