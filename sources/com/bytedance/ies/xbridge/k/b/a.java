package com.bytedance.ies.xbridge.k.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.k.a.a;
import com.bytedance.ies.xbridge.k.c.b;
import com.bytedance.ies.xbridge.model.b.c;
import h.f.b.l;

public final class a extends com.bytedance.ies.xbridge.k.a.a {
    static {
        Covode.recordClassIndex(21645);
    }

    /* renamed from: com.bytedance.ies.xbridge.k.b.a$a  reason: collision with other inner class name */
    public static final class C0856a implements IHostOpenDepend.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.AbstractC0854a f36216a;

        static {
            Covode.recordClassIndex(21646);
        }

        C0856a(a.AbstractC0854a aVar) {
            this.f36216a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.b
        public final void a(IHostOpenDepend.a aVar) {
            l.c(aVar, "");
            a.AbstractC0854a aVar2 = this.f36216a;
            b bVar = new b();
            bVar.f36223a = Boolean.valueOf(aVar.f35866c);
            Long l2 = aVar.f35864a;
            if (l2 != null) {
                bVar.f36224b = Long.valueOf(l2.longValue());
            }
            String str = aVar.f35865b;
            if (str != null) {
                bVar.f36225c = str;
            }
            aVar2.a(bVar, "");
        }
    }

    @Override // com.bytedance.ies.xbridge.k.a.a
    public final void a(com.bytedance.ies.xbridge.k.c.a aVar, a.AbstractC0854a aVar2, e eVar) {
        IHostOpenDepend iHostOpenDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2;
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(eVar, "");
        String str = aVar.f36221b;
        if (str == null) {
            l.a("channel");
        }
        String str2 = aVar.f36220a;
        if (str2 == null) {
            l.a("accessKey");
        }
        c cVar = this.f35883d;
        if (((cVar == null || (bVar2 = (com.bytedance.ies.xbridge.base.runtime.depend.b) cVar.a(com.bytedance.ies.xbridge.base.runtime.depend.b.class)) == null || (iHostOpenDepend = bVar2.f35875d) == null) && ((bVar = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostOpenDepend = bVar.f35875d) == null)) || iHostOpenDepend.getGeckoInfo(str2, str, new C0856a(aVar2)) == null) {
            aVar2.a("getGeckoInfo ability is not implemented");
        }
    }
}
