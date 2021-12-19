package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import org.json.JSONObject;

public final class at extends f<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(8078);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        String optString = jSONObject2.optString("schema");
        k kVar = (k) a.a(k.class);
        if (kVar != null) {
            kVar.a(optString, gVar.f35646a);
        }
        return new JSONObject();
    }
}
