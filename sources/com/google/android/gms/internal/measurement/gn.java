package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class gn extends ey<Integer> implements gt, Cif, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    static final gn f50954a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f50955b;

    /* renamed from: c  reason: collision with root package name */
    private int f50956c;

    public final int size() {
        return this.f50956c;
    }

    gn() {
        this(new int[10], 0);
    }

    static {
        Covode.recordClassIndex(31826);
        gn gnVar = new gn(new int[0], 0);
        f50954a = gnVar;
        gnVar.b();
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f50956c; i3++) {
            i2 = (i2 * 31) + this.f50955b[i3];
        }
        return i2;
    }

    public final int c(int i2) {
        e(i2);
        return this.f50955b[i2];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Integer num) {
        d(num.intValue());
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
        return Integer.valueOf(c(i2));
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f50956c) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gt
    /* renamed from: b */
    public final gt a(int i2) {
        if (i2 >= this.f50956c) {
            return new gn(Arrays.copyOf(this.f50955b, i2), this.f50956c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f50955b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    private final String f(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.f50956c).toString();
    }

    public final void d(int i2) {
        c();
        int i3 = this.f50956c;
        int[] iArr = this.f50955b;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f50955b = iArr2;
        }
        int[] iArr3 = this.f50955b;
        int i4 = this.f50956c;
        this.f50956c = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn)) {
            return super.equals(obj);
        }
        gn gnVar = (gn) obj;
        if (this.f50956c != gnVar.f50956c) {
            return false;
        }
        int[] iArr = gnVar.f50955b;
        for (int i2 = 0; i2 < this.f50956c; i2++) {
            if (this.f50955b[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Integer remove(int i2) {
        c();
        e(i2);
        int[] iArr = this.f50955b;
        int i3 = iArr[i2];
        int i4 = this.f50956c;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f50956c--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        gp.a(collection);
        if (!(collection instanceof gn)) {
            return super.addAll(collection);
        }
        gn gnVar = (gn) collection;
        int i2 = gnVar.f50956c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f50956c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f50955b;
            if (i4 > iArr.length) {
                this.f50955b = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(gnVar.f50955b, 0, this.f50955b, this.f50956c, gnVar.f50956c);
            this.f50956c = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey
    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f50956c; i2++) {
            if (obj.equals(Integer.valueOf(this.f50955b[i2]))) {
                int[] iArr = this.f50955b;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f50956c - i2) - 1);
                this.f50956c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private gn(int[] iArr, int i2) {
        this.f50955b = iArr;
        this.f50956c = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Integer set(int i2, Integer num) {
        int intValue = num.intValue();
        c();
        e(i2);
        int[] iArr = this.f50955b;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            int[] iArr = this.f50955b;
            System.arraycopy(iArr, i3, iArr, i2, this.f50956c - i3);
            this.f50956c -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Integer num) {
        int i3;
        int intValue = num.intValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f50956c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        int[] iArr = this.f50955b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f50955b, i2, iArr2, i2 + 1, this.f50956c - i2);
            this.f50955b = iArr2;
        }
        this.f50955b[i2] = intValue;
        this.f50956c++;
        this.modCount++;
    }
}
