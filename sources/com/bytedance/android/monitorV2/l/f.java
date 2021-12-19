package com.bytedance.android.monitorV2.l;

import android.text.TextUtils;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    static {
        Covode.recordClassIndex(14162);
    }

    public static JSONObject a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
            return new JSONObject();
        }
    }

    public static int a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    public static long b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optLong(str, 0);
    }

    public static String c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    public static JSONObject d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    public static Object e(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    a(jSONObject3, jSONObject2);
                    return jSONObject3;
                } catch (Throwable unused) {
                    jSONObject = jSONObject3;
                    HybridMultiMonitor.getInstance().getExceptionHandler();
                    return jSONObject;
                }
            } catch (Throwable unused2) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
                return jSONObject;
            }
        } else if (jSONObject2 == null) {
            return jSONObject;
        } else {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject2.opt(next);
                if (opt instanceof JSONObject) {
                    a(jSONObject, next, b(jSONObject.optJSONObject(next), jSONObject2.optJSONObject(next)));
                } else {
                    a(jSONObject, next, opt);
                }
            }
            return jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a(jSONObject, next, e(jSONObject2, next));
                }
            } catch (Exception unused) {
                HybridMultiMonitor.getInstance().getExceptionHandler();
            }
        }
    }

    public static void a(JSONObject jSONObject, String str, int i2) {
        try {
            jSONObject.put(str, i2);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    public static void a(JSONObject jSONObject, String str, long j2) {
        try {
            jSONObject.put(str, j2);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
            HybridMultiMonitor.getInstance().getExceptionHandler();
        }
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, String... strArr) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : strArr) {
            if (!c(jSONObject, str).equals(c(jSONObject2, str))) {
                return false;
            }
        }
        return true;
    }
}
