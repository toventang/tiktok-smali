package com.bytedance.ies.xbridge.m.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36250a = "x.getStorageInfo";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36251b = b.a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.m.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0861a {
        static {
            Covode.recordClassIndex(21678);
        }

        void a(com.bytedance.ies.xbridge.m.c.a aVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21677);
    }

    public abstract void a(c cVar, AbstractC0861a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36250a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36251b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.m.c.a> e() {
        return com.bytedance.ies.xbridge.m.c.a.class;
    }

    public static final class b implements AbstractC0861a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36253b;

        static {
            Covode.recordClassIndex(21679);
        }

        @Override // com.bytedance.ies.xbridge.m.a.a.AbstractC0861a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36253b, 0, str, null, 8);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36252a = aVar;
            this.f36253b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.m.a.a.AbstractC0861a
        public final void a(com.bytedance.ies.xbridge.m.c.a aVar, String str) {
            l.c(aVar, "");
            l.c(str, "");
            l.c(aVar, "");
            if (aVar.f36268a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f36253b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> list = aVar.f36268a;
            if (list != null) {
                linkedHashMap.put("keys", list);
            }
            a.a(this.f36253b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        a(c.a.a(nVar), new b(this, bVar), eVar);
    }
}
