package com.bytedance.ies.xbridge.m.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.m.a.a;
import com.bytedance.ies.xbridge.model.params.c;
import h.a.n;
import h.f.b.l;
import java.util.Set;

public final class a extends com.bytedance.ies.xbridge.m.a.a {
    static {
        Covode.recordClassIndex(21689);
    }

    @Override // com.bytedance.ies.xbridge.m.a.a
    public final void a(c cVar, a.AbstractC0861a aVar, e eVar) {
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("Context not provided in host");
            return;
        }
        Set<String> a2 = com.bytedance.ies.xbridge.m.d.a.a(context).a();
        com.bytedance.ies.xbridge.m.c.a aVar2 = new com.bytedance.ies.xbridge.m.c.a();
        aVar2.f36268a = n.k(a2);
        aVar.a(aVar2, "");
    }
}
