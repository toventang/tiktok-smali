package com.bytedance.ies.xbridge.d.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.d.a.a;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import h.f.b.l;

public final class a extends com.bytedance.ies.xbridge.d.a.a {
    static {
        Covode.recordClassIndex(21452);
    }

    @Override // com.bytedance.ies.xbridge.d.a.a
    public final void a(c cVar, a.AbstractC0816a aVar, e eVar) {
        IHostContextDepend iHostContextDepend;
        b bVar;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        b bVar2 = (b) a(b.class);
        if ((bVar2 == null || (iHostContextDepend = bVar2.f35876e) == null) && ((bVar = b.f35870l) == null || (iHostContextDepend = bVar.f35876e) == null)) {
            aVar.a("hostContextDepend not implemented");
        } else if (iHostContextDepend.isDebuggable()) {
            com.bytedance.ies.xbridge.d.c.a aVar2 = new com.bytedance.ies.xbridge.d.c.a();
            aVar2.f35893a = Boolean.valueOf(iHostContextDepend.isBoeEnable());
            aVar2.f35895c = Boolean.valueOf(iHostContextDepend.isPPEEnable());
            aVar2.f35894b = iHostContextDepend.getBoeChannel();
            aVar2.f35896d = iHostContextDepend.getPPEChannel();
            aVar.a(aVar2, "");
        } else {
            aVar.a("x.getDebugInfo is not allowed in non-debuggable env");
        }
    }
}
