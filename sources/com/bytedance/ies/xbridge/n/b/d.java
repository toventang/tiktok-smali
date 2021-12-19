package com.bytedance.ies.xbridge.n.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n.a.d;
import h.f.b.l;

public final class d extends com.bytedance.ies.xbridge.n.a.d {
    static {
        Covode.recordClassIndex(21759);
    }

    @Override // com.bytedance.ies.xbridge.n.a.d
    public final void a(c cVar, d.a aVar, e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean showLoading;
        b bVar;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        b bVar2 = (b) a(b.class);
        if (((bVar2 == null || (iHostStyleUIDepend = bVar2.f35877f) == null) && ((bVar = b.f35870l) == null || (iHostStyleUIDepend = bVar.f35877f) == null)) || (showLoading = iHostStyleUIDepend.showLoading(this.f35883d)) == null) {
            aVar.a("");
            return;
        }
        showLoading.booleanValue();
        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}
