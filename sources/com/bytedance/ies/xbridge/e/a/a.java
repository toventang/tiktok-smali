package com.bytedance.ies.xbridge.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f35905a = b.a.PUBLIC;

    /* renamed from: b  reason: collision with root package name */
    private final String f35906b = "x.publishEvent";

    /* renamed from: com.bytedance.ies.xbridge.e.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0820a {
        static {
            Covode.recordClassIndex(21462);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21461);
    }

    public abstract void a(com.bytedance.ies.xbridge.e.c.a aVar, AbstractC0820a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35906b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35905a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.e.c.a> d() {
        return com.bytedance.ies.xbridge.e.c.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements AbstractC0820a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f35907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35908b;

        static {
            Covode.recordClassIndex(21463);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f35907a = aVar;
            this.f35908b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.e.a.a.AbstractC0820a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            a.a(this.f35908b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        double d2;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "eventName", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && nVar.a("timestamp")) {
            k i2 = nVar.i("timestamp");
            int i3 = com.bytedance.ies.xbridge.e.c.b.f35932a[i2.a().ordinal()];
            if (i3 == 1) {
                d2 = i2.c();
            } else if (i3 == 2) {
                d2 = i2.c();
            }
            long j2 = (long) d2;
            n b2 = i.b(nVar, "params");
            com.bytedance.ies.xbridge.e.c.a aVar = new com.bytedance.ies.xbridge.e.c.a();
            l.c(str, "");
            aVar.f35929a = str;
            aVar.f35930b = j2;
            aVar.f35931c = b2;
            a(aVar, new b(this, bVar), eVar);
            return;
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
