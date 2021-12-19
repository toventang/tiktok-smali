package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public abstract class ey<E> extends AbstractList<E> implements gv<E> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f50831a = true;

    static {
        Covode.recordClassIndex(31773);
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public final void b() {
        this.f50831a = false;
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public boolean a() {
        return this.f50831a;
    }

    ey() {
    }

    public void clear() {
        c();
        super.clear();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.f50831a) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    @Override // java.util.List, java.util.AbstractList
    public E remove(int i2) {
        c();
        return (E) super.remove(i2);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(E e2) {
        c();
        return super.add(e2);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        c();
        return super.addAll(collection);
    }

    @Override // java.util.List
    public boolean remove(Object obj) {
        c();
        return super.remove(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i2, E e2) {
        c();
        super.add(i2, e2);
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i2, Collection<? extends E> collection) {
        c();
        return super.addAll(i2, collection);
    }

    @Override // java.util.List, java.util.AbstractList
    public E set(int i2, E e2) {
        c();
        return (E) super.set(i2, e2);
    }
}
