package com.bytedance.android.live.core.d;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    static {
        Covode.recordClassIndex(4572);
    }

    public static void a(JSONObject jSONObject, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
    }

    public static void a(JSONObject jSONObject, String str, double d2) {
        try {
            jSONObject.put(str, d2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.b("BaseMonitor", "", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, float f2) {
        try {
            jSONObject.put(str, (double) f2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.b("BaseMonitor", "", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, long j2) {
        try {
            jSONObject.put(str, j2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.b("BaseMonitor", "", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.b("BaseMonitor", "", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.b("BaseMonitor", "", e2);
        }
    }
}
