package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.d.a.c;
import org.json.JSONObject;

public final class l implements d {
    static {
        Covode.recordClassIndex(94834);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (hVar.f35533d.optInt("submit_result") == 1) {
            c.a(new com.ss.android.ugc.aweme.commercialize.event.c());
        }
    }
}
