package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.monitor.c;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import org.json.JSONObject;

public final class e implements IMonitorService {
    static {
        Covode.recordClassIndex(55999);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorCommonLog(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorDirectOnTimer(String str, String str2, float f2) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorOnTimer(String str, String str2, float f2) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorStatusRate(String str, int i2, JSONObject jSONObject) {
        com.ss.android.ttve.monitor.e.a(str, i2, jSONObject);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public final void monitorStatusAndDuration(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        com.ss.android.ttve.monitor.e.a();
        if (c.a() != null) {
            c.a().a(str, i2, jSONObject, jSONObject2);
        }
    }
}
