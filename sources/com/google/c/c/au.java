package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Set;

public interface au<E> extends Collection<E> {

    public interface a<E> {
        static {
            Covode.recordClassIndex(33443);
        }

        E a();

        int b();
    }

    static {
        Covode.recordClassIndex(33442);
    }

    int add(E e2, int i2);

    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj);

    Set<E> elementSet();

    Set<a<E>> entrySet();

    int remove(Object obj, int i2);

    boolean remove(Object obj);

    int setCount(E e2, int i2);

    boolean setCount(E e2, int i2, int i3);

    int size();
}
