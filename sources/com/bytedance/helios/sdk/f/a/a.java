package com.bytedance.helios.sdk.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.config.ApiInfo;
import com.bytedance.helios.sdk.utils.f;
import h.f.b.l;

public final class a implements b {
    static {
        Covode.recordClassIndex(17960);
    }

    @Override // com.bytedance.helios.sdk.f.a.b
    public final boolean a(n nVar, ApiInfo apiInfo) {
        l.c(nVar, "");
        l.c(apiInfo, "");
        if (nVar.f30679h || (nVar.t == 1 && (!l.a((Object) nVar.f30680i, (Object) com.bytedance.helios.sdk.d.n.f30907d[0])))) {
            nVar.u.add("background");
            f.a("Helios-Control-Api", "BackgroundCondition id=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
        }
        return nVar.f30679h;
    }
}
