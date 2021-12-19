package com.bytedance.ies.xbridge.d.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a;
import com.bytedance.ies.xbridge.d.a.b;
import com.bytedance.ies.xbridge.d.c.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b extends com.bytedance.ies.xbridge.d.a.b {
    static {
        Covode.recordClassIndex(21453);
    }

    @Override // com.bytedance.ies.xbridge.d.a.b
    public final void a(c cVar, b.a aVar, e eVar) {
        String str;
        com.bytedance.ies.xbridge.b.b bVar;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        com.bytedance.ies.xbridge.d.c.b bVar2 = new com.bytedance.ies.xbridge.d.c.b();
        com.bytedance.ies.xbridge.model.b.c cVar2 = this.f35883d;
        if (cVar2 == null || (bVar = (com.bytedance.ies.xbridge.b.b) cVar2.a(com.bytedance.ies.xbridge.b.b.class)) == null) {
            str = "DEFAULT";
        } else {
            str = bVar.a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Class<? extends com.bytedance.ies.xbridge.b>> a2 = a.a(eVar, str);
        if (a2 != null) {
            for (Map.Entry<String, Class<? extends com.bytedance.ies.xbridge.b>> entry : a2.entrySet()) {
                String key = entry.getKey();
                String value = ((com.bytedance.ies.xbridge.b) entry.getValue().newInstance()).c().getValue();
                b.C0819b bVar3 = new b.C0819b();
                bVar3.f35899a = value;
                linkedHashMap.put(key, bVar3);
            }
        }
        bVar2.f35898a = linkedHashMap;
        aVar.a(bVar2, "");
    }
}
