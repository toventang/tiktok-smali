package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import org.json.JSONObject;

public final class af extends f<Object, JSONObject> {
    static {
        Covode.recordClassIndex(8055);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(Object obj, g gVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_teen_mode", ((IHostContext) a.a(IHostContext.class)).isNeedProtectMinor());
        return jSONObject;
    }
}
