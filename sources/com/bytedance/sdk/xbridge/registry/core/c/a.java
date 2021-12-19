package com.bytedance.sdk.xbridge.registry.core.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44044a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(26905);
    }

    public static List<Object> a(JSONArray jSONArray) {
        l.c(jSONArray, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = jSONArray.opt(i2);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i2)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i2)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i2)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i2));
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                l.a((Object) optJSONObject, "");
                arrayList.add(a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i2);
                l.a((Object) optJSONArray, "");
                arrayList.add(a(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i2)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof Long) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (opt instanceof Double) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (opt instanceof Integer) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (opt instanceof String) {
                l.a((Object) next, "");
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (opt instanceof JSONObject) {
                l.a((Object) next, "");
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                l.a((Object) optJSONObject, "");
                linkedHashMap.put(next, a(optJSONObject));
            } else if (opt instanceof JSONArray) {
                l.a((Object) next, "");
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                l.a((Object) optJSONArray, "");
                linkedHashMap.put(next, a(optJSONArray));
            } else if (opt instanceof Boolean) {
                l.a((Object) next, "");
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                l.a((Object) next, "");
                linkedHashMap.put(next, null);
            }
        }
        return linkedHashMap;
    }
}
