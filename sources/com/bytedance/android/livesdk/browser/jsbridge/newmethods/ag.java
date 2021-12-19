package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Map;
import org.json.JSONObject;

public final class ag {
    static {
        Covode.recordClassIndex(8056);
    }

    public static SharedPreferences.Editor a(g gVar) {
        return d.a(gVar.f35646a, "js_kv_methods_20191113", 0).edit();
    }

    public static SharedPreferences b(g gVar) {
        return d.a(gVar.f35646a, "js_kv_methods_20191113", 0);
    }

    public static class b extends f<JSONObject, JSONObject> {
        static {
            Covode.recordClassIndex(8058);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
        @Override // com.bytedance.ies.web.jsbridge2.f
        public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
            boolean commit;
            JSONObject jSONObject2 = jSONObject;
            boolean equals = TextUtils.equals(jSONObject2.optString(StringSet.type, ""), "all");
            JSONObject jSONObject3 = new JSONObject();
            if (equals) {
                commit = ag.a(gVar).clear().commit();
            } else {
                commit = ag.a(gVar).remove(jSONObject2.optString("key")).commit();
            }
            int i2 = commit ? 1 : 0;
            int i3 = commit ? 1 : 0;
            int i4 = commit ? 1 : 0;
            jSONObject3.put("code", i2);
            return jSONObject3;
        }
    }

    public static class c extends f<JSONObject, JSONObject> {
        static {
            Covode.recordClassIndex(8059);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
        @Override // com.bytedance.ies.web.jsbridge2.f
        public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
            JSONObject jSONObject2 = jSONObject;
            boolean commit = ag.a(gVar).putString(jSONObject2.optString("key"), jSONObject2.optString("value")).commit();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", commit ? 1 : 0);
            return jSONObject3;
        }
    }

    public static class a extends f<JSONObject, JSONObject> {
        static {
            Covode.recordClassIndex(8057);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
        @Override // com.bytedance.ies.web.jsbridge2.f
        public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
            JSONObject jSONObject2 = jSONObject;
            JSONObject jSONObject3 = new JSONObject();
            if (TextUtils.equals(jSONObject2.optString(StringSet.type, ""), "all")) {
                Map<String, ?> all = ag.b(gVar).getAll();
                JSONObject jSONObject4 = new JSONObject();
                if (all != null && !all.isEmpty()) {
                    for (String str : all.keySet()) {
                        if (str != null) {
                            jSONObject4.put(str.toString(), ag.b(gVar).getString(str.toString(), ""));
                        }
                    }
                }
                jSONObject3.put("value", jSONObject4);
            } else {
                jSONObject3.put("value", ag.b(gVar).getString(jSONObject2.optString("key"), ""));
            }
            jSONObject3.put("code", 1);
            return jSONObject3;
        }
    }
}
