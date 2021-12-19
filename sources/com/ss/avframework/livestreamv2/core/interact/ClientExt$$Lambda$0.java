package com.ss.avframework.livestreamv2.core.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService;
import org.json.JSONObject;

final /* synthetic */ class ClientExt$$Lambda$0 implements InteractLogService.LogCallback {
    private final ClientExt arg$1;

    static {
        Covode.recordClassIndex(100134);
    }

    ClientExt$$Lambda$0(ClientExt clientExt) {
        this.arg$1 = clientExt;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.InteractLogService.LogCallback
    public final void onLogReport(String str, JSONObject jSONObject) {
        this.arg$1.onLogMonitor(str, jSONObject);
    }
}
