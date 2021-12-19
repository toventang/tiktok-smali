package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class EventJsonBuilder {
    private HashMap<String, Object> mHashMap = new HashMap<>();

    static {
        Covode.recordClassIndex(95337);
    }

    private static void check(Object obj) {
    }

    public HashMap<String, Object> getHasMap() {
        return this.mHashMap;
    }

    public static EventJsonBuilder newBuilder() {
        return new EventJsonBuilder();
    }

    public synchronized JSONObject build() {
        JSONObject jSONObject;
        MethodCollector.i(1264);
        try {
            jSONObject = new JSONObject(this.mHashMap);
            MethodCollector.o(1264);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(1264);
            return null;
        }
        return jSONObject;
    }

    public static EventJsonBuilder fromJSONObject(JSONObject jSONObject) {
        EventJsonBuilder newBuilder = newBuilder();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    newBuilder.addValuePair(next, jSONObject.getString(next));
                } catch (JSONException unused) {
                }
            }
        }
        return newBuilder;
    }

    public EventJsonBuilder addValuePair(String str, Boolean bool) {
        check(this.mHashMap.put(str, bool));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Double d2) {
        check(this.mHashMap.put(str, d2));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Float f2) {
        check(this.mHashMap.put(str, f2));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Integer num) {
        check(this.mHashMap.put(str, num));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, Long l2) {
        check(this.mHashMap.put(str, l2));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, String str2) {
        check(this.mHashMap.put(str, str2));
        return this;
    }

    public EventJsonBuilder addValuePair(String str, List<String> list) {
        check(this.mHashMap.put(str, list));
        return this;
    }
}
