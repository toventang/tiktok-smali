package com.ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMonitor {
    static {
        Covode.recordClassIndex(37673);
    }

    void monitorLog(String str, JSONObject jSONObject);
}
