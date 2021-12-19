package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import com.ss.android.ugc.aweme.web.jsbridge.a.b;
import com.ss.android.ugc.aweme.web.jsbridge.a.c;
import org.json.JSONObject;

public final class r implements d {

    /* renamed from: a  reason: collision with root package name */
    private a f145048a;

    /* renamed from: b  reason: collision with root package name */
    private a.c f145049b;

    static {
        Covode.recordClassIndex(94840);
    }

    public r(com.bytedance.ies.web.a.a aVar, a.c cVar) {
        this.f145048a = aVar;
        this.f145049b = cVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        b dVar;
        try {
            hVar.f35538i = false;
            com.bytedance.ies.web.a.a aVar = this.f145048a;
            a.c cVar = this.f145049b;
            String a2 = com.ss.android.ugc.aweme.web.jsbridge.a.a.a(hVar);
            if (a2.hashCode() == 3708 && a2.equals("v2")) {
                dVar = new com.ss.android.ugc.aweme.web.jsbridge.a.d(hVar, jSONObject, aVar, null, cVar);
            } else {
                dVar = new c(hVar, jSONObject, aVar, null, cVar);
            }
            dVar.a();
        } catch (Exception unused) {
        }
    }
}
