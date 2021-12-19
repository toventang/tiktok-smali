package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class ap extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8072);
    }

    private static Object a(JSONObject jSONObject) {
        String optString = jSONObject.optString("json_str");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        boolean tryShowKoiRedPackageInLive = ((IHostAction) a.a(IHostAction.class)).tryShowKoiRedPackageInLive(optString);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", tryShowKoiRedPackageInLive);
            jSONObject2.put("content", optString);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        c.a("ttlive_open_koi_packet", 0, jSONObject2);
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        return a(jSONObject);
    }
}
