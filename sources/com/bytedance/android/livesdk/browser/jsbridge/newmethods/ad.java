package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import java.util.Map;
import org.json.JSONObject;

public final class ad extends f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(8053);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(Object obj, g gVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Map<String, String> b2 = ((k) a.a(k.class)).b("");
        if (b2 == null) {
            return jSONObject;
        }
        for (Map.Entry<String, String> entry : b2.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("token", jSONObject2);
        return jSONObject;
    }
}
