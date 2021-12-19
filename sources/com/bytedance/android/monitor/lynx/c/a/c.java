package com.bytedance.android.monitor.lynx.c.a;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    public String f23623b;

    /* renamed from: c  reason: collision with root package name */
    public String f23624c;

    /* renamed from: d  reason: collision with root package name */
    public int f23625d;

    /* renamed from: e  reason: collision with root package name */
    public int f23626e;

    /* renamed from: f  reason: collision with root package name */
    public String f23627f;

    /* renamed from: g  reason: collision with root package name */
    public int f23628g;

    /* renamed from: h  reason: collision with root package name */
    public int f23629h;

    /* renamed from: i  reason: collision with root package name */
    public String f23630i;

    /* renamed from: j  reason: collision with root package name */
    public int f23631j;

    static {
        Covode.recordClassIndex(14015);
    }

    public c() {
        super("fetchError");
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        d.a(jSONObject, "method", this.f23623b);
        d.a(jSONObject, "error_code", this.f23631j);
        d.a(jSONObject, "error_msg", this.f23630i);
        d.a(jSONObject, "url", this.f23624c);
        d.a(jSONObject, "status_code", this.f23625d);
        d.a(jSONObject, "request_error_code", this.f23626e);
        d.a(jSONObject, "request_error_msg", this.f23627f);
        d.a(jSONObject, "jsb_ret", this.f23628g);
        d.a(jSONObject, "hit_prefetch", this.f23629h);
    }
}
