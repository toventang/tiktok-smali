package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.app.api.l;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;

public final class h extends c {
    static {
        Covode.recordClassIndex(68619);
    }

    public h(c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.lancet.ssretrofitchain.c
    public final c.a a(g gVar, Request request, u uVar) {
        if (gVar.f107267b > 0) {
            l.f66628a = gVar.f107267b;
            l.f66629b = System.currentTimeMillis();
        }
        return b.f107258a;
    }
}
