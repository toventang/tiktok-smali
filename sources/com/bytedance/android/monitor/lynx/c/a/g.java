package com.bytedance.android.monitor.lynx.c.a;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class g extends b {

    /* renamed from: b  reason: collision with root package name */
    public double f23649b;

    /* renamed from: c  reason: collision with root package name */
    public double f23650c;

    /* renamed from: d  reason: collision with root package name */
    public double f23651d;

    /* renamed from: e  reason: collision with root package name */
    public double f23652e;

    /* renamed from: f  reason: collision with root package name */
    public double f23653f;

    /* renamed from: g  reason: collision with root package name */
    public double f23654g;

    /* renamed from: h  reason: collision with root package name */
    public double f23655h;

    /* renamed from: i  reason: collision with root package name */
    public double f23656i;

    /* renamed from: j  reason: collision with root package name */
    public double f23657j;

    /* renamed from: k  reason: collision with root package name */
    public double f23658k;

    /* renamed from: l  reason: collision with root package name */
    public d f23659l;

    /* renamed from: m  reason: collision with root package name */
    public JSONObject f23660m;
    public int n;
    public long o = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(14020);
    }

    public g() {
        super("performance");
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        d.a(jSONObject, this.f23660m);
        d.a(jSONObject, "fp", Double.valueOf(this.f23649b));
        d.a(jSONObject, "fmp", Double.valueOf(this.f23650c));
        d.a(jSONObject, "tti", Double.valueOf(this.f23651d));
        d.a(jSONObject, "Layout", Double.valueOf(this.f23652e));
        d.a(jSONObject, "render_page", Double.valueOf(this.f23658k));
        d.a(jSONObject, "Diff_root_create", Double.valueOf(this.f23653f));
        d.a(jSONObject, "Diff_same_root", Double.valueOf(this.f23654g));
        d.a(jSONObject, "tasm_binary_decode", Double.valueOf(this.f23656i));
        d.a(jSONObject, "tasm_end_decode_finish_load_template", Double.valueOf(this.f23655h));
        d.a(jSONObject, "tasm_finish_load_template", Double.valueOf(this.f23657j));
        d.a(jSONObject, "state", this.n);
        d.a(jSONObject, "report_ts", this.o);
        d dVar = this.f23659l;
        if (dVar != null) {
            dVar.a(jSONObject);
        }
    }
}
