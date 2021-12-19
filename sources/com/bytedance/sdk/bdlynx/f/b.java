package com.bytedance.sdk.bdlynx.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f43768a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(26773);
    }

    private final List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        try {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                if ((jSONArray.get(i2) instanceof Float) || (jSONArray.get(i2) instanceof Double)) {
                    arrayList.add(jSONArray.get(i2));
                } else if (jSONArray.get(i2) instanceof Number) {
                    arrayList.add(jSONArray.get(i2));
                } else if (jSONArray.get(i2) instanceof String) {
                    arrayList.add(jSONArray.get(i2));
                } else if (jSONArray.get(i2) instanceof Boolean) {
                    arrayList.add(jSONArray.get(i2));
                } else if (jSONArray.get(i2) instanceof JSONObject) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    l.a((Object) jSONObject, "");
                    arrayList.add(a(jSONObject));
                } else if (jSONArray.get(i2) instanceof JSONArray) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                    l.a((Object) jSONArray2, "");
                    arrayList.add(a(jSONArray2));
                } else {
                    arrayList.add(null);
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public final Map<String, Object> a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if ((jSONObject.get(next) instanceof Float) || (jSONObject.get(next) instanceof Double)) {
                    l.a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof Number) {
                    l.a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof String) {
                    l.a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof Boolean) {
                    l.a((Object) next, "");
                    linkedHashMap.put(next, jSONObject.get(next));
                } else if (jSONObject.get(next) instanceof JSONObject) {
                    l.a((Object) next, "");
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    l.a((Object) jSONObject2, "");
                    linkedHashMap.put(next, a(jSONObject2));
                } else if (jSONObject.get(next) instanceof JSONArray) {
                    l.a((Object) next, "");
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    l.a((Object) jSONArray, "");
                    linkedHashMap.put(next, a(jSONArray));
                } else {
                    l.a((Object) next, "");
                    linkedHashMap.put(next, null);
                }
            }
        } catch (Throwable unused) {
        }
        return linkedHashMap;
    }
}
