package com.bytedance.ies.xbridge.system.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.system.c.f;
import h.f.b.l;

public abstract class e extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36431a = "x.sendSMS";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36432b = b.a.PROTECT;

    public interface a {
        static {
            Covode.recordClassIndex(21848);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21847);
    }

    public abstract void a(f fVar, a aVar, com.bytedance.ies.xbridge.e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36431a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36432b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<f> d() {
        return f.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f36433a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36434b;

        static {
            Covode.recordClassIndex(21849);
        }

        @Override // com.bytedance.ies.xbridge.system.a.e.a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36434b, 0, str, null, 8);
        }

        b(e eVar, b.AbstractC0814b bVar) {
            this.f36433a = eVar;
            this.f36434b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.a.e.a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            e.a(this.f36434b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, com.bytedance.ies.xbridge.e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "phoneNumber", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = i.a(nVar, "content", "");
            if (str2.length() != 0) {
                f fVar = new f();
                l.c(str, "");
                fVar.f36499a = str;
                l.c(str2, "");
                fVar.f36500b = str2;
                a(fVar, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
