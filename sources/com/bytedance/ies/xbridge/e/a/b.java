package com.bytedance.ies.xbridge.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.e.c.c;
import com.bytedance.ies.xbridge.e.c.d;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f35909a = b.a.PUBLIC;

    /* renamed from: b  reason: collision with root package name */
    private final String f35910b = "x.subscribeEvent";

    public interface a {
        static {
            Covode.recordClassIndex(21465);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21464);
    }

    public abstract void a(c cVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35910b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35909a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.e.a.b$b  reason: collision with other inner class name */
    public static final class C0821b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f35911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35912b;

        static {
            Covode.recordClassIndex(21466);
        }

        C0821b(b bVar, b.AbstractC0814b bVar2) {
            this.f35911a = bVar;
            this.f35912b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.e.a.b.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            b.a(this.f35912b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        long j2;
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
        if (!z && nVar.a("timestamp")) {
            k i2 = nVar.i("timestamp");
            int i3 = d.f35936a[i2.a().ordinal()];
            if (i3 == 1) {
                j2 = (long) i2.c();
            } else if (i3 == 2) {
                j2 = (long) i2.d();
            }
            c cVar = new c();
            l.c(str, "");
            cVar.f35934a = str;
            cVar.f35935b = j2;
            a(cVar, new C0821b(this, bVar), eVar);
            return;
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
