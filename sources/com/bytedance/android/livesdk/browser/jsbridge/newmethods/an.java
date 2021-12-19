package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class an extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8070);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString(StringSet.type);
        JSONObject optJSONObject = jSONObject2.optJSONObject("args");
        optString.hashCode();
        if (!optString.equals("recharge") || !TextUtils.equals(optJSONObject.optString("status"), "1")) {
            return null;
        }
        a.a().a(new k(1, true));
        return null;
    }
}
