package com.bytedance.ies.im.core.api.d;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface b {
    static {
        Covode.recordClassIndex(20213);
    }

    void a(String str, String str2);

    void a(String str, String str2, Throwable th);

    void a(String str, String str2, Map<String, ? extends Object> map);

    void a(String str, Throwable th);

    void a(String str, Map<String, String> map);

    void a(String str, JSONObject jSONObject);

    void a(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void a(Throwable th);

    void a(JSONObject jSONObject);

    void b(String str, String str2);

    void b(String str, JSONObject jSONObject);

    void c(String str, String str2);

    void c(String str, JSONObject jSONObject);

    void d(String str, String str2);
}
