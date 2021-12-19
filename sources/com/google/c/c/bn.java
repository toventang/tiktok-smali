package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.util.Comparator;
import java.util.SortedSet;

/* access modifiers changed from: package-private */
public final class bn {
    static {
        Covode.recordClassIndex(33479);
    }

    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return aw.f53956a;
        }
        return comparator;
    }

    public static boolean a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        k.a(comparator);
        k.a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof bm)) {
            return false;
        } else {
            comparator2 = ((bm) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
