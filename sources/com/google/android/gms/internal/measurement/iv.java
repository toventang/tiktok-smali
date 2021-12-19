package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class iv implements Iterator<Object> {
    static {
        Covode.recordClassIndex(31888);
    }

    public final boolean hasNext() {
        return false;
    }

    iv() {
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
