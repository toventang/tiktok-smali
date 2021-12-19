package com.bytedance.apm.c.b;

import com.bytedance.apm.c;
import com.bytedance.apm.c.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f24737a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24738b;

    /* renamed from: c  reason: collision with root package name */
    public long f24739c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24740d;

    /* renamed from: e  reason: collision with root package name */
    private String f24741e;

    static {
        Covode.recordClassIndex(14520);
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return true;
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return this.f24741e;
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return this.f24741e;
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        JSONObject jSONObject = this.f24737a;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("timestamp", this.f24739c);
            this.f24737a.put("crash_time", this.f24739c);
            this.f24737a.put("is_main_process", c.b());
            this.f24737a.put("process_name", c.a());
            this.f24737a.put("log_type", this.f24741e);
            if (c.f24695k > c.d() || c.f24695k == 0) {
                this.f24737a.put("app_launch_start_time", c.d());
            } else {
                this.f24737a.put("app_launch_start_time", c.f24695k);
            }
        } catch (JSONException unused) {
        }
        return this.f24737a;
    }

    public final String toString() {
        return "ExceptionLogData{eventType='" + this.f24741e + '\'' + ", logJson=" + this.f24737a + ", forceSampled=" + this.f24738b + ", time=" + this.f24739c + '}';
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        if (this.f24738b || com.bytedance.apm.n.c.e(this.f24741e)) {
            return true;
        }
        return false;
    }

    public d(String str, JSONObject jSONObject) {
        this(str, jSONObject, System.currentTimeMillis());
    }

    public d(String str, JSONObject jSONObject, long j2) {
        this.f24741e = str;
        this.f24737a = jSONObject;
        this.f24739c = j2;
    }
}
