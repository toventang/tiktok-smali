package com.bytedance.apm.c.b;

import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.c.b;
import com.bytedance.apm.q.g;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f24745a;

    /* renamed from: b  reason: collision with root package name */
    public String f24746b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24747c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f24748d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f24749e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f24750f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f24751g;

    static {
        Covode.recordClassIndex(14522);
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return "performance_monitor";
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return true;
    }

    public f() {
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return this.f24745a;
    }

    public final boolean e() {
        return TextUtils.equals(this.f24745a, "memory");
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        try {
            if (this.f24751g == null) {
                this.f24751g = new JSONObject();
            }
            this.f24751g.put("log_type", "performance_monitor");
            this.f24751g.put("service", this.f24745a);
            if (!g.b(this.f24748d)) {
                this.f24751g.put("extra_values", this.f24748d);
            }
            if (TextUtils.equals("start", this.f24745a) && TextUtils.equals("from", this.f24751g.optString("monitor-plugin"))) {
                if (this.f24749e == null) {
                    this.f24749e = new JSONObject();
                }
                this.f24749e.put("start_mode", c.f24693i);
            }
            if (!g.b(this.f24749e)) {
                this.f24751g.put("extra_status", this.f24749e);
            }
            if (!g.b(this.f24750f)) {
                this.f24751g.put("filters", this.f24750f);
            }
            return this.f24751g;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject;
        if ("fps".equals(this.f24745a) || "fps_drop".equals(this.f24745a)) {
            z = com.bytedance.apm.n.c.a(this.f24745a, this.f24746b);
        } else if ("temperature".equals(this.f24745a)) {
            z = com.bytedance.apm.n.c.e(this.f24745a);
        } else {
            if (!"battery".equals(this.f24745a)) {
                if ("start".equals(this.f24745a)) {
                    if (!com.bytedance.apm.n.c.d(this.f24745a) && !com.bytedance.apm.n.c.c(this.f24746b)) {
                        z = false;
                    }
                } else if ("start_trace".equals(this.f24745a)) {
                    if (jSONObject != null) {
                        if (!com.bytedance.apm.n.c.e("enable_perf_data_collect")) {
                            jSONObject.remove("perf_data");
                        }
                        if (!com.bytedance.apm.n.c.d(this.f24745a) && (optJSONObject = jSONObject.optJSONObject("trace")) != null) {
                            optJSONObject.remove("spans");
                        }
                    }
                    z = com.bytedance.apm.n.c.d(this.f24745a);
                } else {
                    z = com.bytedance.apm.n.c.d(this.f24745a);
                }
            }
            z = true;
        }
        if (this.f24747c || z) {
            return true;
        }
        return false;
    }

    public f(String str, JSONObject jSONObject) {
        this(str, "", null, null, jSONObject);
    }

    public f(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f24745a = str;
        this.f24746b = str2;
        this.f24747c = false;
        this.f24748d = jSONObject;
        this.f24749e = jSONObject2;
        this.f24751g = jSONObject3;
    }

    public f(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, byte b2) {
        this(str, str2, jSONObject, jSONObject2, jSONObject3);
    }
}
