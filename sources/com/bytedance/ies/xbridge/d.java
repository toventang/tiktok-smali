package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.f;
import h.f.b.l;
import h.m.p;

public abstract class d {
    static {
        Covode.recordClassIndex(21445);
    }

    public abstract e a();

    public final void a(String str, n nVar, b.AbstractC0814b bVar, f fVar) {
        b a2;
        l.c(str, "");
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(fVar, "");
        if (p.b(str, "x.", false)) {
            l.c(str, "");
            f.a a3 = fVar.a();
            l.c(str, "");
            c cVar = a3.f35944a.get(str);
            if (cVar != null && (a2 = cVar.a()) != null) {
                a2.a(nVar, bVar, a());
            }
        }
    }
}
