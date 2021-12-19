package com.bytedance.w.a;

import com.bytedance.apm.c.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f45896a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f45897b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45898c = null;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f45899d = false;

    static {
        Covode.recordClassIndex(28064);
    }

    @Override // com.bytedance.apm.c.b
    public final String b() {
        return "tracing";
    }

    @Override // com.bytedance.apm.c.b
    public final boolean d() {
        return false;
    }

    @Override // com.bytedance.apm.c.b
    public final JSONObject a() {
        return this.f45897b;
    }

    @Override // com.bytedance.apm.c.b
    public final String c() {
        return this.f45896a;
    }

    @Override // com.bytedance.apm.c.b
    public final boolean a(JSONObject jSONObject) {
        int i2;
        if ("app_launch_trace".equals(this.f45898c)) {
            return com.bytedance.apm.n.c.d("start_trace");
        }
        b a2 = b.a();
        boolean z = this.f45899d;
        String str = this.f45898c;
        if (a2.f45892a) {
            if (!z || (a2.f45894c != null && a2.f45894c.optDouble(str, -1.0d) <= 0.0d)) {
                i2 = 0;
            } else {
                i2 = 16;
            }
            if (a2.f45893b != null && a2.f45893b.optDouble(str, -1.0d) > 0.0d) {
                i2 |= 1;
            }
            if (i2 != 0) {
                return true;
            }
        }
        return false;
    }

    public c(JSONObject jSONObject, String str) {
        this.f45897b = jSONObject;
        this.f45896a = str;
    }
}
