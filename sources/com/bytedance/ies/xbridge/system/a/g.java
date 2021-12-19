package com.bytedance.ies.xbridge.system.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.model.params.a;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.system.c.i;
import h.f.b.l;

public abstract class g extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36439a = "x.vibrate";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36440b = b.a.PROTECT;

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.system.a.g$a$a  reason: collision with other inner class name */
        public static final class C0881a {
            static {
                Covode.recordClassIndex(21856);
            }
        }

        static {
            Covode.recordClassIndex(21855);
        }

        void a(int i2, String str);

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21854);
    }

    public abstract void a(i iVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36439a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36440b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<i> d() {
        return i.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f36441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36442b;

        static {
            Covode.recordClassIndex(21857);
        }

        b(g gVar, b.AbstractC0814b bVar) {
            this.f36441a = gVar;
            this.f36442b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.a.g.a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36442b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.system.a.g.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            g.a(this.f36442b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        int a2 = a.C0864a.a(nVar, "duration", 300);
        String str = com.bytedance.ies.xbridge.i.a(nVar, "style", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        i iVar = new i();
        iVar.f36514a = a2;
        l.c(str, "");
        iVar.f36515b = str;
        a(iVar, new b(this, bVar), eVar);
    }
}
