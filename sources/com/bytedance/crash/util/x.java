package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.b;
import com.bytedance.crash.m;
import org.json.JSONException;
import org.json.JSONObject;

public final class x {
    static {
        Covode.recordClassIndex(16406);
    }

    public static void a(b bVar, Header header, CrashType crashType) {
        if (bVar != null) {
            a(bVar.f27557a, header, crashType);
        }
    }

    private static void a(JSONObject jSONObject, Header header, CrashType crashType) {
        if (jSONObject != null && crashType != null) {
            long optLong = jSONObject.optLong("crash_time");
            String a2 = m.b().a();
            if (optLong > 0 && !TextUtils.isEmpty(crashType.getName())) {
                try {
                    String str = "android__" + a2 + "_" + optLong + "_" + crashType;
                    if (header != null) {
                        JSONObject jSONObject2 = header.f27553a;
                        if (jSONObject2 != null) {
                            jSONObject2.put("unique_key", str);
                            return;
                        }
                        return;
                    }
                    jSONObject.put("unique_key", str);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
