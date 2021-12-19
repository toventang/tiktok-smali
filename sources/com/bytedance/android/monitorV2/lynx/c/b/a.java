package com.bytedance.android.monitorV2.lynx.c.b;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public float f24091b;

    /* renamed from: c  reason: collision with root package name */
    public int f24092c;

    /* renamed from: d  reason: collision with root package name */
    public int f24093d;

    /* renamed from: e  reason: collision with root package name */
    public long f24094e;

    /* renamed from: f  reason: collision with root package name */
    public long f24095f;

    /* renamed from: g  reason: collision with root package name */
    public long f24096g;

    /* renamed from: h  reason: collision with root package name */
    public int f24097h;

    /* renamed from: i  reason: collision with root package name */
    public long f24098i;

    /* renamed from: j  reason: collision with root package name */
    public long f24099j;

    /* renamed from: k  reason: collision with root package name */
    public int f24100k;

    /* renamed from: l  reason: collision with root package name */
    public int f24101l;

    static {
        Covode.recordClassIndex(14197);
    }

    public a() {
        super("blank");
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        f.a(jSONObject, "effective_percentage", Float.valueOf(this.f24091b));
        f.a(jSONObject, "view_height", this.f24092c);
        f.a(jSONObject, "view_width", this.f24093d);
        f.a(jSONObject, "view_alpha", this.f24100k);
        f.a(jSONObject, "element_count", this.f24101l);
        f.a(jSONObject, "collect_time", this.f24095f);
        f.a(jSONObject, "calculate_time", this.f24096g);
        f.a(jSONObject, "cost_time", this.f24094e);
        f.a(jSONObject, "detect_type", this.f24097h);
        f.a(jSONObject, "enter_page_time", this.f24098i);
        f.a(jSONObject, "detect_start_time", this.f24099j);
    }
}
