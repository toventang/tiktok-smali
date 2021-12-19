package com.bytedance.ies.xbridge.h.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class d extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36017a = "x.reportMonitorLog";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36018b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21543);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21542);
    }

    public abstract void a(com.bytedance.ies.xbridge.h.c.d dVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36017a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36018b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.h.c.d> d() {
        return com.bytedance.ies.xbridge.h.c.d.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f36019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36020b;

        static {
            Covode.recordClassIndex(21544);
        }

        @Override // com.bytedance.ies.xbridge.h.a.d.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36020b, -3, str, null, 8);
        }

        b(d dVar, b.AbstractC0814b bVar) {
            this.f36019a = dVar;
            this.f36020b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.h.a.d.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            d.a(this.f36020b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        double d2;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "logType", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = i.a(nVar, "service", "");
            if (nVar.a("status")) {
                k i2 = nVar.i("status");
                int i3 = com.bytedance.ies.xbridge.h.c.e.f36048a[i2.a().ordinal()];
                if (i3 == 1) {
                    d2 = i2.c();
                } else if (i3 == 2) {
                    d2 = i2.c();
                }
                int i4 = (int) d2;
                n b2 = i.b(nVar, "value");
                if (b2 != null) {
                    com.bytedance.ies.xbridge.h.c.d dVar = new com.bytedance.ies.xbridge.h.c.d();
                    l.c(str, "");
                    dVar.f36044a = str;
                    l.c(str2, "");
                    dVar.f36045b = str2;
                    dVar.f36046c = i4;
                    l.c(b2, "");
                    dVar.f36047d = b2;
                    a(dVar, new b(this, bVar), eVar);
                    return;
                }
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
