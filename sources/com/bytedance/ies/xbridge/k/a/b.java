package com.bytedance.ies.xbridge.k.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k.c.c;
import com.bytedance.ies.xbridge.k.c.d;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36208a = "x.scanCode";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36209b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21640);
        }

        void a(d dVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21639);
    }

    public abstract void a(c cVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36208a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36209b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<d> e() {
        return d.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.k.a.b$b  reason: collision with other inner class name */
    public static final class C0855b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36211b;

        static {
            Covode.recordClassIndex(21641);
        }

        @Override // com.bytedance.ies.xbridge.k.a.b.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36211b, 0, str, null, 8);
        }

        C0855b(b bVar, b.AbstractC0814b bVar2) {
            this.f36210a = bVar;
            this.f36211b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.k.a.b.a
        public final void a(d dVar, String str) {
            l.c(dVar, "");
            l.c(str, "");
            l.c(dVar, "");
            if (dVar.f36229a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f36211b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = dVar.f36229a;
            if (str2 != null) {
                linkedHashMap.put("result", str2);
            }
            b.a(this.f36211b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        boolean a2 = i.a(nVar, "cameraOnly", false);
        c cVar = new c();
        cVar.f36227a = a2;
        a(cVar, new C0855b(this, bVar), eVar);
    }
}
