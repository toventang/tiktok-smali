package com.bytedance.android.ecommerce.k;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(3432);
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Throwable unused) {
        }
    }
}
