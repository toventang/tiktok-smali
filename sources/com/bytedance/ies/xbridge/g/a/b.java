package com.bytedance.ies.xbridge.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.g.c.b;
import com.bytedance.ies.xbridge.g.c.c;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f35981a = "x.getSettings";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f35982b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21521);
        }

        void a(int i2, String str);

        void a(c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21520);
    }

    public abstract void a(com.bytedance.ies.xbridge.g.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35981a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35982b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.g.c.b> d() {
        return com.bytedance.ies.xbridge.g.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> e() {
        return c.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.g.a.b$b  reason: collision with other inner class name */
    public static final class C0830b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f35983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35984b;

        static {
            Covode.recordClassIndex(21522);
        }

        C0830b(b bVar, b.AbstractC0814b bVar2) {
            this.f35983a = bVar;
            this.f35984b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.g.a.b.a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35984b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.g.a.b.a
        public final void a(c cVar, String str) {
            l.c(cVar, "");
            l.c(str, "");
            l.c(cVar, "");
            if (cVar.f36004a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f35984b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> map = cVar.f36004a;
            if (map != null) {
                linkedHashMap.put("settings", map);
            }
            b.a(this.f35984b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        m c2 = i.c(nVar, "keys");
        if (c2 == null) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        com.bytedance.ies.xbridge.g.c.b bVar2 = new com.bytedance.ies.xbridge.g.c.b();
        ArrayList arrayList = new ArrayList();
        int a2 = c2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            n f2 = c2.f(i2);
            if (f2 != null) {
                String str = i.a(f2, "key", "");
                String str2 = i.a(f2, StringSet.type, "");
                String str3 = i.a(f2, "biz", "");
                if (str.length() > 0 && str2.length() > 0) {
                    b.C0832b bVar3 = new b.C0832b(str, str2);
                    l.c(str3, "");
                    bVar3.f36000a = str3;
                    arrayList.add(bVar3);
                }
            }
        }
        l.c(arrayList, "");
        bVar2.f35999a = arrayList;
        a(bVar2, new C0830b(this, bVar), eVar);
    }
}
