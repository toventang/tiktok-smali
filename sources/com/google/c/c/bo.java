package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.Iterator;

public abstract class bo<F, T> implements Iterator<T> {

    /* renamed from: b  reason: collision with root package name */
    final Iterator<? extends F> f54008b;

    static {
        Covode.recordClassIndex(33480);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f2);

    public final boolean hasNext() {
        return this.f54008b.hasNext();
    }

    public final void remove() {
        this.f54008b.remove();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.bo<F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final T next() {
        return (T) a(this.f54008b.next());
    }

    bo(Iterator<? extends F> it) {
        this.f54008b = (Iterator) k.a(it);
    }
}
