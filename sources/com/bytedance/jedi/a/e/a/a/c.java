package com.bytedance.jedi.a.e.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.a;
import com.bytedance.jedi.a.g.b.b;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class c<K, V> extends a<K, V> {

    /* renamed from: c  reason: collision with root package name */
    private final a<K, V> f39112c;

    static {
        Covode.recordClassIndex(23965);
    }

    public /* synthetic */ c() {
        this(-1);
    }

    @Override // com.bytedance.jedi.a.a.a
    public final void e() {
        this.f39112c.f39110a.a();
    }

    @Override // com.bytedance.jedi.a.a.a
    public final List<p<K, V>> d() {
        a<K, V> aVar = this.f39112c;
        ArrayList arrayList = new ArrayList();
        ConcurrentMap<K, V> b2 = aVar.f39110a.b();
        l.a((Object) b2, "");
        for (Map.Entry<K, V> entry : b2.entrySet()) {
            arrayList.add(v.a(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // com.bytedance.jedi.a.a.a
    public V b(K k2) {
        return this.f39112c.f39110a.a(k2);
    }

    public c(long j2) {
        com.bytedance.jedi.a.g.b.a<K1, V1> d2 = b.a().d();
        l.a((Object) d2, "");
        this.f39112c = new a<>(d2);
    }

    @Override // com.bytedance.jedi.a.a.a
    public final void b(K k2, V v) {
        a<K, V> aVar = this.f39112c;
        if (v != null) {
            aVar.f39110a.a(k2, v);
        } else {
            aVar.f39110a.b(k2);
        }
    }
}
