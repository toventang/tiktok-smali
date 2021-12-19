package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.ss.android.ugc.aweme.app.n;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class u implements IMonitorDepend {
    static {
        Covode.recordClassIndex(45435);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
        l.d(str, "");
        n.a(str, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        l.d(th, "");
        b.a(th, str, map);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorStatusRate(String str, int i2, JSONObject jSONObject) {
        l.d(str, "");
        com.bytedance.apm.b.a(str, i2, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IMonitorDepend
    public final void monitorStatusAndDuration(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(str, "");
        n.a(str, i2, jSONObject, jSONObject2);
    }
}
