package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.d.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class am extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8069);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString(StringSet.type);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        optString.hashCode();
        char c2 = 65535;
        switch (optString.hashCode()) {
            case -1853762817:
                if (optString.equals("monitorStatusAndDuration")) {
                    c2 = 0;
                    break;
                }
                break;
            case -858688242:
                if (optString.equals("monitorDuration")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1821543916:
                if (optString.equals("monitorStatus")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                c.a(jSONObject3.optString("service"), jSONObject3.optInt("status"), jSONObject3.optLong("duration"), jSONObject3.optJSONObject("ext_json"));
                return null;
            case 1:
                c.a(jSONObject3.optString("service"), jSONObject3.optLong("duration"), jSONObject3.optJSONObject("ext_json"));
                return null;
            case 2:
                c.a(jSONObject3.optString("service"), jSONObject3.optInt("status"), jSONObject3.optJSONObject("ext_json"));
                return null;
            default:
                return null;
        }
    }
}
