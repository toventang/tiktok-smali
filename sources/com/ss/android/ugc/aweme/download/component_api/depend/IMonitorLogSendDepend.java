package com.ss.android.ugc.aweme.download.component_api.depend;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMonitorLogSendDepend {
    static {
        Covode.recordClassIndex(51809);
    }

    void sendMonitorLog(String str, JSONObject jSONObject);
}
