package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class JsonExtKt {
    static {
        Covode.recordClassIndex(95344);
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        l.c(jSONArray, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            l.a(obj, "");
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        l.c(jSONObject, "");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            l.a((Object) next, "");
            l.a(obj, "");
            hashMap.put(next, obj);
        }
        return hashMap;
    }
}
