package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.RandomAccess;

final class ih<E> extends ey<E> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    static final ih<Object> f51015a;

    /* renamed from: b  reason: collision with root package name */
    private E[] f51016b;

    /* renamed from: c  reason: collision with root package name */
    private int f51017c;

    public final int size() {
        return this.f51017c;
    }

    ih() {
        this(new Object[10], 0);
    }

    static {
        Covode.recordClassIndex(31874);
        ih<Object> ihVar = new ih<>(new Object[0], 0);
        f51015a = ihVar;
        ihVar.b();
    }

    @Override // java.util.List, java.util.AbstractList
    public final E get(int i2) {
        b(i2);
        return this.f51016b[i2];
    }

    private final void b(int i2) {
        if (i2 < 0 || i2 >= this.f51017c) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public final /* synthetic */ gv a(int i2) {
        if (i2 >= this.f51017c) {
            return new ih(Arrays.copyOf(this.f51016b, i2), this.f51017c);
        }
        throw new IllegalArgumentException();
    }

    private final String c(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.f51017c).toString();
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection, java.util.AbstractList
    public final boolean add(E e2) {
        c();
        int i2 = this.f51017c;
        E[] eArr = this.f51016b;
        if (i2 == eArr.length) {
            this.f51016b = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f51016b;
        int i3 = this.f51017c;
        this.f51017c = i3 + 1;
        eArr2[i3] = e2;
        this.modCount++;
        return true;
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final E remove(int i2) {
        c();
        b(i2);
        E[] eArr = this.f51016b;
        E e2 = eArr[i2];
        int i3 = this.f51017c;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f51017c--;
        this.modCount++;
        return e2;
    }

    private ih(E[] eArr, int i2) {
        this.f51016b = eArr;
        this.f51017c = i2;
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final E set(int i2, E e2) {
        c();
        b(i2);
        E[] eArr = this.f51016b;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final void add(int i2, E e2) {
        int i3;
        c();
        if (i2 < 0 || i2 > (i3 = this.f51017c)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        E[] eArr = this.f51016b;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[(((i3 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f51016b, i2, eArr2, i2 + 1, this.f51017c - i2);
            this.f51016b = eArr2;
        }
        this.f51016b[i2] = e2;
        this.f51017c++;
        this.modCount++;
    }
}
