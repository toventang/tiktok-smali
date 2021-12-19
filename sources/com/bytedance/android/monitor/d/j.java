package com.bytedance.android.monitor.d;

import com.bytedance.android.monitor.b.b;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class j extends b {

    /* renamed from: b  reason: collision with root package name */
    public long f23501b = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(13956);
    }

    public j() {
        super("navigationStart");
    }

    @Override // com.bytedance.android.monitor.b.a
    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        d.a(jSONObject, "invoke_ts", this.f23501b);
    }
}
