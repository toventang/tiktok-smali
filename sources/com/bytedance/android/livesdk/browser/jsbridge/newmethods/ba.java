package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.ss.android.ugc.aweme.bf.d;
import org.json.JSONObject;

public final class ba extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8091);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        SharedPreferences a2;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("key");
        String optString2 = jSONObject2.optString("data");
        if (gVar.f35646a == null || (a2 = d.a(gVar.f35646a, "webcast_jsb_local_data", 4)) == null) {
            return null;
        }
        a2.edit().putString(optString, optString2).commit();
        return null;
    }
}
