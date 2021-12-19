package com.bytedance.b.i.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(15261);
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.optJSONObject("performance_modules").optJSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
