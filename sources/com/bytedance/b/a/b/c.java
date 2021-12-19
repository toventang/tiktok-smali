package com.bytedance.b.a.b;

import android.text.TextUtils;
import com.bytedance.b.h.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f25844a;

    /* renamed from: b  reason: collision with root package name */
    private String f25845b;

    static {
        Covode.recordClassIndex(15089);
    }

    @Override // com.bytedance.b.h.b
    public final String a() {
        return this.f25845b;
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        if (!TextUtils.isEmpty(this.f25845b)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.b.h.b
    public final JSONObject c() {
        try {
            JSONObject jSONObject = this.f25844a;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", this.f25845b);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String toString() {
        return "Apm5LegacyEvent{logType='" + this.f25845b + '\'' + '}';
    }

    public c(String str, JSONObject jSONObject) {
        this.f25845b = str;
        this.f25844a = jSONObject;
    }
}
