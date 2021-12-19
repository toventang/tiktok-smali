package com.bytedance.ies.xbridge.platform.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b.d;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import org.json.JSONObject;

public final class c implements d {
    static {
        Covode.recordClassIndex(21807);
    }

    @Override // com.bytedance.ies.xbridge.b.d
    public final n a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        return new com.bytedance.ies.xbridge.platform.b.b.d(jSONObject);
    }

    @Override // com.bytedance.ies.xbridge.b.d
    public final boolean a(e eVar) {
        l.c(eVar, "");
        if (eVar == e.WEB) {
            return true;
        }
        return false;
    }
}
