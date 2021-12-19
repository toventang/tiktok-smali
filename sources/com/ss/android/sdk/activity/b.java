package com.ss.android.sdk.activity;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(37151);
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        if (!m.a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
