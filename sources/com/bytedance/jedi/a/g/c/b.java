package com.bytedance.jedi.a.g.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.g.a.c;
import java.util.Collection;
import java.util.Iterator;

public final class b {
    static {
        Covode.recordClassIndex(24054);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        c.a(collection);
        c.a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
