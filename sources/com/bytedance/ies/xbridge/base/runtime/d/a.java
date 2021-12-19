package com.bytedance.ies.xbridge.base.runtime.d;

import com.bytedance.covode.number.Covode;
import h.z;
import java.util.LinkedHashMap;
import org.json.JSONObject;

public interface a {
    static {
        Covode.recordClassIndex(21395);
    }

    z a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, String str, Throwable th, Integer num);

    void a(Integer num, Throwable th);

    void a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, Integer num);
}
