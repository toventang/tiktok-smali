package com.bytedance.ies.xbridge.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e.c.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f35913a = b.a.PUBLIC;

    /* renamed from: b  reason: collision with root package name */
    private final String f35914b = "x.unsubscribeEvent";

    public interface a {
        static {
            Covode.recordClassIndex(21468);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21467);
    }

    public abstract void a(e eVar, a aVar, com.bytedance.ies.xbridge.e eVar2);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35914b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35913a;
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
        final /* synthetic */ c f35915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35916b;

        static {
            Covode.recordClassIndex(21469);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f35915a = cVar;
            this.f35916b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.e.a.c.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            c.a(this.f35916b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "eventName", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        e eVar2 = new e();
        l.c(str, "");
        eVar2.f35938a = str;
        a(eVar2, new b(this, bVar), eVar);
    }
}
