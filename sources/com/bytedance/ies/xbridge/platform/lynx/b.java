package com.bytedance.ies.xbridge.platform.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b.d;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.platform.lynx.a.g;
import h.f.b.l;
import org.json.JSONObject;

public final class b implements d {
    static {
        Covode.recordClassIndex(21821);
    }

    @Override // com.bytedance.ies.xbridge.b.d
    public final boolean a(e eVar) {
        l.c(eVar, "");
        if (eVar == e.LYNX) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.b.d
    public final n a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        l.c(jSONObject, "");
        return new g(com.bytedance.ies.xbridge.platform.lynx.a.d.a(jSONObject));
    }
}
