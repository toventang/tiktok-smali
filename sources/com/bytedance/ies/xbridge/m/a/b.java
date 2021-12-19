package com.bytedance.ies.xbridge.m.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.m.c.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36254a = "x.getStorageItem";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36255b = b.a.PRIVATE;

    public interface a {
        static {
            Covode.recordClassIndex(21681);
        }

        void a(c cVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21680);
    }

    public abstract void a(com.bytedance.ies.xbridge.m.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36254a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36255b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.m.c.b> d() {
        return com.bytedance.ies.xbridge.m.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> e() {
        return c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.m.a.b$b  reason: collision with other inner class name */
    public static final class C0862b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36257b;

        static {
            Covode.recordClassIndex(21682);
        }

        @Override // com.bytedance.ies.xbridge.m.a.b.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36257b, 0, str, null, 8);
        }

        C0862b(b bVar, b.AbstractC0814b bVar2) {
            this.f36256a = bVar;
            this.f36257b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.m.a.b.a
        public final void a(c cVar, String str) {
            l.c(cVar, "");
            l.c(str, "");
            l.c(cVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = cVar.f36272a;
            if (obj != null) {
                linkedHashMap.put("data", obj);
            }
            b.a(this.f36257b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "key", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        com.bytedance.ies.xbridge.m.c.b bVar2 = new com.bytedance.ies.xbridge.m.c.b();
        l.c(str, "");
        bVar2.f36270a = str;
        a(bVar2, new C0862b(this, bVar), eVar);
    }
}
