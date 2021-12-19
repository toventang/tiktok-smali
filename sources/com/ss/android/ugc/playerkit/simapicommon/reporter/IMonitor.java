package com.ss.android.ugc.playerkit.simapicommon.reporter;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMonitor {
    static {
        Covode.recordClassIndex(98039);
    }

    void ensureNotReachHere(Throwable th);

    void ensureNotReachHere(Throwable th, String str);

    void monitorCommonLog(String str, String str2, JSONObject jSONObject);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatusRate(String str, int i2, JSONObject jSONObject);
}
