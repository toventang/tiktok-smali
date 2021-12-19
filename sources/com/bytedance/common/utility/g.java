package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class g {
    static {
        Covode.recordClassIndex(15905);
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || m.a(str) || !jSONObject.has(str)) {
            return str2;
        }
        return jSONObject.optString(str, str2);
    }
}
