package com.bytedance.android.livesdk.browser.jsbridge.d;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.gift.d.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import org.json.JSONObject;

public final class g implements d {
    static {
        Covode.recordClassIndex(8025);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        String str;
        JSONObject optJSONObject = hVar.f35533d.optJSONObject("args");
        if (optJSONObject != null) {
            str = optJSONObject.optString("charge_reason");
        } else {
            str = "";
        }
        i iVar = new i();
        iVar.f17855a = str;
        a.a().a(iVar);
        jSONObject.put("code", 1);
    }
}
