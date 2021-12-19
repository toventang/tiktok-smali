package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.t;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class eu {
    static {
        Covode.recordClassIndex(93499);
    }

    public static final d a(d dVar, User user) {
        String socialInfo;
        Set<Map.Entry<String, l>> entrySet;
        h.f.b.l.d(dVar, "");
        if (!(user == null || (socialInfo = user.getSocialInfo()) == null)) {
            try {
                o oVar = (o) dg.a(socialInfo, o.class);
                if (!(oVar == null || (entrySet = oVar.f54898a.entrySet()) == null)) {
                    for (T t : entrySet) {
                        Object value = t.getValue();
                        h.f.b.l.b(value, "");
                        dVar.a("social_info_" + ((String) t.getKey()), ((l) value).c());
                    }
                }
            } catch (t unused) {
            }
        }
        return dVar;
    }

    public static final <T extends c<?>> T a(T t, User user) {
        String socialInfo;
        Set<Map.Entry<String, l>> entrySet;
        h.f.b.l.d(t, "");
        if (!(user == null || (socialInfo = user.getSocialInfo()) == null)) {
            try {
                o oVar = (o) dg.a(socialInfo, o.class);
                if (!(oVar == null || (entrySet = oVar.f54898a.entrySet()) == null)) {
                    for (T t2 : entrySet) {
                        Object value = t2.getValue();
                        h.f.b.l.b(value, "");
                        t.a("social_info_" + ((String) t2.getKey()), ((l) value).c());
                    }
                }
            } catch (t unused) {
            }
        }
        return t;
    }

    public static final JSONObject a(JSONObject jSONObject, String str) {
        Set<Map.Entry<String, l>> entrySet;
        h.f.b.l.d(jSONObject, "");
        if (str != null) {
            try {
                o oVar = (o) dg.a(str, o.class);
                if (!(oVar == null || (entrySet = oVar.f54898a.entrySet()) == null)) {
                    for (T t : entrySet) {
                        Object value = t.getValue();
                        h.f.b.l.b(value, "");
                        jSONObject.put("social_info_" + ((String) t.getKey()), ((l) value).c());
                    }
                }
            } catch (t unused) {
            }
        }
        return jSONObject;
    }
}
