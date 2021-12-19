package com.bytedance.ies.xbridge.m.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m.c.e;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class d extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36262a = "x.setStorageItem";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36263b = b.a.PRIVATE;

    public interface a {
        static {
            Covode.recordClassIndex(21687);
        }

        void a(int i2, String str);

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21686);
    }

    public abstract void a(e eVar, a aVar, com.bytedance.ies.xbridge.e eVar2);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36262a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36263b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<e> d() {
        return e.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f36264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36265b;

        static {
            Covode.recordClassIndex(21688);
        }

        b(d dVar, b.AbstractC0814b bVar) {
            this.f36264a = dVar;
            this.f36265b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.m.a.d.a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36265b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.m.a.d.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            d.a(this.f36265b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        boolean z;
        k i2;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "key", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !nVar.b("data") && (i2 = nVar.i("data")) != null) {
            e eVar2 = new e();
            l.c(str, "");
            eVar2.f36276a = str;
            l.c(i2, "");
            eVar2.f36277b = i2;
            a(eVar2, new b(this, bVar), eVar);
            return;
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
