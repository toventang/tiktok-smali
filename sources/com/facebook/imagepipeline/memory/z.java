package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.h.b;
import java.lang.ref.SoftReference;
import java.util.LinkedList;

final class z<V> extends f<V> {

    /* renamed from: f  reason: collision with root package name */
    private LinkedList<b<V>> f48116f = new LinkedList<>();

    static {
        Covode.recordClassIndex(29075);
    }

    @Override // com.facebook.imagepipeline.memory.f
    public final V b() {
        b<V> bVar = (b) this.f48081c.poll();
        T t = bVar.f47106a == null ? (V) null : bVar.f47106a.get();
        if (bVar.f47106a != null) {
            bVar.f47106a.clear();
            bVar.f47106a = null;
        }
        if (bVar.f47107b != null) {
            bVar.f47107b.clear();
            bVar.f47107b = null;
        }
        if (bVar.f47108c != null) {
            bVar.f47108c.clear();
            bVar.f47108c = null;
        }
        this.f48116f.add(bVar);
        return (V) t;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.imagepipeline.memory.f
    public final void a(V v) {
        b<V> poll = this.f48116f.poll();
        if (poll == null) {
            poll = new b<>();
        }
        poll.f47106a = new SoftReference<>(v);
        poll.f47107b = new SoftReference<>(v);
        poll.f47108c = new SoftReference<>(v);
        this.f48081c.add(poll);
    }

    public z(int i2, int i3) {
        super(i2, i3, 0, false);
    }
}
