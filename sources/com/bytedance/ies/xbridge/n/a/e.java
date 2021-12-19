package com.bytedance.ies.xbridge.n.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.n.d.d;
import com.bytedance.ies.xbridge.n.d.e;
import h.f.b.l;
import java.util.Map;

public abstract class e extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36313a = "x.showModal";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36314b = b.a.PROTECT;

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.n.a.e$a$a  reason: collision with other inner class name */
        public static final class C0868a {
            static {
                Covode.recordClassIndex(21748);
            }
        }

        static {
            Covode.recordClassIndex(21747);
        }

        void a(com.bytedance.ies.xbridge.n.d.e eVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21746);
    }

    public abstract void a(d dVar, a aVar, com.bytedance.ies.xbridge.e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36313a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36314b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<d> d() {
        return d.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.n.d.e> e() {
        return com.bytedance.ies.xbridge.n.d.e.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f36315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36316b;

        static {
            Covode.recordClassIndex(21749);
        }

        @Override // com.bytedance.ies.xbridge.n.a.e.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36316b, 0, str, null, 8);
        }

        b(e eVar, b.AbstractC0814b bVar) {
            this.f36315a = eVar;
            this.f36316b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.n.a.e.a
        public final void a(com.bytedance.ies.xbridge.n.d.e eVar, String str) {
            l.c(eVar, "");
            l.c(str, "");
            Map<String, Object> a2 = e.b.a(eVar);
            if (a2 == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f36316b, -5, null, null, 12);
            } else {
                e.a(this.f36316b, a2, str);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "title", "");
        String str2 = i.a(nVar, "content", "");
        boolean a2 = i.a(nVar, "showCancel", false);
        String str3 = i.a(nVar, "cancelText", "");
        String str4 = i.a(nVar, "confirmText", "");
        boolean a3 = i.a(nVar, "tapMaskToDismiss", false);
        d dVar = new d();
        l.c(str, "");
        dVar.f36345a = str;
        l.c(str2, "");
        dVar.f36346b = str2;
        dVar.f36347c = a2;
        l.c(str3, "");
        dVar.f36348d = str3;
        l.c(str4, "");
        dVar.f36349e = str4;
        dVar.f36350f = a3;
        a(dVar, new b(this, bVar), eVar);
    }
}
