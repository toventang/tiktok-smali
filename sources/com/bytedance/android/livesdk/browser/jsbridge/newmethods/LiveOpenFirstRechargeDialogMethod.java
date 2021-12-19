package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.gift.d.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import org.json.JSONObject;

public class LiveOpenFirstRechargeDialogMethod extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8042);
    }

    public Object invoke(JSONObject jSONObject, g gVar) {
        String str;
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject != null) {
            str = optJSONObject.optString("charge_reason");
        } else {
            str = "";
        }
        a.a().a(new d(str));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        return jSONObject2;
    }
}
