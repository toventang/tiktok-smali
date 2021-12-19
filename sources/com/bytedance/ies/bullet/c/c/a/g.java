package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import h.q;
import h.r;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private long f32009a;

    /* renamed from: b  reason: collision with root package name */
    private long f32010b;

    /* renamed from: c  reason: collision with root package name */
    private long f32011c;

    /* renamed from: d  reason: collision with root package name */
    private long f32012d;

    /* renamed from: e  reason: collision with root package name */
    private long f32013e;

    /* renamed from: f  reason: collision with root package name */
    private long f32014f;

    /* renamed from: g  reason: collision with root package name */
    private long f32015g;

    static {
        Covode.recordClassIndex(18731);
    }

    public final boolean a() {
        if (this.f32009a <= 0 || this.f32010b <= 0 || this.f32011c <= 0 || this.f32012d <= 0 || this.f32013e <= 0 || this.f32014f <= 0 || this.f32015g <= 0) {
            return false;
        }
        return true;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("on_call_from_js", this.f32010b - this.f32009a);
            jSONObject.put("on_decode_end", this.f32011c - this.f32009a);
            jSONObject.put("on_method_call", this.f32012d - this.f32009a);
            jSONObject.put("on_callback_start", this.f32013e - this.f32009a);
            jSONObject.put("on_encode_end", this.f32014f - this.f32009a);
            q.m223constructorimpl(jSONObject.put("on_callback_end", this.f32015g - this.f32009a));
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return jSONObject;
    }

    public final void a(long j2) {
        if (j2 <= 0) {
            j2 = System.currentTimeMillis();
        }
        this.f32009a = j2;
        this.f32010b = j2;
    }

    public final void b(long j2) {
        if (j2 <= 0) {
            j2 = System.currentTimeMillis();
        }
        this.f32011c = j2;
    }

    public final void c(long j2) {
        if (j2 <= 0) {
            j2 = System.currentTimeMillis();
        }
        this.f32012d = j2;
    }
}
