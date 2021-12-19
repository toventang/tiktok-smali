package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.ListIterator;

/* access modifiers changed from: package-private */
public abstract class bp<F, T> extends bo<F, T> implements ListIterator<T> {
    static {
        Covode.recordClassIndex(33481);
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f54008b).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f54008b).nextIndex();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.c.bp<F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) a(((ListIterator) this.f54008b).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f54008b).previousIndex();
    }

    bp(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
