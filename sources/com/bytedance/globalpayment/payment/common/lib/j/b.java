package com.bytedance.globalpayment.payment.common.lib.j;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(17751);
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
}
