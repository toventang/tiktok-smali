package com.ss.android.ugc.aweme.commercialize.download.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.a;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import h.f.b.l;
import org.json.JSONObject;

public final class DownloadMonitorLogSender implements IMonitorLogSendDepend {
    static {
        Covode.recordClassIndex(45446);
    }

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend
    public final void sendMonitorLog(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        a.a(str, jSONObject);
    }
}
