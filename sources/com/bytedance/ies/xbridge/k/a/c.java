package com.bytedance.ies.xbridge.k.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.k.c.e;
import com.bytedance.ies.xbridge.k.c.f;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class c extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36212a = "x.updateGecko";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36213b = b.a.PRIVATE;

    public interface a {
        static {
            Covode.recordClassIndex(21643);
        }

        void a(f fVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21642);
    }

    public abstract void a(e eVar, a aVar, com.bytedance.ies.xbridge.e eVar2);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36212a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36213b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<? extends com.bytedance.ies.xbridge.model.params.a> d() {
        return e.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<? extends com.bytedance.ies.xbridge.model.c.a> e() {
        return f.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36215b;

        static {
            Covode.recordClassIndex(21644);
        }

        @Override // com.bytedance.ies.xbridge.k.a.c.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36215b, 0, str, null, 8);
        }

        b(c cVar, b.AbstractC0814b bVar) {
            this.f36214a = cVar;
            this.f36215b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.k.a.c.a
        public final void a(f fVar, String str) {
            l.c(fVar, "");
            l.c(str, "");
            l.c(fVar, "");
            Integer num = fVar.f36235a;
            if (num != null) {
                num.intValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Integer num2 = fVar.f36235a;
                if (num2 != null) {
                    linkedHashMap.put("statusCode", Integer.valueOf(num2.intValue()));
                }
                c.a(this.f36215b, linkedHashMap, str);
                return;
            }
            com.bytedance.ies.xbridge.c.a.a(this.f36215b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
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
        Boolean bool = null;
        if (!z) {
            String str2 = i.a(nVar, "accessKey", "");
            if (str2.length() != 0) {
                k i2 = nVar.i("enableDownloadAutoRetry");
                if (i2.a() == o.Boolean) {
                    bool = Boolean.valueOf(i2.b());
                }
                e eVar2 = new e();
                l.c(str, "");
                eVar2.f36231a = str;
                l.c(str2, "");
                eVar2.f36232b = str2;
                if (bool != null) {
                    eVar2.f36233c = bool.booleanValue();
                }
                a(eVar2, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
