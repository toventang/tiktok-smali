package com.bytedance.ies.xbridge.n.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import h.f.b.l;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36298a = "x.configureStatusBar";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36299b = b.a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.n.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0865a {
        static {
            Covode.recordClassIndex(21734);
        }

        void a(int i2, String str);

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21733);
    }

    public abstract void a(com.bytedance.ies.xbridge.n.d.a aVar, AbstractC0865a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36298a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36299b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.n.d.a> d() {
        return com.bytedance.ies.xbridge.n.d.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements AbstractC0865a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36301b;

        static {
            Covode.recordClassIndex(21735);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36300a = aVar;
            this.f36301b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.n.a.a.AbstractC0865a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36301b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.n.a.a.AbstractC0865a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            a.a(this.f36301b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        Boolean bool;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "style", "");
        l.c(nVar, "");
        l.c("visible", "");
        if (nVar.i("visible").a() == o.Boolean) {
            bool = Boolean.valueOf(nVar.c("visible"));
        } else {
            bool = null;
        }
        String str2 = i.a(nVar, "backgroundColor", "");
        if (bool == null) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, "Please check your input!", null, 8);
            return;
        }
        com.bytedance.ies.xbridge.n.d.a aVar = new com.bytedance.ies.xbridge.n.d.a();
        if (str.length() > 0) {
            aVar.f36328a = str;
        }
        if (str2.length() > 0) {
            aVar.f36329b = str2;
        }
        aVar.f36330c = bool;
        a(aVar, new b(this, bVar), eVar);
    }
}
