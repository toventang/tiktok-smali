package com.bytedance.ies.xbridge.n.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n.a.b;
import h.f.b.l;

public final class b extends com.bytedance.ies.xbridge.n.a.b {
    static {
        Covode.recordClassIndex(21756);
    }

    @Override // com.bytedance.ies.xbridge.n.a.b
    public final void a(c cVar, b.a aVar, e eVar) {
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean hideLoading;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (((bVar2 == null || (iHostStyleUIDepend = bVar2.f35877f) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostStyleUIDepend = bVar.f35877f) == null)) || (hideLoading = iHostStyleUIDepend.hideLoading(this.f35883d)) == null) {
            aVar.a("");
            return;
        }
        hideLoading.booleanValue();
        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}
