package com.bytedance.ies.xbridge.h.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36013a = "x.reportAppLog";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36014b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21540);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21539);
    }

    public abstract void a(com.bytedance.ies.xbridge.h.c.c cVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36013a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36014b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.h.c.c> d() {
        return com.bytedance.ies.xbridge.h.c.c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36016b;

        static {
            Covode.recordClassIndex(21541);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f36015a = cVar;
            this.f36016b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.h.a.c.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            c.a(this.f36016b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "eventName", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        n b2 = i.b(nVar, "params");
        com.bytedance.ies.xbridge.h.c.c cVar = new com.bytedance.ies.xbridge.h.c.c();
        l.c(str, "");
        cVar.f36041a = str;
        if (b2 != null) {
            cVar.f36042b = b2;
        }
        a(cVar, new b(this, bVar), eVar);
    }
}
