package com.bytedance.ies.xbridge.k.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36204a = "x.getGeckoInfo";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36205b = b.a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.k.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0854a {
        static {
            Covode.recordClassIndex(21637);
        }

        void a(com.bytedance.ies.xbridge.k.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21636);
    }

    public abstract void a(com.bytedance.ies.xbridge.k.c.a aVar, AbstractC0854a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36204a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36205b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<? extends com.bytedance.ies.xbridge.model.params.a> d() {
        return com.bytedance.ies.xbridge.k.c.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<? extends com.bytedance.ies.xbridge.model.c.a> e() {
        return com.bytedance.ies.xbridge.k.c.b.class;
    }

    public static final class b implements AbstractC0854a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36206a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36207b;

        static {
            Covode.recordClassIndex(21638);
        }

        @Override // com.bytedance.ies.xbridge.k.a.a.AbstractC0854a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36207b, 0, str, null, 8);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36206a = aVar;
            this.f36207b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.k.a.a.AbstractC0854a
        public final void a(com.bytedance.ies.xbridge.k.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            l.c(bVar, "");
            Boolean bool = bVar.f36223a;
            if (bool != null) {
                bool.booleanValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Boolean bool2 = bVar.f36223a;
                if (bool2 != null) {
                    linkedHashMap.put("needUpdate", Boolean.valueOf(bool2.booleanValue()));
                }
                Long l2 = bVar.f36224b;
                if (l2 != null) {
                    linkedHashMap.put("totalSize", Long.valueOf(l2.longValue()));
                }
                String str2 = bVar.f36225c;
                if (str2 != null) {
                    linkedHashMap.put("version", str2);
                }
                a.a(this.f36207b, linkedHashMap, str);
                return;
            }
            com.bytedance.ies.xbridge.c.a.a(this.f36207b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "channel", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = i.a(nVar, "accessKey", "");
            if (str2.length() != 0) {
                com.bytedance.ies.xbridge.k.c.a aVar = new com.bytedance.ies.xbridge.k.c.a();
                l.c(str, "");
                aVar.f36221b = str;
                l.c(str2, "");
                aVar.f36220a = str2;
                a(aVar, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
