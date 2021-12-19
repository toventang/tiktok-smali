package com.bytedance.im.core.c;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface b {
    static {
        Covode.recordClassIndex(22632);
    }

    void a(Object obj);

    void a(String str, String str2, Map<String, Object> map);

    void a(String str, JSONObject jSONObject);

    void a(Throwable th);

    void a(JSONObject jSONObject);

    void b(String str, JSONObject jSONObject);

    void c(String str, JSONObject jSONObject);

    void d(String str, JSONObject jSONObject);
}
