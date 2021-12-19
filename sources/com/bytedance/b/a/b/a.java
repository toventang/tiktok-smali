package com.bytedance.b.a.b;

import android.text.TextUtils;
import com.bytedance.b.h.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f25836a;

    /* renamed from: b  reason: collision with root package name */
    public int f25837b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f25838c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f25839d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f25840e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f25841f;

    static {
        Covode.recordClassIndex(15087);
    }

    @Override // com.bytedance.b.h.b
    public final String a() {
        return "service_monitor";
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        if (!TextUtils.isEmpty(this.f25836a)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CommonEvent{serviceName='" + this.f25836a + '\'' + '}';
    }

    @Override // com.bytedance.b.h.b
    public final JSONObject c() {
        try {
            JSONObject jSONObject = this.f25841f;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("service", this.f25836a);
            jSONObject.put("status", this.f25837b);
            JSONObject jSONObject2 = this.f25838c;
            if (jSONObject2 != null) {
                jSONObject.put("value", jSONObject2);
            }
            JSONObject jSONObject3 = this.f25839d;
            if (jSONObject3 != null) {
                jSONObject.put("category", jSONObject3);
            }
            JSONObject jSONObject4 = this.f25840e;
            if (jSONObject4 != null) {
                jSONObject.put("metric", jSONObject4);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f25836a = str;
        this.f25837b = i2;
        this.f25838c = jSONObject;
        this.f25839d = jSONObject2;
        this.f25840e = jSONObject3;
        this.f25841f = jSONObject4;
    }
}
