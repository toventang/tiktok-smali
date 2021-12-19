package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {
    static {
        Covode.recordClassIndex(16391);
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return a(jSONObject) || a(jSONObject.optJSONArray(str));
    }

    public static JSONArray a(Properties properties) {
        if (properties == null || properties.isEmpty()) {
            return null;
        }
        Set keySet = properties.keySet();
        JSONArray jSONArray = new JSONArray();
        for (Object obj : keySet) {
            jSONArray.put(((String) obj) + ":" + properties.get(obj));
        }
        return jSONArray;
    }

    public static JSONArray b(JSONArray jSONArray) {
        int i2;
        if (jSONArray.length() <= 384) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        int i3 = 0;
        do {
            jSONArray2.put(jSONArray.opt(i3));
            i3++;
            i2 = 256;
        } while (i3 < 256);
        jSONArray2.put("... skip " + ((jSONArray.length() - 128) - 256) + " lines");
        do {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (384 - i2)));
            i2++;
        } while (i2 < 384);
        return jSONArray2;
    }

    public static boolean a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    public static JSONArray a(JSONObject jSONObject, String... strArr) {
        JSONObject c2 = c(jSONObject, strArr);
        if (c2 == null) {
            return null;
        }
        return c2.optJSONArray(strArr[2]);
    }

    public static String b(JSONObject jSONObject, String... strArr) {
        JSONObject c2 = c(jSONObject, strArr);
        if (c2 == null) {
            return null;
        }
        return c2.optString(strArr[strArr.length - 1]);
    }

    public static JSONObject c(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            v.a("err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i2 = 0; i2 < strArr.length - 1; i2++) {
            jSONObject = jSONObject.optJSONObject(strArr[i2]);
            if (jSONObject == null) {
                v.a("JSONUtil", "err get json: not found node:" + strArr[i2]);
                return null;
            }
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    public static boolean a(JSONArray jSONArray, String str) {
        if (a(jSONArray)) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object opt = jSONArray.opt(i2);
            if (!(opt instanceof String)) {
                break;
            } else if (((String) opt).contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static int a(JSONObject jSONObject, int i2, String... strArr) {
        JSONObject c2 = c(jSONObject, strArr);
        if (c2 == null) {
            return i2;
        }
        return c2.optInt(strArr[strArr.length - 1], i2);
    }

    public static JSONObject a(JSONObject jSONObject, String str, Object obj) {
        if (!(jSONObject == null || obj == null || TextUtils.isEmpty(str))) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
