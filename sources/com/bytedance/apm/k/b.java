package com.bytedance.apm.k;

import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(14635);
    }

    public static void a(f fVar) {
        String b2 = g.a().b();
        JSONObject jSONObject = fVar.f24749e;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(b2)) {
                b2 = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put("scene", b2);
            jSONObject.put("process_name", c.a());
            jSONObject.put("is_main_process", c.b());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            fVar.f24749e = jSONObject;
        } catch (JSONException unused) {
        }
    }

    public static void a(f fVar, boolean z) {
        fVar.f24750f = g.a().a(z);
    }

    public static void a(JSONObject jSONObject, String str) {
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", c.b());
        jSONObject.put("process_name", c.a());
        jSONObject.put("event_type", str);
        jSONObject.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
    }
}
