package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ar {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Object> f124961a = new HashMap<>();

    static {
        Covode.recordClassIndex(82096);
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        MethodCollector.i(12084);
        try {
            jSONObject = new JSONObject(this.f124961a);
            MethodCollector.o(12084);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(12084);
            return null;
        }
        return jSONObject;
    }

    public static ar a(JSONObject jSONObject) {
        ar arVar = new ar();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                arVar.a(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return arVar;
    }

    public final ar a(Map<String, String> map) {
        this.f124961a.putAll(map);
        return this;
    }

    public final ar a(String str, Boolean bool) {
        this.f124961a.put(str, bool);
        return this;
    }

    public final ar a(String str, Float f2) {
        this.f124961a.put(str, f2);
        return this;
    }

    public final ar a(String str, Integer num) {
        this.f124961a.put(str, num);
        return this;
    }

    public final ar a(String str, Long l2) {
        this.f124961a.put(str, l2);
        return this;
    }

    public final ar a(String str, String str2) {
        this.f124961a.put(str, str2);
        return this;
    }
}
