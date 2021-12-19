package com.bytedance.android.monitorV2.lynx.c.b;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class f extends b {

    /* renamed from: b  reason: collision with root package name */
    public double f24122b;

    /* renamed from: c  reason: collision with root package name */
    public double f24123c;

    /* renamed from: d  reason: collision with root package name */
    public double f24124d;

    /* renamed from: e  reason: collision with root package name */
    public double f24125e;

    /* renamed from: f  reason: collision with root package name */
    public double f24126f;

    /* renamed from: g  reason: collision with root package name */
    public double f24127g;

    /* renamed from: h  reason: collision with root package name */
    public double f24128h;

    /* renamed from: i  reason: collision with root package name */
    public double f24129i;

    /* renamed from: j  reason: collision with root package name */
    public double f24130j;

    /* renamed from: k  reason: collision with root package name */
    public double f24131k;

    /* renamed from: l  reason: collision with root package name */
    public c f24132l;

    /* renamed from: m  reason: collision with root package name */
    public JSONObject f24133m;
    public int n;
    public long o = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(14203);
    }

    public f() {
        super("performance");
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        com.bytedance.android.monitorV2.l.f.a(jSONObject, this.f24133m);
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "fp", Double.valueOf(this.f24122b));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "fmp", Double.valueOf(this.f24123c));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "tti", Double.valueOf(this.f24124d));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "Layout", Double.valueOf(this.f24125e));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "render_page", Double.valueOf(this.f24131k));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "Diff_root_create", Double.valueOf(this.f24126f));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "Diff_same_root", Double.valueOf(this.f24127g));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "tasm_binary_decode", Double.valueOf(this.f24129i));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "tasm_end_decode_finish_load_template", Double.valueOf(this.f24128h));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "tasm_finish_load_template", Double.valueOf(this.f24130j));
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "state", this.n);
        com.bytedance.android.monitorV2.l.f.a(jSONObject, "report_ts", this.o);
        c cVar = this.f24132l;
        if (cVar != null) {
            cVar.a(jSONObject);
        }
    }
}
