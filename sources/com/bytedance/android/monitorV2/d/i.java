package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.a.a;
import com.bytedance.android.monitorV2.h.a.a;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.android.monitorV2.l.g;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class i extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f23902a;

    /* renamed from: b  reason: collision with root package name */
    public String f23903b = g.a();

    /* renamed from: c  reason: collision with root package name */
    public String f23904c = null;

    /* renamed from: d  reason: collision with root package name */
    public long f23905d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f23906e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f23907f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f23908g = new JSONObject();

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f23909h;

    /* renamed from: i  reason: collision with root package name */
    public long f23910i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f23911j;

    static {
        Covode.recordClassIndex(14122);
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public void a(JSONObject jSONObject) {
        f.a(jSONObject, "navigation_id", this.f23903b);
        f.a(jSONObject, "url", this.f23902a);
        f.a(jSONObject, "container_type", this.f23904c);
        f.a(jSONObject, "click_start", this.f23905d);
        f.a(jSONObject, "sdk_version", "1.2.0-alpha.4");
        f.a(jSONObject, "virtual_aid", this.f23906e);
        f.a(jSONObject, "context", this.f23907f);
        f.a(jSONObject, "sdk_version", "1.2.0-alpha.4");
        f.a(jSONObject, "bid_info", this.f23909h);
        f.a(jSONObject, "debug_context", this.f23908g);
        long j2 = this.f23910i;
        if (j2 != 0) {
            f.a(jSONObject, "container_init_ts", j2);
        }
        Boolean bool = this.f23911j;
        if (bool != null) {
            f.a(jSONObject, "container_reuse", bool);
        }
        f.a(this.f23908g, "monitor_package", "monitorV2");
    }

    public final void a(a.C0514a aVar, String str) {
        if (this.f23909h == null) {
            this.f23909h = new JSONObject();
        }
        f.a(this.f23909h, "bid", str);
        f.a(this.f23909h, "setting_bid", aVar.f23925a);
        f.a(this.f23909h, "hit_sample", aVar.f23926b);
        f.a(this.f23909h, "setting_id", aVar.f23927c);
    }
}
