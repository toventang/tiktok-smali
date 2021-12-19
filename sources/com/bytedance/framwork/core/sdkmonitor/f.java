package com.bytedance.framwork.core.sdkmonitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class f {
    static {
        Covode.recordClassIndex(17191);
    }

    public static JSONObject a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }
}
