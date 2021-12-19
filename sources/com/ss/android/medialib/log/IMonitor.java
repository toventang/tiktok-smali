package com.ss.android.medialib.log;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMonitor {
    static {
        Covode.recordClassIndex(36896);
    }

    void monitorLog(String str, JSONObject jSONObject);
}
