package com.bytedance.hybrid.spark.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.b.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Boolean> f31102a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final C0654a f31103b = new C0654a((byte) 0);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return "enableBlockBackPress";
    }

    /* renamed from: com.bytedance.hybrid.spark.b.a$a  reason: collision with other inner class name */
    public static final class C0654a {
        static {
            Covode.recordClassIndex(18063);
        }

        private C0654a() {
        }

        public /* synthetic */ C0654a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(18062);
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        com.bytedance.ies.xbridge.b.a aVar;
        String a2;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        boolean a3 = i.a(nVar, "status", false);
        c cVar = this.f35883d;
        if (!(cVar == null || (aVar = (com.bytedance.ies.xbridge.b.a) cVar.a(com.bytedance.ies.xbridge.b.a.class)) == null || (a2 = aVar.a()) == null)) {
            f31102a.put(a2, Boolean.valueOf(a3));
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, new LinkedHashMap(), "");
    }
}
