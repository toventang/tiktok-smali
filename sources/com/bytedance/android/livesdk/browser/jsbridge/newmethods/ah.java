package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.browser.jsbridge.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import org.json.JSONObject;

public final class ah extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8060);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        a.a().a(new c(jSONObject.getLong("gift_id")));
        return null;
    }
}
