package com.bytedance.android.monitorV2.lynx.c.b;

import com.bytedance.android.monitorV2.a.a;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public long f24105a;

    /* renamed from: b  reason: collision with root package name */
    public long f24106b;

    /* renamed from: c  reason: collision with root package name */
    public long f24107c;

    /* renamed from: d  reason: collision with root package name */
    public long f24108d;

    /* renamed from: e  reason: collision with root package name */
    public long f24109e;

    /* renamed from: f  reason: collision with root package name */
    public long f24110f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24111g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f24112h;

    static {
        Covode.recordClassIndex(14199);
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        f.a(jSONObject, "load_start", this.f24105a);
        f.a(jSONObject, "load_finish", this.f24106b);
        f.a(jSONObject, "load_failed", this.f24107c);
        f.a(jSONObject, "receive_error", this.f24108d);
        f.a(jSONObject, "first_screen", this.f24109e);
        f.a(jSONObject, "runtime_ready", this.f24110f);
    }
}
