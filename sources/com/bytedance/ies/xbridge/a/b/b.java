package com.bytedance.ies.xbridge.a.b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a.a.b;
import com.bytedance.ies.xbridge.a.c.c;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class b extends com.bytedance.ies.xbridge.a.a.b {
    static {
        Covode.recordClassIndex(21337);
    }

    public static final class a implements IHostUserDepend.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IHostUserDepend f35740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.a f35741b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.a.c.b f35742c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Activity f35743d;

        static {
            Covode.recordClassIndex(21338);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend.a
        public final void b() {
            b.a aVar = this.f35741b;
            c cVar = new c();
            cVar.f35761a = "cancelled";
            aVar.a(cVar, "");
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend.a
        public final void a() {
            if (this.f35740a.hasLogin()) {
                b.a aVar = this.f35741b;
                c cVar = new c();
                cVar.f35761a = "loggedIn";
                aVar.a(cVar, "");
                return;
            }
            b.a aVar2 = this.f35741b;
            c cVar2 = new c();
            cVar2.f35761a = "cancelled";
            aVar2.a(cVar2, "");
        }

        a(IHostUserDepend iHostUserDepend, b.a aVar, com.bytedance.ies.xbridge.a.c.b bVar, Activity activity) {
            this.f35740a = iHostUserDepend;
            this.f35741b = aVar;
            this.f35742c = bVar;
            this.f35743d = activity;
        }
    }

    @Override // com.bytedance.ies.xbridge.a.a.b
    public final void a(com.bytedance.ies.xbridge.a.c.b bVar, b.a aVar, e eVar) {
        IHostUserDepend iHostUserDepend;
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar2;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a("context is null");
            return;
        }
        Activity a2 = com.bytedance.ies.xbridge.o.a.a(context);
        if (a2 == null) {
            aVar.a("context can not convert to activity");
            return;
        }
        com.bytedance.ies.xbridge.base.runtime.depend.b bVar3 = (com.bytedance.ies.xbridge.base.runtime.depend.b) a(com.bytedance.ies.xbridge.base.runtime.depend.b.class);
        if ((bVar3 == null || (iHostUserDepend = bVar3.f35879h) == null) && ((bVar2 = com.bytedance.ies.xbridge.base.runtime.depend.b.f35870l) == null || (iHostUserDepend = bVar2.f35879h) == null)) {
            aVar.a("hostUserDepend is null");
        } else if (iHostUserDepend.hasLogin()) {
            c cVar = new c();
            cVar.f35761a = "loggedIn";
            aVar.a(cVar, "");
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            n nVar = bVar.f35759a;
            if (nVar != null) {
                com.bytedance.ies.xbridge.l a3 = nVar.a();
                while (a3.a()) {
                    String b2 = a3.b();
                    k i2 = nVar.i(b2);
                    int i3 = c.f35744a[i2.a().ordinal()];
                    if (i3 == 1) {
                        linkedHashMap.put(b2, String.valueOf(i2.d()));
                    } else if (i3 == 2) {
                        linkedHashMap.put(b2, String.valueOf(i2.c()));
                    } else if (i3 == 3) {
                        linkedHashMap.put(b2, i2.e());
                    } else if (i3 == 4) {
                        linkedHashMap.put(b2, String.valueOf(i2.b()));
                    }
                }
            }
            iHostUserDepend.login(a2, new a(iHostUserDepend, aVar, bVar, a2), linkedHashMap);
        }
    }
}
