package com.bytedance.ies.xbridge.system.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.system.c.c;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36419a = "x.checkPermission";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36420b = b.a.PRIVATE;

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.system.a.b$a$a  reason: collision with other inner class name */
        public static final class C0878a {
            static {
                Covode.recordClassIndex(21839);
            }
        }

        static {
            Covode.recordClassIndex(21838);
        }

        void a(int i2, String str);

        void a(c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21837);
    }

    public abstract void a(com.bytedance.ies.xbridge.system.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36419a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36420b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.system.c.b> d() {
        return com.bytedance.ies.xbridge.system.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> e() {
        return c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.system.a.b$b  reason: collision with other inner class name */
    public static final class C0879b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36422b;

        static {
            Covode.recordClassIndex(21840);
        }

        C0879b(b bVar, b.AbstractC0814b bVar2) {
            this.f36421a = bVar;
            this.f36422b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.system.a.b.a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36422b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.system.a.b.a
        public final void a(c cVar, String str) {
            l.c(cVar, "");
            l.c(str, "");
            l.c(cVar, "");
            if (cVar.f36493a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f36422b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = cVar.f36493a;
            if (str2 != null) {
                linkedHashMap.put("status", str2);
            }
            b.a(this.f36422b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "permission", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        com.bytedance.ies.xbridge.system.c.b bVar2 = new com.bytedance.ies.xbridge.system.c.b();
        l.c(str, "");
        bVar2.f36491a = str;
        a(bVar2, new C0879b(this, bVar), eVar);
    }
}
