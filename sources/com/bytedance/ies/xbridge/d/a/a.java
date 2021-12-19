package com.bytedance.ies.xbridge.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f35884a = b.a.PRIVATE;

    /* renamed from: b  reason: collision with root package name */
    private final String f35885b = "x.getDebugInfo";

    /* renamed from: com.bytedance.ies.xbridge.d.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0816a {
        static {
            Covode.recordClassIndex(21447);
        }

        void a(com.bytedance.ies.xbridge.d.c.a aVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21446);
    }

    public abstract void a(c cVar, AbstractC0816a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35885b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35884a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.d.c.a> e() {
        return com.bytedance.ies.xbridge.d.c.a.class;
    }

    public static final class b implements AbstractC0816a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f35886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35887b;

        static {
            Covode.recordClassIndex(21448);
        }

        @Override // com.bytedance.ies.xbridge.d.a.a.AbstractC0816a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35887b, 0, str, null, 8);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f35886a = aVar;
            this.f35887b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.d.a.a.AbstractC0816a
        public final void a(com.bytedance.ies.xbridge.d.c.a aVar, String str) {
            Boolean bool;
            l.c(aVar, "");
            l.c(str, "");
            l.c(aVar, "");
            Boolean bool2 = aVar.f35893a;
            if (bool2 != null) {
                bool2.booleanValue();
                if (!(aVar.f35894b == null || (bool = aVar.f35895c) == null)) {
                    bool.booleanValue();
                    if (aVar.f35896d != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Boolean bool3 = aVar.f35893a;
                        if (bool3 == null) {
                            l.a();
                        }
                        linkedHashMap.put("useBOE", bool3);
                        String str2 = aVar.f35894b;
                        if (str2 == null) {
                            l.a();
                        }
                        linkedHashMap.put("boeChannel", str2);
                        Boolean bool4 = aVar.f35895c;
                        if (bool4 == null) {
                            l.a();
                        }
                        linkedHashMap.put("usePPE", bool4);
                        String str3 = aVar.f35896d;
                        if (str3 == null) {
                            l.a();
                        }
                        linkedHashMap.put("ppeChannel", str3);
                        a.a(this.f35887b, linkedHashMap, str);
                        return;
                    }
                }
            }
            com.bytedance.ies.xbridge.c.a.a(this.f35887b, -5, null, null, 12);
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
