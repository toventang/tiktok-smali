package com.bytedance.ies.xbridge.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a.c.c;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f35732a = b.a.PROTECT;

    /* renamed from: b  reason: collision with root package name */
    private final String f35733b = "x.login";

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.a.a.b$a$a  reason: collision with other inner class name */
        public static final class C0811a {
            static {
                Covode.recordClassIndex(21331);
            }
        }

        static {
            Covode.recordClassIndex(21330);
        }

        void a(c cVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21329);
    }

    public abstract void a(com.bytedance.ies.xbridge.a.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35733b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35732a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.a.c.b> d() {
        return com.bytedance.ies.xbridge.a.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> e() {
        return c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.a.a.b$b  reason: collision with other inner class name */
    public static final class C0812b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f35734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35735b;

        static {
            Covode.recordClassIndex(21332);
        }

        @Override // com.bytedance.ies.xbridge.a.a.b.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35735b, 0, str, null, 8);
        }

        C0812b(b bVar, b.AbstractC0814b bVar2) {
            this.f35734a = bVar;
            this.f35735b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.a.a.b.a
        public final void a(c cVar, String str) {
            l.c(cVar, "");
            l.c(str, "");
            l.c(cVar, "");
            if (cVar.f35761a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f35735b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = cVar.f35761a;
            if (str2 != null) {
                linkedHashMap.put("status", str2);
            }
            b.a(this.f35735b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        n b2 = i.b(nVar, "context");
        com.bytedance.ies.xbridge.a.c.b bVar2 = new com.bytedance.ies.xbridge.a.c.b();
        if (b2 != null) {
            bVar2.f35759a = b2;
        }
        a(bVar2, new C0812b(this, bVar), eVar);
    }
}
