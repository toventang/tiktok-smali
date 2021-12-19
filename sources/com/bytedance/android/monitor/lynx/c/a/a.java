package com.bytedance.android.monitor.lynx.c.a;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public float f23612b;

    /* renamed from: c  reason: collision with root package name */
    public int f23613c;

    /* renamed from: d  reason: collision with root package name */
    public int f23614d;

    /* renamed from: e  reason: collision with root package name */
    public long f23615e;

    /* renamed from: f  reason: collision with root package name */
    public long f23616f;

    /* renamed from: g  reason: collision with root package name */
    public long f23617g;

    /* renamed from: h  reason: collision with root package name */
    public int f23618h;

    /* renamed from: i  reason: collision with root package name */
    public int f23619i;

    /* renamed from: j  reason: collision with root package name */
    public int f23620j;

    static {
        Covode.recordClassIndex(14013);
    }

    public a() {
        super("blank");
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        d.a(jSONObject, "effective_percentage", Float.valueOf(this.f23612b));
        d.a(jSONObject, "view_height", this.f23613c);
        d.a(jSONObject, "view_width", this.f23614d);
        d.a(jSONObject, "view_alpha", this.f23619i);
        d.a(jSONObject, "element_count", this.f23620j);
        d.a(jSONObject, "collect_time", this.f23616f);
        d.a(jSONObject, "calculate_time", this.f23617g);
        d.a(jSONObject, "cost_time", this.f23615e);
        d.a(jSONObject, "detect_type", this.f23618h);
    }
}
