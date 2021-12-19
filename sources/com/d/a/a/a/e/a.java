package com.d.a.a.a.e;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(28325);
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        b.a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        b.a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
