package com.ss.android.ugc.aweme.port.in;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface ap {
    static {
        Covode.recordClassIndex(74535);
    }

    void a(int i2, String str, String str2);

    void a(Exception exc);

    void a(String str);

    void a(String str, int i2, JSONObject jSONObject);

    void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2);

    void a(String str, String str2);

    void a(String str, String str2, float f2);

    void a(String str, String str2, JSONObject jSONObject);

    void a(String str, Map<String, String> map);

    void a(String str, JSONObject jSONObject);

    void a(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void a(Throwable th);

    void a(Throwable th, String str);

    void b(Exception exc);

    void b(String str);

    void b(String str, JSONObject jSONObject);
}
