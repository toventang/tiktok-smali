package com.bytedance.apm.impl;

import com.bytedance.apm.c.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.apm.api.g;
import java.util.List;
import org.json.JSONObject;

public class MonitorLogManagerImpl implements IMonitorLogManager {
    static {
        Covode.recordClassIndex(14609);
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void deleteLegacyLogByIds(String str, String str2) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public void getLegacyLog(long j2, long j3, String str, g gVar) {
    }

    @Override // com.bytedance.services.apm.api.IMonitorLogManager
    public List<JSONObject> getRecentUiActionRecords() {
        return a.a().f24757a.f25194a;
    }
}
