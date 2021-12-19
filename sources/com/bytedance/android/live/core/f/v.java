package com.bytedance.android.live.core.f;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class v<T> extends CopyOnWriteArrayList<T> {
    static {
        Covode.recordClassIndex(4669);
    }

    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean add(T t) {
        if (t != null && !contains(t)) {
            return super.add(t);
        }
        return false;
    }

    @Override // java.util.List, java.util.concurrent.CopyOnWriteArrayList
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return super.remove(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.android.live.core.f.v<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection, java.util.concurrent.CopyOnWriteArrayList
    public final boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return true;
    }
}
