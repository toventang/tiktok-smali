package com.bytedance.android.monitorV2.lynx.c.b;

import com.bytedance.android.monitorV2.d.i;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import h.f.b.l;
import org.json.JSONObject;

public final class b extends i {

    /* renamed from: k  reason: collision with root package name */
    public int f24102k;

    /* renamed from: l  reason: collision with root package name */
    public String f24103l = "";

    /* renamed from: m  reason: collision with root package name */
    public String f24104m;

    static {
        Covode.recordClassIndex(14198);
    }

    public b() {
        l.a((Object) LynxEnv.b(), "");
        this.f24104m = LynxEnv.g();
        this.f23904c = "lynx";
    }

    @Override // com.bytedance.android.monitorV2.d.i, com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        f.a(jSONObject, "template_state", this.f24102k);
        f.a(jSONObject, "lynx_version", this.f24104m);
        f.a(jSONObject, "page_version", this.f24103l);
    }
}
