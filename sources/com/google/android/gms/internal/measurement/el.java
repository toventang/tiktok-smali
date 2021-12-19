package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

public abstract class el<E> implements Iterator<E> {
    static {
        Covode.recordClassIndex(31759);
    }

    protected el() {
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
