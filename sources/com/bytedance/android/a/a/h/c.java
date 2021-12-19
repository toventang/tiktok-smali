package com.bytedance.android.a.a.h;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(3206);
    }

    public static IllegalArgumentException a(String str) {
        return new IllegalArgumentException(str);
    }

    public static JSONObject a(Throwable th, JSONObject jSONObject) {
        if (th == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("err", th.getMessage());
            jSONObject.put("err_type", th.getClass().getSimpleName());
            Throwable cause = th.getCause();
            if (cause != null) {
                while (true) {
                    Throwable cause2 = cause.getCause();
                    if (cause2 == null) {
                        break;
                    }
                    cause = cause2;
                }
                jSONObject.put("err_inner", cause.getMessage());
                jSONObject.put("err_type_inner", cause.getClass().getSimpleName());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
