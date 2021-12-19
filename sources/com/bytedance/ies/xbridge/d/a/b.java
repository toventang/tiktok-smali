package com.bytedance.ies.xbridge.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.d.c.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f35888a = "x.getMethodList";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f35889b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21450);
        }

        void a(com.bytedance.ies.xbridge.d.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21449);
    }

    public abstract void a(c cVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35888a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35889b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.d.c.b> e() {
        return com.bytedance.ies.xbridge.d.c.b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.d.a.b$b  reason: collision with other inner class name */
    public static final class C0817b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f35890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35891b;

        static {
            Covode.recordClassIndex(21451);
        }

        C0817b(b bVar, b.AbstractC0814b bVar2) {
            this.f35890a = bVar;
            this.f35891b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.d.a.b.a
        public final void a(com.bytedance.ies.xbridge.d.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            l.c(bVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Map<String, b.C0819b> map = bVar.f35898a;
            if (map != null) {
                for (T t : map.entrySet()) {
                    Object key = t.getKey();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("authType", ((b.C0819b) t.getValue()).f35899a);
                    linkedHashMap2.put(key, linkedHashMap3);
                }
            }
            linkedHashMap.put("methodList", linkedHashMap2);
            b.a(this.f35891b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        a(c.a.a(nVar), new C0817b(this, bVar), eVar);
    }
}
