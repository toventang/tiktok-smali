package com.ss.android.common.applog;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class u {
    static {
        Covode.recordClassIndex(36639);
    }

    public static long a(JSONObject jSONObject, String str) {
        try {
            return Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
