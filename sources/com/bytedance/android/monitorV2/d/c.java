package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c extends b {
    static {
        Covode.recordClassIndex(14115);
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
    }

    public c() {
        super("containerError");
    }

    @Override // com.bytedance.android.monitorV2.a.b
    public final String toString() {
        return "event_type:" + this.f23824a;
    }
}
