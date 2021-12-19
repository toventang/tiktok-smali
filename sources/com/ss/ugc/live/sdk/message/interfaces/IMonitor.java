package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMonitor {
    static {
        Covode.recordClassIndex(102786);
    }

    void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorLatency(String str, long j2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
