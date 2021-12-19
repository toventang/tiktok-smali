package com.bytedance.ies.xbridge.system.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36415a = "x.allowCaptureScreen";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36416b = b.a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.system.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0877a {
        static {
            Covode.recordClassIndex(21835);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21834);
    }

    public abstract void a(com.bytedance.ies.xbridge.system.c.a aVar, AbstractC0877a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36415a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36416b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.system.c.a> d() {
        return com.bytedance.ies.xbridge.system.c.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements AbstractC0877a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36418b;

        static {
            Covode.recordClassIndex(21836);
        }

        @Override // com.bytedance.ies.xbridge.system.a.a.AbstractC0877a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36418b, 0, str, null, 8);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36417a = aVar;
            this.f36418b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.a.a.AbstractC0877a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            a.a(this.f36418b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        boolean a2 = i.a(nVar, "allow", true);
        com.bytedance.ies.xbridge.system.c.a aVar = new com.bytedance.ies.xbridge.system.c.a();
        aVar.f36489a = a2;
        a(aVar, new b(this, bVar), eVar);
    }
}
