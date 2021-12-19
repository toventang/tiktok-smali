package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.ListIterator;

public abstract class bs<E> extends br<E> implements ListIterator<E> {
    static {
        Covode.recordClassIndex(33484);
    }

    protected bs() {
    }

    @Override // java.util.ListIterator
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}
