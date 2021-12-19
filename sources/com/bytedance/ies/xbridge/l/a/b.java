package com.bytedance.ies.xbridge.l.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36239a = "x.open";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36240b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21668);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21667);
    }

    public abstract void a(com.bytedance.ies.xbridge.l.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36239a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36240b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.l.c.b> d() {
        return com.bytedance.ies.xbridge.l.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.l.a.b$b  reason: collision with other inner class name */
    public static final class C0859b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36242b;

        static {
            Covode.recordClassIndex(21669);
        }

        @Override // com.bytedance.ies.xbridge.l.a.b.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36242b, 0, str, null, 8);
        }

        C0859b(b bVar, b.AbstractC0814b bVar2) {
            this.f36241a = bVar;
            this.f36242b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.l.a.b.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            b.a(this.f36242b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "schema", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        com.bytedance.ies.xbridge.l.c.b bVar2 = new com.bytedance.ies.xbridge.l.c.b();
        l.c(str, "");
        bVar2.f36247a = str;
        bVar2.f36248b = i.a(nVar, "replace", false);
        bVar2.f36249c = i.a(nVar, "useSysBrowser", false);
        a(bVar2, new C0859b(this, bVar), eVar);
    }
}
