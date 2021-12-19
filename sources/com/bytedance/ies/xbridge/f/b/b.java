package com.bytedance.ies.xbridge.f.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f.a.b;
import com.bytedance.ies.xbridge.model.b.c;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class b extends com.bytedance.ies.xbridge.f.a.b {
    static {
        Covode.recordClassIndex(21504);
    }

    @Override // com.bytedance.ies.xbridge.f.a.b
    public final void a(com.bytedance.ies.xbridge.f.c.b bVar, b.a aVar, e eVar) {
        String str;
        com.bytedance.ies.xbridge.b.b bVar2;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String str2 = bVar.f35967a;
        if (str2 == null) {
            l.a("method");
        }
        c cVar = this.f35883d;
        if (cVar == null || (bVar2 = (com.bytedance.ies.xbridge.b.b) cVar.a(com.bytedance.ies.xbridge.b.b.class)) == null) {
            str = "DEFAULT";
        } else {
            str = bVar2.a();
        }
        Map<String, Class<? extends com.bytedance.ies.xbridge.b>> a2 = a.a(eVar, str);
        if (a2 != null) {
            com.bytedance.ies.xbridge.f.c.c cVar2 = new com.bytedance.ies.xbridge.f.c.c();
            cVar2.f35969a = Boolean.valueOf(a2.containsKey(str2));
            Class<? extends com.bytedance.ies.xbridge.b> cls = a2.get(str2);
            if (cls != null) {
                Class<? extends com.bytedance.ies.xbridge.model.params.a> d2 = ((com.bytedance.ies.xbridge.b) cls.newInstance()).d();
                if (d2 != null) {
                    List<String> provideParamList = ((com.bytedance.ies.xbridge.model.params.a) d2.newInstance()).provideParamList();
                    l.c(provideParamList, "");
                    cVar2.f35970b = provideParamList;
                }
                Class<? extends com.bytedance.ies.xbridge.model.c.a> e2 = ((com.bytedance.ies.xbridge.b) cls.newInstance()).e();
                if (e2 != null) {
                    List<String> a3 = ((com.bytedance.ies.xbridge.model.c.a) e2.newInstance()).a();
                    l.c(a3, "");
                    cVar2.f35971c = a3;
                }
            }
            aVar.a(cVar2, "");
            return;
        }
        com.bytedance.ies.xbridge.f.c.c cVar3 = new com.bytedance.ies.xbridge.f.c.c();
        cVar3.f35969a = false;
        aVar.a(cVar3, "");
    }
}
