package com.bytedance.android.monitorV2.d;

import com.bytedance.android.monitorV2.a.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class j extends b {

    /* renamed from: b  reason: collision with root package name */
    public long f23912b = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(14123);
    }

    public j() {
        super("navigationStart");
    }

    @Override // com.bytedance.android.monitorV2.a.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        f.a(jSONObject, "invoke_ts", this.f23912b);
    }
}
