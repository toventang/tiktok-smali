package com.bytedance.ies.xbridge.j.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36139a = "x.getAPIParams";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36140b = b.a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.j.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0846a {
        static {
            Covode.recordClassIndex(21608);
        }

        void a(com.bytedance.ies.xbridge.j.c.a aVar, String str);
    }

    static {
        Covode.recordClassIndex(21607);
    }

    public abstract void a(c cVar, AbstractC0846a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36139a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36140b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.j.c.a> e() {
        return com.bytedance.ies.xbridge.j.c.a.class;
    }

    public static final class b implements AbstractC0846a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36142b;

        static {
            Covode.recordClassIndex(21609);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36141a = aVar;
            this.f36142b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.j.a.a.AbstractC0846a
        public final void a(com.bytedance.ies.xbridge.j.c.a aVar, String str) {
            l.c(aVar, "");
            l.c(str, "");
            l.c(aVar, "");
            if (aVar.f36190a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f36142b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, ? extends Object> map = aVar.f36190a;
            if (map != null) {
                linkedHashMap.put("apiParams", map);
            }
            a.a(this.f36142b, linkedHashMap, str);
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
