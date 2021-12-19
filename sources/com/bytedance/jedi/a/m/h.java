package com.bytedance.jedi.a.m;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class h<K, V> extends WeakReference<V> {

    /* renamed from: a  reason: collision with root package name */
    public final K f39355a;

    static {
        Covode.recordClassIndex(24138);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(K k2, V v, ReferenceQueue<V> referenceQueue) {
        super(v, referenceQueue);
        l.c(referenceQueue, "");
        this.f39355a = k2;
    }
}
