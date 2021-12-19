package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.c;
import com.bytedance.jedi.a.c.d;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.c.g;
import com.bytedance.jedi.a.l.b;
import com.bytedance.jedi.a.l.e;
import f.a.t;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.p;
import h.v;
import h.w;
import java.util.List;
import java.util.Map;

public abstract class a<K, V> implements c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39060a = {new y(ab.a(a.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;")};

    /* renamed from: c  reason: collision with root package name */
    private final h f39061c = h.i.a((h.f.a.a) new C0931a(this));

    public final e<K, V> a() {
        return (e) this.f39061c.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract V b(K k2);

    /* access modifiers changed from: protected */
    public abstract void b(K k2, V v);

    /* access modifiers changed from: protected */
    public abstract List<p<K, V>> d();

    /* access modifiers changed from: protected */
    public abstract void e();

    public final void c() {
        e();
    }

    /* renamed from: com.bytedance.jedi.a.a.a$a  reason: collision with other inner class name */
    static final class C0931a extends m implements h.f.a.a<e<K, V>> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(23914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0931a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            a aVar = this.this$0;
            l.c(aVar, "");
            c.a.C0933a aVar2 = new c.a.C0933a(aVar);
            d.a(aVar, aVar2);
            return aVar2;
        }
    }

    @Override // com.bytedance.jedi.a.a.c
    public final t<List<p<K, V>>> b() {
        t<List<p<K, V>>> b2 = t.b((Object) d());
        l.a((Object) b2, "");
        return b2;
    }

    static {
        Covode.recordClassIndex(23913);
    }

    @Override // com.bytedance.jedi.a.a.c
    public final t<f<V>> a(K k2) {
        t<f<V>> b2 = t.b(g.a(b(k2)));
        l.a((Object) b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.a.a.c
    public final void a(K k2, V v) {
        b<?> bVar;
        b(k2, v);
        l.c(this, "");
        e a2 = com.bytedance.jedi.a.c.b.a(this);
        if (!(a2 instanceof com.bytedance.jedi.a.l.c)) {
            a2 = null;
        }
        com.bytedance.jedi.a.l.c cVar = (com.bytedance.jedi.a.l.c) a2;
        if (cVar != null) {
            if (h.f39083a.get(this) != null) {
                Map<?, b<?>> map = h.f39083a.get(this);
                if (map == null) {
                    l.a();
                }
                if (map.get(k2) != null) {
                    Map<?, b<?>> map2 = h.f39083a.get(this);
                    if (map2 == null) {
                        l.a();
                    }
                    b<?> bVar2 = map2.get(k2);
                    if (bVar2 != null) {
                        bVar = bVar2;
                        cVar.a(bVar);
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
            bVar = e.a.a(v.a(k2, v));
            cVar.a(bVar);
        }
    }
}
