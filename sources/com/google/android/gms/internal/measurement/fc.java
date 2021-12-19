package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class fc extends ey<Boolean> implements Cif, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final fc f50853a;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f50854b;

    /* renamed from: c  reason: collision with root package name */
    private int f50855c;

    public final int size() {
        return this.f50855c;
    }

    fc() {
        this(new boolean[10], 0);
    }

    static {
        Covode.recordClassIndex(31780);
        fc fcVar = new fc(new boolean[0], 0);
        f50853a = fcVar;
        fcVar.b();
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f50855c; i3++) {
            i2 = (i2 * 31) + gp.a(this.f50854b[i3]);
        }
        return i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Boolean bool) {
        a(bool.booleanValue());
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
        b(i2);
        return Boolean.valueOf(this.f50854b[i2]);
    }

    private final void b(int i2) {
        if (i2 < 0 || i2 >= this.f50855c) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public final /* synthetic */ gv a(int i2) {
        if (i2 >= this.f50855c) {
            return new fc(Arrays.copyOf(this.f50854b, i2), this.f50855c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f50854b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    private final String c(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.f50855c).toString();
    }

    public final void a(boolean z) {
        c();
        int i2 = this.f50855c;
        boolean[] zArr = this.f50854b;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f50854b = zArr2;
        }
        boolean[] zArr3 = this.f50854b;
        int i3 = this.f50855c;
        this.f50855c = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return super.equals(obj);
        }
        fc fcVar = (fc) obj;
        if (this.f50855c != fcVar.f50855c) {
            return false;
        }
        boolean[] zArr = fcVar.f50854b;
        for (int i2 = 0; i2 < this.f50855c; i2++) {
            if (this.f50854b[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Boolean remove(int i2) {
        c();
        b(i2);
        boolean[] zArr = this.f50854b;
        boolean z = zArr[i2];
        int i3 = this.f50855c;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f50855c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        gp.a(collection);
        if (!(collection instanceof fc)) {
            return super.addAll(collection);
        }
        fc fcVar = (fc) collection;
        int i2 = fcVar.f50855c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f50855c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f50854b;
            if (i4 > zArr.length) {
                this.f50854b = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(fcVar.f50854b, 0, this.f50854b, this.f50855c, fcVar.f50855c);
            this.f50855c = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey
    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f50855c; i2++) {
            if (obj.equals(Boolean.valueOf(this.f50854b[i2]))) {
                boolean[] zArr = this.f50854b;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f50855c - i2) - 1);
                this.f50855c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private fc(boolean[] zArr, int i2) {
        this.f50854b = zArr;
        this.f50855c = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Boolean set(int i2, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        c();
        b(i2);
        boolean[] zArr = this.f50854b;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            boolean[] zArr = this.f50854b;
            System.arraycopy(zArr, i3, zArr, i2, this.f50855c - i3);
            this.f50855c -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Boolean bool) {
        int i3;
        boolean booleanValue = bool.booleanValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f50855c)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        boolean[] zArr = this.f50854b;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f50854b, i2, zArr2, i2 + 1, this.f50855c - i2);
            this.f50854b = zArr2;
        }
        this.f50854b[i2] = booleanValue;
        this.f50855c++;
        this.modCount++;
    }
}
