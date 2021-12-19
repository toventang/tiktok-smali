package com.bytedance.ies.xbridge.k.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.k.a.b;
import com.bytedance.ies.xbridge.k.c.c;
import com.bytedance.ies.xbridge.k.c.d;
import h.f.b.l;

public final class b extends com.bytedance.ies.xbridge.k.a.b {
    static {
        Covode.recordClassIndex(21647);
    }

    public static final class a implements IHostOpenDepend.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f36217a;

        static {
            Covode.recordClassIndex(21648);
        }

        a(b.a aVar) {
            this.f36217a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.c
        public final void b(String str) {
            l.c(str, "");
            this.f36217a.a(str);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.c
        public final void a(String str) {
            l.c(str, "");
            b.a aVar = this.f36217a;
            d dVar = new d();
            if (str.length() == 0) {
                str = "";
            }
            dVar.f36229a = str;
            aVar.a(dVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.k.a.b
    public final void a(c cVar, b.a aVar, e eVar) {
        IHostOpenDepend iHostOpenDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2;
        l.c(cVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        boolean z = cVar.f36227a;
        com.bytedance.ies.xbridge.model.b.c cVar2 = this.f35883d;
        if ((cVar2 == null || (bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) cVar2.a(com.bytedance.ies.xbridge.base.runtime.depend.b.class)) == null || (iHostOpenDepend = bVar2.f35875d) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostOpenDepend = bVar.f35875d) == null)) {
            aVar.a("openDepend not implemented in host");
        } else {
            iHostOpenDepend.scanCode(this.f35883d, z, new a(aVar));
        }
    }
}
