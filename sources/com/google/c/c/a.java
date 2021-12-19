package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.NoSuchElementException;

abstract class a<E> extends bs<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f53856a;

    /* renamed from: b  reason: collision with root package name */
    private int f53857b;

    static {
        Covode.recordClassIndex(33350);
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i2);

    public final int nextIndex() {
        return this.f53857b;
    }

    public final boolean hasPrevious() {
        if (this.f53857b > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.f53857b - 1;
    }

    public final boolean hasNext() {
        if (this.f53857b < this.f53856a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i2 = this.f53857b;
            this.f53857b = i2 + 1;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i2 = this.f53857b - 1;
            this.f53857b = i2;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    protected a(int i2, int i3) {
        k.b(i3, i2);
        this.f53856a = i2;
        this.f53857b = i3;
    }
}
