package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.q.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import org.json.JSONObject;

public final class be extends e<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8096);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        int i2 = jSONObject.getInt("status");
        a aVar = new a();
        aVar.f20288a = i2;
        com.bytedance.android.livesdk.an.a.a().a(aVar);
    }
}
