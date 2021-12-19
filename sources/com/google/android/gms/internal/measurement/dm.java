package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class dm<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f50779a = new Object[0];

    /* access modifiers changed from: package-private */
    public Object[] a() {
        return null;
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public abstract boolean d();

    /* renamed from: zzb */
    public abstract el<E> iterator();

    dm() {
    }

    /* access modifiers changed from: package-private */
    public int b() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f50779a);
    }

    static {
        Covode.recordClassIndex(31733);
    }

    public dl<E> zzc() {
        if (isEmpty()) {
            return dl.zza();
        }
        Object[] array = toArray();
        return dl.a(array, array.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        cl.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] a2 = a();
            if (a2 != null) {
                return (T[]) Arrays.copyOfRange(a2, b(), c(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i2) {
        Iterator it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }
}
