package com.bytedance.ies.xbridge.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f.c.c;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f35950a = "x.canIUse";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f35951b = b.a.PROTECT;

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.f.a.b$a$a  reason: collision with other inner class name */
        public static final class C0825a {
            static {
                Covode.recordClassIndex(21497);
            }
        }

        static {
            Covode.recordClassIndex(21496);
        }

        void a(c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21495);
    }

    public abstract void a(com.bytedance.ies.xbridge.f.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35950a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35951b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.f.c.b> d() {
        return com.bytedance.ies.xbridge.f.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> e() {
        return c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.b$b  reason: collision with other inner class name */
    public static final class C0826b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f35952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35953b;

        static {
            Covode.recordClassIndex(21498);
        }

        C0826b(b bVar, b.AbstractC0814b bVar2) {
            this.f35952a = bVar;
            this.f35953b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.f.a.b.a
        public final void a(c cVar, String str) {
            l.c(cVar, "");
            l.c(str, "");
            l.c(cVar, "");
            Boolean bool = cVar.f35969a;
            if (bool != null) {
                bool.booleanValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Boolean bool2 = cVar.f35969a;
                if (bool2 == null) {
                    l.a();
                }
                linkedHashMap.put("isAvailable", bool2);
                linkedHashMap.put("params", cVar.f35970b);
                linkedHashMap.put("results", cVar.f35971c);
                b.a(this.f35953b, linkedHashMap, str);
                return;
            }
            com.bytedance.ies.xbridge.c.a.a(this.f35953b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "method", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        com.bytedance.ies.xbridge.f.c.b bVar2 = new com.bytedance.ies.xbridge.f.c.b();
        l.c(str, "");
        bVar2.f35967a = str;
        a(bVar2, new C0826b(this, bVar), eVar);
    }
}
