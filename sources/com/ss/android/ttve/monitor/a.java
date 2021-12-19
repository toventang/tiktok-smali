package com.ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.common.IESAppLogger;
import com.ss.android.vesdk.an;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    static {
        Covode.recordClassIndex(37675);
    }

    public static void a(String str, JSONObject jSONObject, String str2, boolean z) {
        IESAppLogger.sharedInstance().appLogOnEvent(str, jSONObject, str2, z);
        try {
            jSONObject.put("ApiName", str);
            jSONObject.put("ApiParam", jSONObject.toString());
            jSONObject.put("ApiResult", jSONObject.opt("resultCode"));
            IESAppLogger.sharedInstance().appLogOnEvent("vesdk_api", jSONObject, "behavior", z);
        } catch (JSONException e2) {
            an.a(a.class, "JSON error", e2);
        }
    }
}
