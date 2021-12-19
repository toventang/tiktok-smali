package com.bytedance.ies.xbridge.h.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.h.a.c;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class c extends com.bytedance.ies.xbridge.h.a.c {
    static {
        Covode.recordClassIndex(21549);
    }

    @Override // com.bytedance.ies.xbridge.h.a.c
    public final void a(com.bytedance.ies.xbridge.h.c.c cVar, c.a aVar, e eVar) {
        IHostLogDepend iHostLogDepend;
        b bVar;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String str = cVar.f36041a;
        if (str == null) {
            l.a("eventName");
        }
        n nVar = cVar.f36042b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (nVar != null) {
            com.bytedance.ies.xbridge.l a2 = nVar.a();
            while (a2.a()) {
                String b2 = a2.b();
                k i2 = nVar.i(b2);
                switch (d.f36023a[i2.a().ordinal()]) {
                    case 1:
                        linkedHashMap.put(b2, String.valueOf(i2.b()));
                        break;
                    case 2:
                        linkedHashMap.put(b2, String.valueOf(i2.d()));
                        break;
                    case 3:
                        linkedHashMap.put(b2, String.valueOf(i2.c()));
                        break;
                    case 4:
                        linkedHashMap.put(b2, i2.e());
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        n g2 = i2.g();
                        if (g2 == null) {
                            break;
                        } else {
                            String jSONObject = com.bytedance.ies.xbridge.o.c.a(g2).toString();
                            l.a((Object) jSONObject, "");
                            linkedHashMap.put(b2, jSONObject);
                            break;
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        m f2 = i2.f();
                        if (f2 == null) {
                            break;
                        } else {
                            String jSONArray = com.bytedance.ies.xbridge.o.c.a(f2).toString();
                            l.a((Object) jSONArray, "");
                            linkedHashMap.put(b2, jSONArray);
                            break;
                        }
                }
            }
        }
        b bVar2 = (b) a(b.class);
        if (!((bVar2 == null || (iHostLogDepend = bVar2.f35873b) == null) && ((bVar = b.f35870l) == null || (iHostLogDepend = bVar.f35873b) == null))) {
            iHostLogDepend.onEventV3Map(str, linkedHashMap);
        }
        aVar.a(new com.bytedance.ies.xbridge.model.c.b(), "");
    }
}
