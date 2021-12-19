package com.ss.android.ugc.aweme.crossplatform.c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f78695a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(48858);
    }

    public static void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        String str;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("extra")) != null && (optJSONObject2 = optJSONObject.optJSONObject("client_category")) != null && l.a((Object) optJSONObject2.optString(StringSet.type), (Object) "lynx")) {
            try {
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("client_metric");
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("client_extra");
                if (optJSONObject4 != null) {
                    str = optJSONObject4.optString("event_name");
                } else {
                    str = null;
                }
                d dVar = new d();
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    l.b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (l.a((Object) next, (Object) "trigger")) {
                            dVar.a("trigger_v2", optJSONObject2.optString(next));
                        } else {
                            dVar.a(next, optJSONObject2.optString(next));
                        }
                    }
                }
                if (optJSONObject3 != null) {
                    Iterator<String> keys2 = optJSONObject3.keys();
                    l.b(keys2, "");
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (l.a((Object) next2, (Object) "trigger")) {
                            dVar.a("trigger_v2", optJSONObject3.optLong(next2));
                        } else {
                            dVar.a(next2, optJSONObject3.optLong(next2));
                        }
                    }
                }
                r.a(str, dVar.f66730a);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
