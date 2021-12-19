package com.bytedance.jedi.a.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.d;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.f.b;
import com.bytedance.jedi.a.f.c;
import f.a.t;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public abstract class a<K, V, REQ, RESP> implements b<K, V, REQ, RESP> {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ i[] f39116c = {new y(ab.a(a.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;")};

    /* renamed from: d  reason: collision with root package name */
    public final h f39117d = h.i.a((h.f.a.a) new C0943a(this));

    /* access modifiers changed from: protected */
    public abstract t<RESP> a(REQ req);

    /* renamed from: com.bytedance.jedi.a.f.a$a  reason: collision with other inner class name */
    static final class C0943a extends m implements h.f.a.a<e<K, V>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(23969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0943a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            a aVar = this.this$0;
            l.c(aVar, "");
            b.a.C0944a aVar2 = new b.a.C0944a(aVar);
            d.a(aVar, aVar2);
            return aVar2;
        }
    }

    static {
        Covode.recordClassIndex(23968);
    }

    @Override // com.bytedance.jedi.a.f.b
    public final t<RESP> c(REQ req) {
        t<RESP> a2 = a(req);
        l.c(this, "");
        l.c(a2, "");
        t<RESP> b2 = a2.b(new c.a(this, req));
        l.a((Object) b2, "");
        return b2;
    }
}
