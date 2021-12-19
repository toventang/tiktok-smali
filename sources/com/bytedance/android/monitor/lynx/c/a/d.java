package com.bytedance.android.monitor.lynx.c.a;

import com.bytedance.android.monitor.b.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public long f23632a;

    /* renamed from: b  reason: collision with root package name */
    public long f23633b;

    /* renamed from: c  reason: collision with root package name */
    public long f23634c;

    /* renamed from: d  reason: collision with root package name */
    public long f23635d;

    /* renamed from: e  reason: collision with root package name */
    public long f23636e;

    /* renamed from: f  reason: collision with root package name */
    public long f23637f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23638g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23639h;

    static {
        Covode.recordClassIndex(14016);
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        com.bytedance.android.monitor.l.d.a(jSONObject, "load_start", this.f23632a);
        com.bytedance.android.monitor.l.d.a(jSONObject, "load_finish", this.f23633b);
        com.bytedance.android.monitor.l.d.a(jSONObject, "load_failed", this.f23634c);
        com.bytedance.android.monitor.l.d.a(jSONObject, "receive_error", this.f23635d);
        com.bytedance.android.monitor.l.d.a(jSONObject, "first_screen", this.f23636e);
        com.bytedance.android.monitor.l.d.a(jSONObject, "runtime_ready", this.f23637f);
    }
}
