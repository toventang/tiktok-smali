package com.bytedance.ies.xbridge.n.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public abstract class f extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36317a = "x.showToast";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36318b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21751);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21750);
    }

    public abstract void a(com.bytedance.ies.xbridge.n.d.f fVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36317a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36318b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.n.d.f> d() {
        return com.bytedance.ies.xbridge.n.d.f.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f36319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36320b;

        static {
            Covode.recordClassIndex(21752);
        }

        @Override // com.bytedance.ies.xbridge.n.a.f.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36320b, 0, str, null, 8);
        }

        b(f fVar, b.AbstractC0814b bVar) {
            this.f36319a = fVar;
            this.f36320b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.n.a.f.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            f.a(this.f36320b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "message", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = i.a(nVar, StringSet.type, "");
            if (str2.length() != 0) {
                int i2 = 3000;
                if (nVar.a("duration")) {
                    if (nVar.i("duration").a() == o.Int) {
                        i2 = i.a(nVar, "duration", 3000);
                    } else if (nVar.i("duration").a() == o.Number) {
                        i2 = (int) i.a(nVar, "duration", 3000.0d);
                    }
                }
                com.bytedance.ies.xbridge.n.d.f fVar = new com.bytedance.ies.xbridge.n.d.f();
                l.c(str, "");
                fVar.f36355a = str;
                l.c(str2, "");
                fVar.f36356b = str2;
                fVar.f36357c = Integer.valueOf(i2);
                a(fVar, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
