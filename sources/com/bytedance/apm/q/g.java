package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class g {
    static {
        Covode.recordClassIndex(14704);
    }

    public static boolean b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    public static JSONObject c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public static JSONObject d(JSONObject jSONObject) {
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

    public static JSONObject a(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }

    public static int a(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject a2 = a(jSONObject, str, str2);
        if (a2 == null) {
            return 0;
        }
        return a2.optInt(str3, 0);
    }
}
