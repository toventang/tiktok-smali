package com.bytedance.ies.xbridge.f.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f.a.a;
import com.bytedance.ies.xbridge.f.c.a;
import com.bytedance.ies.xbridge.model.b.c;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.f.a.a {

    /* renamed from: b  reason: collision with root package name */
    private final String f35959b = "invalid Parameter";

    static {
        Covode.recordClassIndex(21502);
    }

    /* renamed from: com.bytedance.ies.xbridge.f.b.a$a  reason: collision with other inner class name */
    public enum EnumC0827a {
        closed;
        
        private final String actionType;

        public final String getActionType() {
            return this.actionType;
        }

        static {
            Covode.recordClassIndex(21503);
        }

        private EnumC0827a() {
            this.actionType = r3;
        }
    }

    @Override // com.bytedance.ies.xbridge.f.a.a
    public final void a(com.bytedance.ies.xbridge.f.c.a aVar, a.AbstractC0824a aVar2, e eVar) {
        IHostFrameworkDepend iHostFrameworkDepend;
        b bVar;
        b bVar2;
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(eVar, "");
        String str = aVar.f35962a;
        if (str == null) {
            l.a("actionType");
        }
        List<a.C0828a> list = aVar.f35963b;
        for (EnumC0827a aVar3 : EnumC0827a.values()) {
            if (l.a((Object) aVar3.getActionType(), (Object) str)) {
                if (list == null || list.isEmpty()) {
                    aVar2.a(this.f35959b);
                    return;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next().f35964a.length() == 0) {
                            aVar2.a(this.f35959b);
                            return;
                        }
                    }
                    c cVar = this.f35883d;
                    if (!((cVar == null || (bVar2 = (b) cVar.a(b.class)) == null || (iHostFrameworkDepend = bVar2.f35872a) == null) && ((bVar = b.f35870l) == null || (iHostFrameworkDepend = bVar.f35872a) == null))) {
                        c cVar2 = this.f35883d;
                        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().f35964a);
                        }
                        ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(n.a((Iterable) list, 10));
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(it3.next().f35965b);
                        }
                        iHostFrameworkDepend.addObserverEvent(cVar2, str, arrayList2, arrayList3);
                    }
                    aVar2.a(new com.bytedance.ies.xbridge.model.c.b(), "");
                    return;
                }
            }
        }
        aVar2.a(this.f35959b);
    }
}
