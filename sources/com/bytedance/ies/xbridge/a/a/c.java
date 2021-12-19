package com.bytedance.ies.xbridge.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a.c.d;
import com.bytedance.ies.xbridge.a.c.e;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f35736a = b.a.PRIVATE;

    /* renamed from: b  reason: collision with root package name */
    private final String f35737b = "x.logout";

    public interface a {
        static {
            Covode.recordClassIndex(21334);
        }

        void a(e eVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21333);
    }

    public abstract void a(d dVar, a aVar, com.bytedance.ies.xbridge.e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35737b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35736a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<d> d() {
        return d.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<e> e() {
        return e.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f35738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35739b;

        static {
            Covode.recordClassIndex(21335);
        }

        @Override // com.bytedance.ies.xbridge.a.a.c.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35739b, 0, str, null, 8);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f35738a = cVar;
            this.f35739b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.a.a.c.a
        public final void a(e eVar, String str) {
            l.c(eVar, "");
            l.c(str, "");
            l.c(eVar, "");
            if (eVar.f35765a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f35739b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = eVar.f35765a;
            if (str2 != null) {
                linkedHashMap.put("status", str2);
            }
            c.a(this.f35739b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        n b2 = i.b(nVar, "context");
        d dVar = new d();
        if (b2 != null) {
            dVar.f35763a = b2;
        }
        a(dVar, new b(this, bVar), eVar);
    }
}
