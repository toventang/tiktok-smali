package com.bytedance.android.monitor.d;

import com.bytedance.android.monitor.b.a;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.l.f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class i extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f23490a;

    /* renamed from: b  reason: collision with root package name */
    public String f23491b = f.a();

    /* renamed from: c  reason: collision with root package name */
    public String f23492c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f23493d = null;

    /* renamed from: e  reason: collision with root package name */
    public long f23494e = 0;

    /* renamed from: f  reason: collision with root package name */
    public String f23495f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f23496g;

    /* renamed from: h  reason: collision with root package name */
    public long f23497h;

    /* renamed from: i  reason: collision with root package name */
    public long f23498i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f23499j = 0;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f23500k;

    static {
        Covode.recordClassIndex(13955);
    }

    @Override // com.bytedance.android.monitor.b.a
    public void a(JSONObject jSONObject) {
        d.a(jSONObject, "navigation_id", this.f23491b);
        d.a(jSONObject, "url", this.f23490a);
        d.a(jSONObject, "container_type", this.f23492c);
        d.a(jSONObject, "click_start", this.f23494e);
        d.a(jSONObject, "sdk_version", "1.2.5");
        d.a(jSONObject, "virtual_aid", this.f23495f);
        d.a(jSONObject, "context", this.f23496g);
        d.a(jSONObject, "debug_context", new JSONObject());
        long j2 = this.f23497h;
        if (j2 != 0) {
            d.a(jSONObject, "container_init_ts", j2);
        }
        Boolean bool = this.f23500k;
        if (bool != null) {
            d.a(jSONObject, "container_reuse", (Object) bool);
        }
    }

    public final void a(String str, Object obj) {
        if (this.f23496g == null) {
            this.f23496g = new JSONObject();
        }
        d.a(this.f23496g, str, String.valueOf(obj));
    }
}
