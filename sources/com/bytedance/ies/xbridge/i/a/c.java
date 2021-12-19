package com.bytedance.ies.xbridge.i.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.i.c.e;
import com.bytedance.ies.xbridge.i.c.f;
import com.bytedance.ies.xbridge.i.c.g;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f36057a = b.a.PROTECT;

    /* renamed from: b  reason: collision with root package name */
    private final String f36058b = "x.uploadImage";

    public interface a {
        static {
            Covode.recordClassIndex(21570);
        }

        void a(int i2, String str);

        void a(g gVar, String str);
    }

    static {
        Covode.recordClassIndex(21569);
    }

    public abstract void a(e eVar, a aVar, com.bytedance.ies.xbridge.e eVar2);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36058b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36057a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<e> d() {
        return e.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<g> e() {
        return g.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36060b;

        static {
            Covode.recordClassIndex(21571);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f36059a = cVar;
            this.f36060b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.i.a.c.a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36060b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.i.a.c.a
        public final void a(g gVar, String str) {
            l.c(gVar, "");
            l.c(str, "");
            l.c(gVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = gVar.f36127a;
            if (str2 != null) {
                linkedHashMap.put("url", str2);
            }
            String str3 = gVar.f36128b;
            if (str3 != null) {
                linkedHashMap.put("uri", str3);
            }
            Map<String, ? extends Object> map = gVar.f36129c;
            if (map != null) {
                linkedHashMap.put("response", map);
            }
            String str4 = gVar.f36130d;
            if (str4 != null) {
                linkedHashMap.put("base64", str4);
            }
            c.a(this.f36060b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        boolean z;
        String str;
        String str2;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str3 = i.a(nVar, "url", "");
        int i2 = 0;
        if (str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m c2 = i.c(nVar, "formDataBody");
            String str4 = i.a(nVar, "filePath", "");
            if (!(str4.length() == 0 && c2 == null)) {
                n b2 = i.b(nVar, "params");
                n b3 = i.b(nVar, "header");
                e eVar2 = new e();
                l.c(str3, "");
                eVar2.f36118a = str3;
                l.c(str4, "");
                eVar2.f36119b = str4;
                ArrayList arrayList = new ArrayList();
                if (c2 != null) {
                    int a2 = c2.a();
                    while (true) {
                        if (i2 >= a2) {
                            break;
                        }
                        k g2 = c2.g(i2);
                        if (f.f36125a[g2.a().ordinal()] == 1) {
                            n g3 = g2.g();
                            if (g3 != null) {
                                str = i.a(g3, "key", "");
                            } else {
                                str = null;
                            }
                            n g4 = g2.g();
                            if (g4 == null || (str2 = i.a(g4, "value", "")) == null) {
                                str2 = "";
                            }
                            if (str == null) {
                                break;
                            }
                            arrayList.add(new e.b(str, str2));
                        }
                        i2++;
                    }
                }
                arrayList = null;
                eVar2.f36122e = arrayList;
                if (b2 != null) {
                    eVar2.f36120c = b2;
                }
                if (b3 != null) {
                    eVar2.f36121d = b3;
                }
                a(eVar2, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
