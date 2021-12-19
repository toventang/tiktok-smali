package com.bytedance.ies.xbridge.g.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.a;
import com.bytedance.ies.xbridge.base.runtime.a.c;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.g.a.b;
import com.bytedance.ies.xbridge.g.c.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class b extends com.bytedance.ies.xbridge.g.a.b {
    static {
        Covode.recordClassIndex(21524);
    }

    private static Map<String, Object> a(List<com.bytedance.ies.xbridge.base.runtime.a.b> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : list) {
            linkedHashMap.put(t.f35784a, t.f35785b);
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.ies.xbridge.g.a.b
    public final void a(com.bytedance.ies.xbridge.g.c.b bVar, b.a aVar, e eVar) {
        IHostContextDepend iHostContextDepend;
        List<com.bytedance.ies.xbridge.base.runtime.a.b> settings;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        List<b.C0832b> list = bVar.f35999a;
        if (list == null) {
            l.a("keys");
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : list) {
            String str = t.f36001b;
            String str2 = t.f36000a;
            c a2 = c.a.a(t.f36002c);
            if (str.length() > 0 && a2 != c.UNSUPPORTED) {
                a aVar2 = new a(str, a2);
                l.c(str2, "");
                aVar2.f35781a = str2;
                arrayList.add(aVar2);
                linkedHashSet.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.a(-3, "empty key or unsupported key type in params");
        } else if (linkedHashSet.size() < arrayList.size()) {
            aVar.a(-3, "duplicate keys in params");
        } else {
            com.bytedance.ies.xbridge.base.runtime.depend.b bVar3 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
            if (((bVar3 == null || (iHostContextDepend = bVar3.f35876e) == null) && ((bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostContextDepend = bVar2.f35876e) == null)) || (settings = iHostContextDepend.getSettings(arrayList)) == null) {
                aVar.a(0, "getSettings not implemented in host");
                return;
            }
            com.bytedance.ies.xbridge.g.c.c cVar = new com.bytedance.ies.xbridge.g.c.c();
            cVar.f36004a = a(settings);
            aVar.a(cVar, "");
        }
    }
}
