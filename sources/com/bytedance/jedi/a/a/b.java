package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.e;
import com.bytedance.jedi.a.c.d;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.c.g;
import com.bytedance.jedi.a.l.c;
import com.bytedance.jedi.a.l.e;
import f.a.t;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.p;
import h.v;
import h.w;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public abstract class b<K, V> implements e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39062a = {new y(ab.a(b.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;")};

    /* renamed from: c  reason: collision with root package name */
    private final h f39063c = h.i.a((h.f.a.a) new C0932b(this));

    public final e<K, List<V>> a() {
        return (e) this.f39063c.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract List<V> b(K k2);

    /* access modifiers changed from: protected */
    public abstract void b(K k2, List<? extends V> list);

    /* access modifiers changed from: protected */
    public abstract List<p<K, List<V>>> c();

    public h.f.a.b<V, Comparable<?>> d() {
        return null;
    }

    /* renamed from: com.bytedance.jedi.a.a.b$b  reason: collision with other inner class name */
    static final class C0932b extends m implements h.f.a.a<e<K, List<? extends V>>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(23917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0932b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            b bVar = this.this$0;
            l.c(bVar, "");
            e.a.C0936a aVar = new e.a.C0936a(bVar);
            d.a(bVar, aVar);
            return aVar;
        }
    }

    @Override // com.bytedance.jedi.a.a.e
    public final t<List<p<K, List<V>>>> b() {
        t<List<p<K, List<V>>>> b2 = t.b((Object) c());
        l.a((Object) b2, "");
        return b2;
    }

    static {
        Covode.recordClassIndex(23915);
    }

    @Override // com.bytedance.jedi.a.a.e
    public final t<f<List<V>>> a(K k2) {
        t<f<List<V>>> b2 = t.b(g.a(b(k2)));
        l.a((Object) b2, "");
        return b2;
    }

    public static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f39064a;

        static {
            Covode.recordClassIndex(23916);
        }

        public a(h.f.a.b bVar) {
            this.f39064a = bVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((Comparable) this.f39064a.invoke(t), (Comparable) this.f39064a.invoke(t2));
        }
    }

    @Override // com.bytedance.jedi.a.a.e
    public final void a(K k2, List<? extends V> list) {
        com.bytedance.jedi.a.l.b<V> bVar;
        List<? extends V> a2;
        h.f.a.b<V, Comparable<?>> d2 = d();
        c cVar = null;
        if (!(d2 == null || list == null || (a2 = n.a((Iterable) list, (Comparator) new a(d2))) == null)) {
            list = a2;
        }
        b(k2, list);
        l.c(this, "");
        com.bytedance.jedi.a.c.e a3 = com.bytedance.jedi.a.c.b.a(this);
        if (a3 instanceof c) {
            cVar = a3;
        }
        c cVar2 = cVar;
        if (cVar2 != null) {
            if (h.f39083a.get(this) != null) {
                Map<?, com.bytedance.jedi.a.l.b<?>> map = h.f39083a.get(this);
                if (map == null) {
                    l.a();
                }
                if (map.get(k2) != null) {
                    Map<?, com.bytedance.jedi.a.l.b<?>> map2 = h.f39083a.get(this);
                    if (map2 == null) {
                        l.a();
                    }
                    com.bytedance.jedi.a.l.b<?> bVar2 = map2.get(k2);
                    if (bVar2 != null) {
                        bVar = bVar2.a(v.a(k2, list));
                        cVar2.a(bVar);
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
            bVar = e.a.a(v.a(k2, list));
            cVar2.a(bVar);
        }
    }
}
