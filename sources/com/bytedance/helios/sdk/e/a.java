package com.bytedance.helios.sdk.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class a<T> extends ConcurrentLinkedQueue<T> {
    private final int capacity;
    private final b<T> fixSizeLinkedListListener;

    static {
        Covode.recordClassIndex(17951);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.Queue, java.util.concurrent.ConcurrentLinkedQueue
    public final synchronized boolean offer(T t) {
        boolean offer;
        b<T> bVar;
        MethodCollector.i(2734);
        if (size() >= this.capacity && (bVar = this.fixSizeLinkedListListener) != null) {
            bVar.a(this);
        }
        if (size() + 1 > this.capacity) {
            super.poll();
        }
        offer = super.offer(t);
        b<T> bVar2 = this.fixSizeLinkedListListener;
        if (bVar2 != null) {
            bVar2.a(this, t, offer);
        }
        MethodCollector.o(2734);
        return offer;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, b<T> bVar, Collection<? extends T> collection) {
        super(collection);
        l.c(collection, "");
        this.capacity = i2;
        this.fixSizeLinkedListListener = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, b bVar, Collection collection, int i3, g gVar) {
        this(i2, (i3 & 2) != 0 ? null : bVar, (i3 & 4) != 0 ? z.INSTANCE : collection);
    }
}
