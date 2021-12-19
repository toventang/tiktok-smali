package com.ss.android.ugc.aweme.video.simcommon;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import org.json.JSONObject;

public class SimMonitor implements IMonitor {
    static {
        Covode.recordClassIndex(94069);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th) {
        a.a(th);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void ensureNotReachHere(Throwable th, String str) {
        a.a(th, str);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        n.a(str, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        n.a(str, str2, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorStatusRate(String str, int i2, JSONObject jSONObject) {
        b.a(str, i2, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b.a(str, jSONObject, jSONObject2, jSONObject3);
    }
}
