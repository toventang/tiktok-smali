package com.facebook.a.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import com.facebook.internal.b;
import com.facebook.internal.w;
import com.facebook.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<a, String> f46725a = new HashMap<a, String>() {
        /* class com.facebook.a.e.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28472);
        }

        {
            put(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    static {
        Covode.recordClassIndex(28471);
    }

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        static {
            Covode.recordClassIndex(28473);
        }
    }

    public static JSONObject a(a aVar, b bVar, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f46725a.get(aVar));
        String a2 = com.facebook.a.b.a();
        if (a2 != null) {
            jSONObject.put("app_user_id", a2);
        }
        ad.a(jSONObject, bVar, str, z);
        try {
            ad.a(jSONObject, context);
        } catch (Exception e2) {
            w.a(u.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        JSONObject f2 = ad.f();
        if (f2 != null) {
            Iterator<String> keys = f2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, f2.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
