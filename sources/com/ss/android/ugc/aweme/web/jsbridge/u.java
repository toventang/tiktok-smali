package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.account.b;
import org.json.JSONObject;

public final class u implements d {
    static {
        Covode.recordClassIndex(94843);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        String str = "h5";
        if (!(hVar == null || hVar.f35533d == null)) {
            str = hVar.f35533d.optString("logout_from", str);
        }
        b.b().logout(str, "user_logout");
    }
}
