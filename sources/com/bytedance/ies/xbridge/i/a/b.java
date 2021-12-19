package com.bytedance.ies.xbridge.i.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.i.c.c;
import com.bytedance.ies.xbridge.i.c.d;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f36053a = b.a.PROTECT;

    /* renamed from: b  reason: collision with root package name */
    private final String f36054b = "x.downloadFile";

    public interface a {
        static {
            Covode.recordClassIndex(21567);
        }

        void a(d dVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21566);
    }

    public abstract void a(c cVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36054b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36053a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<d> e() {
        return d.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.i.a.b$b  reason: collision with other inner class name */
    public static final class C0839b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36055a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36056b;

        static {
            Covode.recordClassIndex(21568);
        }

        @Override // com.bytedance.ies.xbridge.i.a.b.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36056b, 0, str, null, 8);
        }

        C0839b(b bVar, b.AbstractC0814b bVar2) {
            this.f36055a = bVar;
            this.f36056b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.i.a.b.a
        public final void a(d dVar, String str) {
            l.c(dVar, "");
            l.c(str, "");
            l.c(dVar, "");
            if (dVar.f36114a == null || dVar.f36116c == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f36056b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = dVar.f36114a;
            if (str2 == null) {
                l.a();
            }
            linkedHashMap.put("httpCode", str2);
            String str3 = dVar.f36116c;
            if (str3 == null) {
                l.a();
            }
            linkedHashMap.put("filePath", str3);
            Map<String, ? extends Object> map = dVar.f36115b;
            if (map != null) {
                linkedHashMap.put("header", map);
            }
            b.a(this.f36056b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "url", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = i.a(nVar, "extension", "");
            if (str2.length() != 0) {
                n b2 = i.b(nVar, "params");
                n b3 = i.b(nVar, "header");
                c cVar = new c();
                l.c(str, "");
                cVar.f36109a = str;
                l.c(str2, "");
                cVar.f36110b = str2;
                if (b2 != null) {
                    cVar.f36111c = b2;
                }
                if (b3 != null) {
                    cVar.f36112d = b3;
                }
                a(cVar, new C0839b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
