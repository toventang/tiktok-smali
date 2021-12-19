package com.bytedance.jedi.a.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.c;
import com.bytedance.jedi.a.a.e;
import com.bytedance.jedi.a.a.h;
import com.bytedance.jedi.a.m.d;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g<K, V> implements d<p<? extends K, ? extends V>> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a<p<K, V>>> f39313a;

    static {
        Covode.recordClassIndex(24116);
    }

    public g(a<p<K, V>> aVar) {
        l.c(aVar, "");
        this.f39313a = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.jedi.a.l.d
    public final void b(b<p<K, V>> bVar) {
        Map a2;
        l.c(bVar, "");
        a<p<K, V>> aVar = this.f39313a.get();
        if (aVar != null) {
            l.a((Object) aVar, "");
            d.a(bVar, aVar);
            com.bytedance.jedi.a.a.g.a(aVar);
            try {
                Map<?, b<?>> map = h.f39083a.get(aVar);
                if (map == null) {
                    map = new LinkedHashMap<>();
                    h.f39083a.put(aVar, map);
                }
                h.a(map).put(bVar.a().getFirst(), bVar);
                if (aVar instanceof c) {
                    ((c) aVar).a(bVar.a().getFirst(), bVar.a().getSecond());
                } else if (aVar instanceof e) {
                    ((e) aVar).a(bVar.a().getFirst(), bVar.a().getSecond());
                } else {
                    throw new IllegalStateException("TraceableObserver should be ICache or IListCache".toString());
                }
                Map<?, b<?>> map2 = h.f39083a.get(aVar);
                if (!(map2 == null || (a2 = h.a(map2)) == null)) {
                    a2.remove(bVar.a().getFirst());
                }
            } finally {
                com.bytedance.jedi.a.a.g.b(aVar);
            }
        }
    }
}
