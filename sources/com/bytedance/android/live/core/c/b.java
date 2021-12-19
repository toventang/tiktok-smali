package com.bytedance.android.live.core.c;

import android.text.TextUtils;
import com.bytedance.android.live.u.g;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {
    static {
        Covode.recordClassIndex(4561);
    }

    /* access modifiers changed from: protected */
    public abstract JSONObject a();

    static JSONObject a(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            g.b(new d(str, str2));
        }
    }

    public static void b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            g.b(new j(str, str2));
        }
    }

    public static void c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            g.b(new e(str, str2));
        }
    }

    public final void b(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            g.b(new l(this, str, map));
        }
    }

    /* access modifiers changed from: package-private */
    public final String c(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        a();
        try {
            jSONObject2.put("tag", str);
            jSONObject2.put("params", a());
            jSONObject2.put("data", jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject2.toString();
    }

    public final void a(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            g.b(new c(this, str, map));
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            g.b(new k(this, str, jSONObject));
        }
    }

    public final void c(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            g.b(new g(this, str, map));
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            g.b(new i(this, str, jSONObject));
        }
    }
}
