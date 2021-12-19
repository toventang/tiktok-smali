package com.squareup.wire.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class ImmutableList<T> extends AbstractList<T> implements Serializable, RandomAccess {
    private final ArrayList<T> list;

    static {
        Covode.recordClassIndex(36144);
    }

    private Object writeReplace() {
        return Collections.unmodifiableList(this.list);
    }

    public final int size() {
        return this.list.size();
    }

    public final Object[] toArray() {
        return this.list.toArray();
    }

    @Override // java.util.List, java.util.AbstractList
    public final T get(int i2) {
        return this.list.get(i2);
    }

    ImmutableList(List<T> list2) {
        this.list = new ArrayList<>(list2);
    }
}
