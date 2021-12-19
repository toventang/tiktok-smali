package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class az<T> implements Comparator<T> {
    static {
        Covode.recordClassIndex(33454);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    public <S extends T> az<S> a() {
        return new bh(this);
    }

    public static <T> az<T> a(Comparator<T> comparator) {
        if (comparator instanceof az) {
            return (az) comparator;
        }
        return new p(comparator);
    }

    public final <F> az<F> a(f<F, ? extends T> fVar) {
        return new j(fVar, this);
    }

    public final <E extends T> List<E> a(Iterable<E> iterable) {
        Object[] a2 = am.a(iterable);
        Arrays.sort(a2, this);
        return ap.a((Iterable) Arrays.asList(a2));
    }
}
