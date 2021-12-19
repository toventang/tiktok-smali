package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

abstract class ct<E> extends ek<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f50751a;

    /* renamed from: b  reason: collision with root package name */
    private int f50752b;

    static {
        Covode.recordClassIndex(31713);
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i2);

    public final int nextIndex() {
        return this.f50752b;
    }

    public final boolean hasPrevious() {
        if (this.f50752b > 0) {
            return true;
        }
        return false;
    }

    public final int previousIndex() {
        return this.f50752b - 1;
    }

    public final boolean hasNext() {
        if (this.f50752b < this.f50751a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i2 = this.f50752b;
            this.f50752b = i2 + 1;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i2 = this.f50752b - 1;
            this.f50752b = i2;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    protected ct(int i2, int i3) {
        cl.b(i3, i2);
        this.f50751a = i2;
        this.f50752b = i3;
    }
}
