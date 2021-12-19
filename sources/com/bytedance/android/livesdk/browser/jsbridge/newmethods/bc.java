package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class bc extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8094);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        b a2;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("eventName");
        JSONObject optJSONObject = jSONObject2.optJSONObject("config");
        boolean z = false;
        if (optJSONObject != null) {
            z = optJSONObject.optBoolean("disable_livesdk", false);
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("params");
        Iterator<String> keys = optJSONObject2.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString2 = optJSONObject2.optString(next);
            keys.remove();
            hashMap.put(next, optString2);
        }
        if (z) {
            a2 = b.a.b(optString);
        } else {
            a2 = b.a.a(optString);
        }
        a2.a().a((Map<String, String>) hashMap).b();
        return null;
    }
}
