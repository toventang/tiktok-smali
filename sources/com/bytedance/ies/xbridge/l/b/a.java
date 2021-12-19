package com.bytedance.ies.xbridge.l.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.l.a.a;
import h.f.b.l;

public final class a extends com.bytedance.ies.xbridge.l.a.a {
    static {
        Covode.recordClassIndex(21670);
    }

    @Override // com.bytedance.ies.xbridge.l.a.a
    public final void a(com.bytedance.ies.xbridge.l.c.a aVar, a.AbstractC0858a aVar2, e eVar) {
        IHostRouterDepend iHostRouterDepend;
        b bVar;
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(eVar, "");
        String str = aVar.f36244a;
        boolean z = aVar.f36245b;
        b bVar2 = (b) a(b.class);
        if (!((bVar2 == null || (iHostRouterDepend = bVar2.f35878g) == null) && ((bVar = b.f35870l) == null || (iHostRouterDepend = bVar.f35878g) == null))) {
            iHostRouterDepend.closeView(this.f35883d, eVar, str, z);
        }
        aVar2.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}
