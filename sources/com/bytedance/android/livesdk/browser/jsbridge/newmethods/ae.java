package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.a;
import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import org.json.JSONObject;

public final class ae extends f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(8054);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(Object obj, g gVar) {
        l.d(obj, "");
        l.d(gVar, "");
        JSONObject jSONObject = new JSONObject();
        a a2 = com.bytedance.android.live.t.a.a(b.class);
        l.b(a2, "");
        jSONObject.put("status", ((b) a2).getLinkStatus4H5());
        jSONObject.put("code", 1);
        return jSONObject;
    }
}
