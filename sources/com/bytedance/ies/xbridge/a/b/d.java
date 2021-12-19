package com.bytedance.ies.xbridge.a.b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a.a.c;
import com.bytedance.ies.xbridge.a.c.e;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.b;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class d extends c {
    static {
        Covode.recordClassIndex(21340);
    }

    public static final class a implements IHostUserDepend.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.xbridge.a.c.d f35745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35746b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a f35747c;

        static {
            Covode.recordClassIndex(21341);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend.b
        public final void a() {
            c.a aVar = this.f35747c;
            e eVar = new e();
            eVar.f35765a = "loggedOut";
            aVar.a(eVar, "");
        }

        a(com.bytedance.ies.xbridge.a.c.d dVar, Activity activity, c.a aVar) {
            this.f35745a = dVar;
            this.f35746b = activity;
            this.f35747c = aVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.a.a.c
    public final void a(com.bytedance.ies.xbridge.a.c.d dVar, c.a aVar, com.bytedance.ies.xbridge.e eVar) {
        IHostUserDepend iHostUserDepend;
        b bVar;
        l.c(dVar, "");
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
        b bVar2 = (b) a(b.class);
        if ((bVar2 == null || (iHostUserDepend = bVar2.f35879h) == null) && ((bVar = b.f35870l) == null || (iHostUserDepend = bVar.f35879h) == null)) {
            aVar.a("hostUserDepend is null");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        n nVar = dVar.f35763a;
        if (nVar != null) {
            com.bytedance.ies.xbridge.l a3 = nVar.a();
            while (a3.a()) {
                String b2 = a3.b();
                k i2 = nVar.i(b2);
                int i3 = e.f35748a[i2.a().ordinal()];
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
        iHostUserDepend.logout(a2, new a(dVar, a2, aVar), linkedHashMap);
    }
}
