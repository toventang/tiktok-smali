package com.bytedance.b.k;

import com.bytedance.b.k.b.b;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(15294);
    }

    public static boolean a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    private static JSONObject c(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            }
            return jSONObject2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public static JSONObject b(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof JSONObject) {
                    JSONObject c2 = c((JSONObject) opt);
                    if (c2 != null) {
                        jSONObject2.put(next, c2);
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        jSONArray2.put(jSONArray.get(i2));
                    }
                    jSONObject2.put(next, jSONArray2);
                } else {
                    jSONObject2.put(next, opt);
                }
            }
            return jSONObject2;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    public static String a(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = jSONObject.getString(str);
            jSONObject.remove(str);
            return string;
        } catch (Exception e2) {
            b.a("JsonUtils", "removeString", e2);
            return null;
        }
    }

    public static int b(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            int i2 = jSONObject.getInt(str);
            jSONObject.remove(str);
            return i2;
        } catch (Exception e2) {
            b.a("JsonUtils", "removeInt", e2);
            return 0;
        }
    }

    public static long c(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            long j2 = jSONObject.getLong(str);
            jSONObject.remove(str);
            return j2;
        } catch (Exception e2) {
            b.a("JsonUtils", "removeLong", e2);
            return 0;
        }
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        if (jSONObject == null || jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.isNull(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }
}
