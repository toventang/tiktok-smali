package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public abstract class AbsMonitorDepend implements IMonitorDepend {
    static {
        Covode.recordClassIndex(18654);
    }

    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        l.c(str, "");
    }
}
