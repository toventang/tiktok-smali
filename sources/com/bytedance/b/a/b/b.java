package com.bytedance.b.a.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b implements com.bytedance.b.h.b {

    /* renamed from: a  reason: collision with root package name */
    public String f25842a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f25843b;

    static {
        Covode.recordClassIndex(15088);
    }

    @Override // com.bytedance.b.h.b
    public final String a() {
        return this.f25842a;
    }

    @Override // com.bytedance.b.h.b
    public final boolean b() {
        if (!TextUtils.isEmpty(this.f25842a)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.b.h.b
    public final JSONObject c() {
        try {
            JSONObject jSONObject = this.f25843b;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", this.f25842a);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String toString() {
        return "CommonLog{logType='" + this.f25842a + '\'' + '}';
    }

    public b(String str, JSONObject jSONObject) {
        this.f25842a = str;
        this.f25843b = jSONObject;
    }
}
