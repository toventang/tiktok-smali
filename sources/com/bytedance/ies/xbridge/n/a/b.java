package com.bytedance.ies.xbridge.n.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36302a = "x.hideLoading";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36303b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21737);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21736);
    }

    public abstract void a(c cVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36302a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36303b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.n.a.b$b  reason: collision with other inner class name */
    public static final class C0866b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36305b;

        static {
            Covode.recordClassIndex(21738);
        }

        @Override // com.bytedance.ies.xbridge.n.a.b.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36305b, 0, str, null, 8);
        }

        C0866b(b bVar, b.AbstractC0814b bVar2) {
            this.f36304a = bVar;
            this.f36305b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.n.a.b.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            b.a(this.f36305b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        a(c.a.a(nVar), new C0866b(this, bVar), eVar);
    }
}
