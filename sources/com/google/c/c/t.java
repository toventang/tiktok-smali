package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;

public abstract class t<E> extends u implements Collection<E> {
    static {
        Covode.recordClassIndex(33536);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Collection<E> c();

    protected t() {
    }

    public void clear() {
        c().clear();
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return c().iterator();
    }

    public int size() {
        return c().size();
    }

    public Object[] toArray() {
        return c().toArray();
    }

    @Override // java.util.Collection
    public boolean add(E e2) {
        return c().add(e2);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return c().addAll(collection);
    }

    public boolean contains(Object obj) {
        return c().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return c().containsAll(collection);
    }

    public boolean remove(Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return c().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return c().retainAll(collection);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) c().toArray(tArr);
    }
}
