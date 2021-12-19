package com.bytedance.ies.xbridge.l.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.l.a.b;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Map;

public final class b extends com.bytedance.ies.xbridge.l.a.b {
    static {
        Covode.recordClassIndex(21671);
    }

    private final IHostRouterDepend a() {
        IHostRouterDepend iHostRouterDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if (bVar != null && (iHostRouterDepend = bVar.f35878g) != null) {
            return iHostRouterDepend;
        }
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l;
        if (bVar2 != null) {
            return bVar2.f35878g;
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.l.a.b
    public final void a(com.bytedance.ies.xbridge.l.c.b bVar, b.a aVar, e eVar) {
        IHostRouterDepend a2;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String str = bVar.f36247a;
        if (str == null) {
            l.a("schema");
        }
        boolean z = bVar.f36248b;
        boolean z2 = bVar.f36249c;
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("Context not provided in host");
        }
        Map<String, ? extends Object> a3 = ag.a(v.a("useSysBrowser", Boolean.valueOf(z2)));
        IHostRouterDepend a4 = a();
        if (a4 != null) {
            a4.openSchema(this.f35883d, str, a3, eVar, context);
        }
        if (z && (a2 = a()) != null) {
            a2.closeView(this.f35883d, eVar, null, false);
        }
        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}
