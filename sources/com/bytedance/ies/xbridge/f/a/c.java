package com.bytedance.ies.xbridge.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f.c.d;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f35954a = "x.getContainerID";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f35955b = b.a.PUBLIC;

    public interface a {
        static {
            Covode.recordClassIndex(21500);
        }

        void a(d dVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21499);
    }

    public abstract void a(com.bytedance.ies.xbridge.model.params.c cVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35954a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35955b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.params.c> d() {
        return com.bytedance.ies.xbridge.model.params.c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<d> e() {
        return d.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f35956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35957b;

        static {
            Covode.recordClassIndex(21501);
        }

        @Override // com.bytedance.ies.xbridge.f.a.c.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35957b, 0, str, null, 8);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f35956a = cVar;
            this.f35957b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.f.a.c.a
        public final void a(d dVar, String str) {
            l.c(dVar, "");
            l.c(str, "");
            l.c(dVar, "");
            if (dVar.f35973a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f35957b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = dVar.f35973a;
            if (str2 != null) {
                linkedHashMap.put("containerID", str2);
            }
            c.a(this.f35957b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        a(c.a.a(nVar), new b(this, bVar), eVar);
    }
}
