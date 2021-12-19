package com.bytedance.ies.xbridge.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.f.c.a;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.ArrayList;
import org.json.JSONObject;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f35945a = "XBatchEventsEventMethod";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f35946b = b.a.PRIVATE;

    /* renamed from: e  reason: collision with root package name */
    private final String f35947e = "x.batchEvents";

    /* renamed from: com.bytedance.ies.xbridge.f.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0824a {
        static {
            Covode.recordClassIndex(21493);
        }

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21492);
    }

    public abstract void a(com.bytedance.ies.xbridge.f.c.a aVar, AbstractC0824a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35947e;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35946b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.f.c.a> d() {
        return com.bytedance.ies.xbridge.f.c.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements AbstractC0824a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f35948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35949b;

        static {
            Covode.recordClassIndex(21494);
        }

        @Override // com.bytedance.ies.xbridge.f.a.a.AbstractC0824a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35949b, -3, str, null, 8);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f35948a = aVar;
            this.f35949b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.f.a.a.AbstractC0824a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            a.a(this.f35949b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        m c2 = i.c(nVar, "actionList");
        if (c2 == null) {
            com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
            return;
        }
        String str = i.a(nVar, "actionType", "");
        com.bytedance.ies.xbridge.f.c.a aVar = new com.bytedance.ies.xbridge.f.c.a();
        l.c(str, "");
        aVar.f35962a = str;
        ArrayList arrayList = new ArrayList();
        int a2 = c2.a();
        for (int i2 = 0; i2 < a2; i2++) {
            n f2 = c2.f(i2);
            if (f2 != null) {
                String str2 = i.a(f2, "methodName", "");
                n b2 = i.b(f2, "params");
                arrayList.add(new a.C0828a(str2, new JSONObject(b2 != null ? i.a(b2) : null)));
            }
        }
        aVar.f35963b = arrayList;
        a(aVar, new b(this, bVar), eVar);
    }
}
