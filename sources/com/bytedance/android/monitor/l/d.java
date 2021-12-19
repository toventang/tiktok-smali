package com.bytedance.android.monitor.l;

import android.text.TextUtils;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(13979);
    }

    public static JSONObject a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
            return new JSONObject();
        }
    }

    public static int a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    public static String b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    public static JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    public static Object d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a(jSONObject, next, d(jSONObject2, next));
                }
            } catch (Exception unused) {
                HybridMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    public static void a(JSONObject jSONObject, String str, int i2) {
        try {
            jSONObject.put(str, i2);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    public static void a(JSONObject jSONObject, String str, long j2) {
        try {
            jSONObject.put(str, j2);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
            HybridMonitor.getInstance().getExceptionHandler();
        }
    }

    public static boolean a(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null) {
            return bool.booleanValue();
        }
        return jSONObject.optBoolean(str, bool.booleanValue());
    }
}
