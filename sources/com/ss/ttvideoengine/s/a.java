package com.ss.ttvideoengine.s;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.net.URL;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(101774);
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("url");
            if (!TextUtils.isEmpty(optString)) {
                String host = new URL(optString).getHost();
                if (!TextUtils.isEmpty(host)) {
                    jSONObject.put("host", host);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
