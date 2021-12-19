package com.bytedance.ies.xbridge.l.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36236a = "x.close";

    /* renamed from: com.bytedance.ies.xbridge.l.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0858a {
        static {
            Covode.recordClassIndex(21665);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21664);
    }

    public abstract void a(com.bytedance.ies.xbridge.l.c.a aVar, AbstractC0858a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36236a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return b.a.PROTECT;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.l.c.a> d() {
        return com.bytedance.ies.xbridge.l.c.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements AbstractC0858a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36238b;

        static {
            Covode.recordClassIndex(21666);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36237a = aVar;
            this.f36238b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.l.a.a.AbstractC0858a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            a.a(this.f36238b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "containerID", "");
        boolean a2 = i.a(nVar, "animated", false);
        com.bytedance.ies.xbridge.l.c.a aVar = new com.bytedance.ies.xbridge.l.c.a();
        if (str.length() > 0) {
            aVar.f36244a = str;
        }
        aVar.f36245b = a2;
        a(aVar, new b(this, bVar), eVar);
    }
}
