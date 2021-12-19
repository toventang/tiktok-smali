package com.bytedance.apm.a;

import com.bytedance.apm.c;
import com.bytedance.apm.q.r;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(14303);
    }

    public static void a(String str) {
        if (c.e()) {
            String[] strArr = new String[2];
        }
    }

    public static JSONObject a(boolean z, int i2, Exception exc, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("success", z);
            jSONObject.put("code", i2);
            if (exc != null) {
                jSONObject.put("exception", exc.getMessage() + r.b(exc));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
