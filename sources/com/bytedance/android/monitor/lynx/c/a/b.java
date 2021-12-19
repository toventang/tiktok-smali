package com.bytedance.android.monitor.lynx.c.a;

import com.bytedance.android.monitor.d.i;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import h.f.b.l;
import org.json.JSONObject;

public final class b extends i {

    /* renamed from: l  reason: collision with root package name */
    public int f23621l;

    /* renamed from: m  reason: collision with root package name */
    public String f23622m = "";

    static {
        Covode.recordClassIndex(14014);
    }

    public b() {
        this.f23492c = "lynx";
    }

    @Override // com.bytedance.android.monitor.d.i, com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        d.a(jSONObject, "template_state", this.f23621l);
        l.a((Object) LynxEnv.b(), "");
        d.a(jSONObject, "lynx_version", LynxEnv.g());
        d.a(jSONObject, "page_version", this.f23622m);
    }
}
