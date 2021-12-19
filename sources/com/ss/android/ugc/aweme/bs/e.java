package com.ss.android.ugc.aweme.bs;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.g.b;
import com.ss.android.ugc.tools.g.c;
import h.f.b.l;
import org.json.JSONObject;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final e f68806a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(42377);
    }

    @Override // com.ss.android.ugc.tools.g.b
    public final void a(c cVar, int i2, JSONObject jSONObject) {
        l.d(cVar, "");
        com.bytedance.apm.b.a(cVar.getServiceName(), i2, jSONObject);
    }
}
