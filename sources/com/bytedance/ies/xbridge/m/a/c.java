package com.bytedance.ies.xbridge.m.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.m.c.d;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36258a = "x.removeStorageItem";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36259b = b.a.PRIVATE;

    public interface a {
        static {
            Covode.recordClassIndex(21684);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21683);
    }

    public abstract void a(d dVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36258a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36259b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<d> d() {
        return d.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36261b;

        static {
            Covode.recordClassIndex(21685);
        }

        @Override // com.bytedance.ies.xbridge.m.a.c.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36261b, 0, str, null, 8);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f36260a = cVar;
            this.f36261b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.m.a.c.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            c.a(this.f36261b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
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
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        d dVar = new d();
        l.c(str, "");
        dVar.f36274a = str;
        a(dVar, new b(this, bVar), eVar);
    }
}
