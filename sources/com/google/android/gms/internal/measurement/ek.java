package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.ListIterator;

public abstract class ek<E> extends el<E> implements ListIterator<E> {
    static {
        Covode.recordClassIndex(31758);
    }

    protected ek() {
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
