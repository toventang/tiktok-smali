package com.ss.avframework.livestreamv2.utils;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtils {
    static {
        Covode.recordClassIndex(100491);
    }

    public static void mergeJson(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!(jSONObject == null || jSONObject2 == null)) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    Object obj2 = jSONObject.get(next);
                    if ((obj2 instanceof JSONObject) && (obj instanceof JSONObject)) {
                        mergeJson((JSONObject) obj2, (JSONObject) obj);
                    } else if (!(obj2 instanceof JSONArray) || obj == null) {
                        jSONObject.remove(next);
                        jSONObject.put(next, obj);
                    } else {
                        JSONArray jSONArray = (JSONArray) obj2;
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                jSONArray.put(jSONArray2.get(i2));
                            }
                        } else {
                            jSONArray.put(obj);
                        }
                    }
                } else {
                    jSONObject.put(next, obj);
                }
            }
        }
    }
}
