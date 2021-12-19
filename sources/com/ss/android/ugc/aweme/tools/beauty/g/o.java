package com.ss.android.ugc.aweme.tools.beauty.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public final class o<T> extends CopyOnWriteArrayList<T> {
    static {
        Covode.recordClassIndex(90922);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean add(T t) {
        remove(t);
        return super.add(t);
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final T remove(int i2) {
        return (T) removeAt(i2);
    }

    public final Object removeAt(int i2) {
        return super.remove(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean addAll(Collection<? extends T> collection) {
        l.d(collection, "");
        removeAll(collection);
        return super.addAll(collection);
    }
}
