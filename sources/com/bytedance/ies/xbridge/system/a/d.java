package com.bytedance.ies.xbridge.system.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.system.c.e;
import h.f.b.l;

public abstract class d extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36427a = "x.removeCalendarEvent";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36428b = b.a.PRIVATE;

    public interface a {
        static {
            Covode.recordClassIndex(21845);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21844);
    }

    public abstract void a(e eVar, a aVar, com.bytedance.ies.xbridge.e eVar2);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36427a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36428b;
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
        final /* synthetic */ d f36429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36430b;

        static {
            Covode.recordClassIndex(21846);
        }

        @Override // com.bytedance.ies.xbridge.system.a.d.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36430b, 0, str, null, 8);
        }

        b(d dVar, b.AbstractC0814b bVar) {
            this.f36429a = dVar;
            this.f36430b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.a.d.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            d.a(this.f36430b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "eventID", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, "param model convert to null", null, 8);
            return;
        }
        e eVar2 = new e();
        l.c(str, "");
        eVar2.f36497a = str;
        a(eVar2, new b(this, bVar), eVar);
    }
}
