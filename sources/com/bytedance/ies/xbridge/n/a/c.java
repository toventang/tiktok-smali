package com.bytedance.ies.xbridge.n.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.n.d.b;
import com.bytedance.ies.xbridge.n.d.c;
import com.bytedance.ies.xbridge.o;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36306a = "x.showActionSheet";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36307b = b.a.PROTECT;

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.n.a.c$a$a  reason: collision with other inner class name */
        public static final class C0867a {
            static {
                Covode.recordClassIndex(21741);
            }
        }

        static {
            Covode.recordClassIndex(21740);
        }

        void a(com.bytedance.ies.xbridge.n.d.c cVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21739);
    }

    public abstract void a(com.bytedance.ies.xbridge.n.d.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36306a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36307b;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36309b;

        static {
            Covode.recordClassIndex(21742);
        }

        @Override // com.bytedance.ies.xbridge.n.a.c.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36309b, 0, str, null, 8);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f36308a = cVar;
            this.f36309b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.n.a.c.a
        public final void a(com.bytedance.ies.xbridge.n.d.c cVar, String str) {
            Integer num;
            l.c(cVar, "");
            l.c(str, "");
            l.c(cVar, "");
            if (cVar.f36340a != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (cVar.f36340a == c.b.SELECT) {
                    c.C0874c cVar2 = cVar.f36341b;
                    if (!(cVar2 == null || (num = cVar2.f36343a) == null)) {
                        linkedHashMap.put("index", Integer.valueOf(num.intValue()));
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                c.b bVar = cVar.f36340a;
                if (bVar != null) {
                    linkedHashMap2.put("action", bVar.getAction());
                }
                linkedHashMap2.put("detail", linkedHashMap);
                c.a(this.f36309b, linkedHashMap2, str);
                return;
            }
            com.bytedance.ies.xbridge.c.a.a(this.f36309b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        n g2;
        String str;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str2 = i.a(nVar, "subtitle", "");
        String str3 = i.a(nVar, "title", "");
        m c2 = i.c(nVar, "actions");
        if (c2 == null || c2.a() == 0) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int a2 = c2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            k g3 = c2.g(i2);
            if (g3.a() == o.Map && (g2 = g3.g()) != null) {
                l.c(g2, "");
                String str4 = i.a(g2, "title", "");
                if (str4.length() != 0) {
                    String str5 = i.a(g2, StringSet.type, "");
                    if (str5.length() == 0) {
                        str5 = "default";
                    }
                    if (g2.a("subtitle")) {
                        str = i.a(g2, "subtitle", "");
                    } else {
                        str = null;
                    }
                    b.a aVar = new b.a();
                    l.c(str4, "");
                    aVar.f36336a = str4;
                    l.c(str5, "");
                    aVar.f36338c = str5;
                    aVar.f36337b = str;
                    arrayList.add(aVar);
                }
            }
        }
        com.bytedance.ies.xbridge.n.d.b bVar2 = new com.bytedance.ies.xbridge.n.d.b();
        bVar2.f36332a = str3;
        l.c(arrayList, "");
        bVar2.f36334c = arrayList;
        bVar2.f36333b = str2;
        a(bVar2, new b(this, bVar), eVar);
    }
}
