package com.bytedance.ies.xbridge.f.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f.a.c;
import com.bytedance.ies.xbridge.f.c.d;
import h.f.b.l;

public final class c extends com.bytedance.ies.xbridge.f.a.c {
    static {
        Covode.recordClassIndex(21505);
    }

    @Override // com.bytedance.ies.xbridge.f.a.c
    public final void a(com.bytedance.ies.xbridge.model.params.c cVar, c.a aVar, e eVar) {
        IHostFrameworkDepend iHostFrameworkDepend;
        String containerID;
        b bVar;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        b bVar2 = (b) a(b.class);
        if (((bVar2 == null || (iHostFrameworkDepend = bVar2.f35872a) == null) && ((bVar = b.f35870l) == null || (iHostFrameworkDepend = bVar.f35872a) == null)) || (containerID = iHostFrameworkDepend.getContainerID(this.f35883d)) == null) {
            aVar.a("getContainerID not implemented in ContainerDepend");
            return;
        }
        d dVar = new d();
        dVar.f35973a = containerID;
        aVar.a(dVar, "");
    }
}
