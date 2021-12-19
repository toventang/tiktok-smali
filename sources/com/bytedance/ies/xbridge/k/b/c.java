package com.bytedance.ies.xbridge.k.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.k.a.c;
import com.bytedance.ies.xbridge.k.c.e;
import com.bytedance.ies.xbridge.k.c.f;
import h.f.b.l;

public final class c extends com.bytedance.ies.xbridge.k.a.c {
    static {
        Covode.recordClassIndex(21649);
    }

    public static final class a implements IHostOpenDepend.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f36218a;

        static {
            Covode.recordClassIndex(21650);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.d
        public final void a() {
            c.a aVar = this.f36218a;
            f fVar = new f();
            fVar.f36235a = 1;
            aVar.a(fVar, "needUpdate");
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.d
        public final void b() {
            c.a aVar = this.f36218a;
            f fVar = new f();
            fVar.f36235a = 0;
            aVar.a(fVar, "skipUpdate for local version is already up-to-date");
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend.d
        public final void c() {
            c.a aVar = this.f36218a;
            f fVar = new f();
            fVar.f36235a = 2;
            aVar.a(fVar, "abortUpdate for requested channel is not in lazy channels or doesn't exist with host accesskey");
        }

        a(c.a aVar) {
            this.f36218a = aVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.k.a.c
    public final void a(e eVar, c.a aVar, com.bytedance.ies.xbridge.e eVar2) {
        IHostOpenDepend iHostOpenDepend;
        b bVar;
        b bVar2;
        l.c(eVar, "");
        l.c(aVar, "");
        l.c(eVar2, "");
        String str = eVar.f36231a;
        if (str == null) {
            l.a("channel");
        }
        String str2 = eVar.f36232b;
        if (str2 == null) {
            l.a("accessKey");
        }
        boolean z = eVar.f36233c;
        com.bytedance.ies.xbridge.model.b.c cVar = this.f35883d;
        if (((cVar == null || (bVar2 = (b) cVar.a(b.class)) == null || (iHostOpenDepend = bVar2.f35875d) == null) && ((bVar = b.f35870l) == null || (iHostOpenDepend = bVar.f35875d) == null)) || iHostOpenDepend.updateGecko(str2, str, new a(aVar), z) == null) {
            aVar.a("updateGecko ability is not implemented");
        }
    }
}
