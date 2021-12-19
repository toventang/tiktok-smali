package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.ugc.effectplatform.i.a;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class KNMonitorService implements a {
    private final IMonitorService iMonitorService;

    static {
        Covode.recordClassIndex(95551);
    }

    public KNMonitorService(IMonitorService iMonitorService2) {
        l.c(iMonitorService2, "");
        this.iMonitorService = iMonitorService2;
    }

    @Override // com.ss.ugc.effectplatform.i.a
    public final void monitorStatusRate(String str, int i2, Map<String, ? extends Object> map) {
        l.c(str, "");
        l.c(map, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        this.iMonitorService.monitorStatusRate(str, i2, jSONObject);
    }
}
