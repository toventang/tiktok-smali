package com.bytedance.ies.xbridge.h.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.h.c.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class b extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36009a = "x.reportALog";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36010b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21537);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21536);
    }

    public abstract void a(com.bytedance.ies.xbridge.h.c.b bVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36009a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36010b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.h.c.b> d() {
        return com.bytedance.ies.xbridge.h.c.b.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.h.a.b$b  reason: collision with other inner class name */
    public static final class C0834b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f36011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36012b;

        static {
            Covode.recordClassIndex(21538);
        }

        @Override // com.bytedance.ies.xbridge.h.a.b.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36012b, -3, str, null, 8);
        }

        C0834b(b bVar, b.AbstractC0814b bVar2) {
            this.f36011a = bVar;
            this.f36012b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.h.a.b.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            b.a(this.f36012b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        String str;
        String str2;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str3 = i.a(nVar, "level", "");
        int i2 = 0;
        if (str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str4 = i.a(nVar, "message", "");
            if (str4.length() != 0) {
                String str5 = i.a(nVar, "tag", "");
                if (str5.length() != 0) {
                    n b2 = i.b(nVar, "codePosition");
                    if (b2 != null) {
                        i2 = i.a(b2, "line", 0);
                        str2 = i.a(b2, "function", "");
                        str = i.a(b2, "file", "");
                    } else {
                        str = "";
                        str2 = str;
                    }
                    b.a aVar = new b.a(str, str2, i2);
                    com.bytedance.ies.xbridge.h.c.b bVar2 = new com.bytedance.ies.xbridge.h.c.b();
                    l.c(str3, "");
                    bVar2.f36033a = str3;
                    l.c(str4, "");
                    bVar2.f36034b = str4;
                    l.c(str5, "");
                    bVar2.f36035c = str5;
                    bVar2.f36036d = aVar;
                    a(bVar2, new C0834b(this, bVar), eVar);
                    return;
                }
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
