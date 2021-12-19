package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.a.c;
import com.google.firebase.a.d;
import com.google.firebase.a.e;

public final class r implements d<h> {
    static {
        Covode.recordClassIndex(30883);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.google.firebase.a.b
    public final void a(Object obj, e eVar) {
        h hVar = (h) obj;
        e eVar2 = eVar;
        eVar2.a("requestTimeMs", hVar.f49342a).a("requestUptimeMs", hVar.f49343b);
        if (hVar.f49344c != null) {
            eVar2.a("clientInfo", hVar.f49344c);
        }
        if (hVar.f49346e != null) {
            eVar2.a("logSourceName", hVar.f49346e);
        } else if (hVar.f49345d != Integer.MIN_VALUE) {
            eVar2.a("logSource", hVar.f49345d);
        } else {
            throw new c("Log request must have either LogSourceName or LogSource");
        }
        if (!hVar.f49347f.isEmpty()) {
            eVar2.a("logEvent", hVar.f49347f);
        }
    }
}
