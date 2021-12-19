package com.ss.android.ugc.aweme.fe.a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.common.util.g;
import java.util.Iterator;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(57232);
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    if (com.ss.android.ugc.aweme.activity.a.a(activity, true)) {
                        String optString = jSONObject.optString(StringSet.type);
                        if (!m.a(optString) && optString.indexOf(58) < 0) {
                            g gVar = new g("sslocal://".concat(String.valueOf(optString)));
                            a(jSONObject.optJSONObject("args"), gVar);
                            com.ss.android.newmedia.b.a.b(activity, gVar.a());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void a(JSONObject jSONObject, g gVar) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    gVar.a(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    gVar.a(next, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    gVar.a(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    gVar.a(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    a((JSONObject) obj, gVar);
                }
            }
        }
    }
}
