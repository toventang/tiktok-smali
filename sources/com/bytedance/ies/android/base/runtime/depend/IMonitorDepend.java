package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface IMonitorDepend {
    static {
        Covode.recordClassIndex(18661);
    }

    void ensureNotReachHere(Throwable th, String str, Map<String, String> map);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorStatusAndDuration(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2);

    void monitorStatusRate(String str, int i2, JSONObject jSONObject);
}
