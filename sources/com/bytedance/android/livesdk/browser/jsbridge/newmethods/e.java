package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.h;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import java.util.Map;
import org.json.JSONObject;

public final class e extends f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(8146);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(Object obj, g gVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> b2 = h.a().b();
        for (String str : b2.keySet()) {
            String str2 = b2.get(str);
            if (!m.a(str) && !m.a(str2)) {
                jSONObject.put(str, str2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        Map<String, String> b3 = ((k) a.a(k.class)).b("");
        if (b3 != null) {
            for (Map.Entry<String, String> entry : b3.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("tt_token", jSONObject2);
        return jSONObject;
    }
}
