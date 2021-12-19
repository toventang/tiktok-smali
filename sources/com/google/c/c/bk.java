package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class bk {
    static {
        Covode.recordClassIndex(33475);
    }

    /* access modifiers changed from: package-private */
    public static abstract class a<E> extends AbstractSet<E> {
        static {
            Covode.recordClassIndex(33476);
        }

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) k.a(collection));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.AbstractSet, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            k.a(collection);
            if (collection instanceof au) {
                collection = ((au) collection).elementSet();
            }
            if (!(collection instanceof Set) || collection.size() <= size()) {
                return bk.a((Set<?>) this, collection.iterator());
            }
            Iterator<E> it = iterator();
            k.a(collection);
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    public static <E> Set<E> a() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    static int a(Set<?> set) {
        int i2;
        int i3 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i3 = ((i3 + i2) ^ -1) ^ -1;
        }
        return i3;
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
