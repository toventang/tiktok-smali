package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class dl<E> extends dm<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final ek<Object> f50778a = new Cdo(ec.f50802a, 0);

    @Override // com.google.android.gms.internal.measurement.dm
    public final dl<E> zzc() {
        return this;
    }

    dl() {
    }

    public static <E> dl<E> zza() {
        return (dl<E>) ec.f50802a;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable, com.google.android.gms.internal.measurement.dm
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final el<E> zzb() {
        return (el) listIterator();
    }

    static {
        Covode.recordClassIndex(31732);
    }

    public dl<E> zzd() {
        if (size() <= 1) {
            return this;
        }
        return new dn(this);
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (((i2 * 31) + get(i3).hashCode()) ^ -1) ^ -1;
        }
        return i2;
    }

    @Override // java.util.List
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public static <E> dl<E> zza(E e2) {
        Object[] objArr = {e2};
        int i2 = 0;
        do {
            ea.a(objArr[0], 0);
            i2++;
        } while (i2 <= 0);
        return a(objArr, 1);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i2) {
        cl.b(i2, size());
        if (isEmpty()) {
            return f50778a;
        }
        return new Cdo(this, i2);
    }

    public boolean equals(Object obj) {
        if (obj == cl.a(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (ck.a(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e2 = get(i3);
                        i3++;
                        if (!ck.a(e2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    static <E> dl<E> a(Object[] objArr, int i2) {
        return i2 == 0 ? (dl<E>) ec.f50802a : new ec(objArr, i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public int b(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    /* renamed from: zza */
    public dl<E> subList(int i2, int i3) {
        cl.a(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        return i4 == 0 ? (dl<E>) ec.f50802a : new dq(this, i2, i4);
    }
}
