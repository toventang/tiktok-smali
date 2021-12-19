package com.bytedance.im.core.c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface c {
    static {
        Covode.recordClassIndex(22633);
    }

    void a(String str, String str2, Throwable th);

    void a(String str, JSONObject jSONObject);

    void b(String str, String str2, Throwable th);
}
