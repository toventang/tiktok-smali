package com.bytedance.jedi.a.e.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.b;
import com.bytedance.jedi.a.g.b.a;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class d<K, V> extends b<K, V> {

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.b<? super V, ? extends Comparable<?>> f39113c;

    /* renamed from: d  reason: collision with root package name */
    private final b<K, V> f39114d;

    static {
        Covode.recordClassIndex(23966);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super V, ? extends java.lang.Comparable<?>>, h.f.a.b<V, java.lang.Comparable<?>> */
    @Override // com.bytedance.jedi.a.a.b
    public final h.f.a.b<V, Comparable<?>> d() {
        h.f.a.b bVar = (h.f.a.b<? super V, ? extends Comparable<?>>) this.f39113c;
        if (bVar == null) {
            return super.d();
        }
        return bVar;
    }

    private d() {
        a<K1, V1> d2 = com.bytedance.jedi.a.g.b.b.a().d();
        l.a((Object) d2, "");
        this.f39114d = new b<>(d2);
    }

    @Override // com.bytedance.jedi.a.a.b
    public final List<p<K, List<V>>> c() {
        b<K, V> bVar = this.f39114d;
        ArrayList arrayList = new ArrayList();
        ConcurrentMap<K, List<V>> b2 = bVar.f39111a.b();
        l.a((Object) b2, "");
        for (Map.Entry<K, List<V>> entry : b2.entrySet()) {
            arrayList.add(v.a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    @Override // com.bytedance.jedi.a.a.b
    public final List<V> b(K k2) {
        return this.f39114d.f39111a.a(k2);
    }

    @Override // com.bytedance.jedi.a.a.b
    public final void b(K k2, List<? extends V> list) {
        b<K, V> bVar = this.f39114d;
        if (list != null) {
            bVar.f39111a.a(k2, list);
        } else {
            bVar.f39111a.b(k2);
        }
    }
}
