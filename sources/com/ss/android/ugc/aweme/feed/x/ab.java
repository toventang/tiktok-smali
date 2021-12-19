package com.ss.android.ugc.aweme.feed.x;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ab {
    static {
        Covode.recordClassIndex(60361);
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
        return jSONObject;
    }
}
