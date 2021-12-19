package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class hg extends ey<Long> implements gs, Cif, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    static final hg f50977a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f50978b;

    /* renamed from: c  reason: collision with root package name */
    private int f50979c;

    public final int size() {
        return this.f50979c;
    }

    hg() {
        this(new long[10], 0);
    }

    static {
        Covode.recordClassIndex(31846);
        hg hgVar = new hg(new long[0], 0);
        f50977a = hgVar;
        hgVar.b();
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f50979c; i3++) {
            long j2 = this.f50978b[i3];
            i2 = (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.gs
    public final long b(int i2) {
        d(i2);
        return this.f50978b[i2];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Long l2) {
        a(l2.longValue());
        return true;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(b(i2));
    }

    private final void d(int i2) {
        if (i2 < 0 || i2 >= this.f50979c) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gs
    /* renamed from: c */
    public final gs a(int i2) {
        if (i2 >= this.f50979c) {
            return new hg(Arrays.copyOf(this.f50978b, i2), this.f50979c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f50978b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    private final String e(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.f50979c).toString();
    }

    public final void a(long j2) {
        c();
        int i2 = this.f50979c;
        long[] jArr = this.f50978b;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f50978b = jArr2;
        }
        long[] jArr3 = this.f50978b;
        int i3 = this.f50979c;
        this.f50979c = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return super.equals(obj);
        }
        hg hgVar = (hg) obj;
        if (this.f50979c != hgVar.f50979c) {
            return false;
        }
        long[] jArr = hgVar.f50978b;
        for (int i2 = 0; i2 < this.f50979c; i2++) {
            if (this.f50978b[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Long remove(int i2) {
        c();
        d(i2);
        long[] jArr = this.f50978b;
        long j2 = jArr[i2];
        int i3 = this.f50979c;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f50979c--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        gp.a(collection);
        if (!(collection instanceof hg)) {
            return super.addAll(collection);
        }
        hg hgVar = (hg) collection;
        int i2 = hgVar.f50979c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f50979c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f50978b;
            if (i4 > jArr.length) {
                this.f50978b = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(hgVar.f50978b, 0, this.f50978b, this.f50979c, hgVar.f50979c);
            this.f50979c = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey
    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f50979c; i2++) {
            if (obj.equals(Long.valueOf(this.f50978b[i2]))) {
                long[] jArr = this.f50978b;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f50979c - i2) - 1);
                this.f50979c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private hg(long[] jArr, int i2) {
        this.f50978b = jArr;
        this.f50979c = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Long set(int i2, Long l2) {
        long longValue = l2.longValue();
        c();
        d(i2);
        long[] jArr = this.f50978b;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            long[] jArr = this.f50978b;
            System.arraycopy(jArr, i3, jArr, i2, this.f50979c - i3);
            this.f50979c -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Long l2) {
        int i3;
        long longValue = l2.longValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f50979c)) {
            throw new IndexOutOfBoundsException(e(i2));
        }
        long[] jArr = this.f50978b;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f50978b, i2, jArr2, i2 + 1, this.f50979c - i2);
            this.f50978b = jArr2;
        }
        this.f50978b[i2] = longValue;
        this.f50979c++;
        this.modCount++;
    }
}
