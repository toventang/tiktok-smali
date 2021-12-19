package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.browser.jsbridge.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import org.json.JSONObject;

public final class az extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8086);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        a.a().a(new d(jSONObject));
        return null;
    }
}
