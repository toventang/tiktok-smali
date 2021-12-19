package com.appsflyer;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AFHelper {
    static {
        Covode.recordClassIndex(2647);
    }

    public static JSONObject convertToJsonObject(Map<String, ?> map) {
        int i2 = Build.VERSION.SDK_INT;
        return new JSONObject(map);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static JSONObject m9(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), m8(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Object m8(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Collection) obj) {
                    jSONArray.put(m8(obj2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < length; i2++) {
                    jSONArray2.put(m8(Array.get(obj, i2)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                return m9((Map) obj);
            } else {
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                return obj.toString();
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }
}
