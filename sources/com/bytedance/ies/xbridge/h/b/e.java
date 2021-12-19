package com.bytedance.ies.xbridge.h.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.a.b;
import com.bytedance.ies.xbridge.h.a.d;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o.c;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends d {
    static {
        Covode.recordClassIndex(21551);
    }

    @Override // com.bytedance.ies.xbridge.h.a.d
    public final void a(com.bytedance.ies.xbridge.h.c.d dVar, d.a aVar, com.bytedance.ies.xbridge.e eVar) {
        l.c(dVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String str = dVar.f36044a;
        if (str == null) {
            l.a("logType");
        }
        String str2 = dVar.f36045b;
        if (str2 == null) {
            l.a("service");
        }
        if (!l.a((Object) "service_monitor", (Object) str) || str2.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", dVar.f36046c);
            n nVar = dVar.f36047d;
            if (nVar == null) {
                l.a("value");
            }
            jSONObject.put("value", c.a(nVar));
            try {
                if (str2.length() > 0) {
                    jSONObject.put("service", str2);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            b.a(str, jSONObject);
            aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
            return;
        }
        aVar.a("service is required while log_type=".concat(String.valueOf(str)));
    }
}
