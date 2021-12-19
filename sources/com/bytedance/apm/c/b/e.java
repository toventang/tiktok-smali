package com.bytedance.apm.c.b;

import com.bytedance.apm.c.b;
import com.bytedance.apm.n.c;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f24742a;

    /* renamed from: b  reason: collision with root package name */
    public String f24743b;

    /* renamed from: c  reason: collision with root package name */
    public float f24744c;

    static {
        Covode.recordClassIndex(14521);
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return "timer";
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return "timer";
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return false;
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringSet.type, this.f24742a);
            jSONObject.put("key", this.f24743b);
            jSONObject.put("value", (double) this.f24744c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        return c.c(this.f24742a);
    }

    public e(String str, String str2, float f2) {
        this.f24742a = str;
        this.f24743b = str2;
        this.f24744c = f2;
    }
}
