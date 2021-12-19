package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.utils.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class bd extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8095);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("eventName");
        String optString2 = jSONObject2.optString("labelName");
        JSONObject optJSONObject = jSONObject2.optJSONObject("params");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString3 = optJSONObject.optString(next);
            keys.remove();
            hashMap.put(next, optString3);
        }
        a.a(optString, optString2, hashMap, null);
        return null;
    }
}
