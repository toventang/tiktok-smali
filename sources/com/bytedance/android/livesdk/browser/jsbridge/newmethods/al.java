package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.j.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import org.json.JSONObject;

public final class al extends f<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(8068);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
        boolean z;
        l.d(jSONObject, "");
        l.d(gVar, "");
        JSONObject jSONObject2 = new JSONObject();
        a aVar = (a) com.bytedance.android.live.t.a.a(a.class);
        boolean z2 = false;
        if (aVar != null) {
            z = aVar.isMicAudience();
        } else {
            z = false;
        }
        jSONObject2.put("isLiveHouseAudience", z);
        a aVar2 = (a) com.bytedance.android.live.t.a.a(a.class);
        if (aVar2 != null) {
            z2 = aVar2.isMicRoomForCurrentRoom();
        }
        jSONObject2.put("isInLiveHouseRoom", z2);
        return jSONObject2;
    }
}
