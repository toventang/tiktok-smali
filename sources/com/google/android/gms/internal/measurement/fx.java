package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class fx extends ey<Double> implements Cif, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final fx f50891a;

    /* renamed from: b  reason: collision with root package name */
    private double[] f50892b;

    /* renamed from: c  reason: collision with root package name */
    private int f50893c;

    public final int size() {
        return this.f50893c;
    }

    fx() {
        this(new double[10], 0);
    }

    static {
        Covode.recordClassIndex(31803);
        fx fxVar = new fx(new double[0], 0);
        f50891a = fxVar;
        fxVar.b();
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f50893c; i3++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f50892b[i3]);
            i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Double d2) {
        a(d2.doubleValue());
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
        return Double.valueOf(this.f50892b[i2]);
    }

    private final void b(int i2) {
        if (i2 < 0 || i2 >= this.f50893c) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public final /* synthetic */ gv a(int i2) {
        if (i2 >= this.f50893c) {
            return new fx(Arrays.copyOf(this.f50892b, i2), this.f50893c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f50892b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    private final String c(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.f50893c).toString();
    }

    public final void a(double d2) {
        c();
        int i2 = this.f50893c;
        double[] dArr = this.f50892b;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f50892b = dArr2;
        }
        double[] dArr3 = this.f50892b;
        int i3 = this.f50893c;
        this.f50893c = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return super.equals(obj);
        }
        fx fxVar = (fx) obj;
        if (this.f50893c != fxVar.f50893c) {
            return false;
        }
        double[] dArr = fxVar.f50892b;
        for (int i2 = 0; i2 < this.f50893c; i2++) {
            if (Double.doubleToLongBits(this.f50892b[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Double remove(int i2) {
        c();
        b(i2);
        double[] dArr = this.f50892b;
        double d2 = dArr[i2];
        int i3 = this.f50893c;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f50893c--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        gp.a(collection);
        if (!(collection instanceof fx)) {
            return super.addAll(collection);
        }
        fx fxVar = (fx) collection;
        int i2 = fxVar.f50893c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f50893c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f50892b;
            if (i4 > dArr.length) {
                this.f50892b = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(fxVar.f50892b, 0, this.f50892b, this.f50893c, fxVar.f50893c);
            this.f50893c = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey
    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f50893c; i2++) {
            if (obj.equals(Double.valueOf(this.f50892b[i2]))) {
                double[] dArr = this.f50892b;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f50893c - i2) - 1);
                this.f50893c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private fx(double[] dArr, int i2) {
        this.f50892b = dArr;
        this.f50893c = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Double set(int i2, Double d2) {
        double doubleValue = d2.doubleValue();
        c();
        b(i2);
        double[] dArr = this.f50892b;
        double d3 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d3);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            double[] dArr = this.f50892b;
            System.arraycopy(dArr, i3, dArr, i2, this.f50893c - i3);
            this.f50893c -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Double d2) {
        int i3;
        double doubleValue = d2.doubleValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f50893c)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        double[] dArr = this.f50892b;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f50892b, i2, dArr2, i2 + 1, this.f50893c - i2);
            this.f50892b = dArr2;
        }
        this.f50892b[i2] = doubleValue;
        this.f50893c++;
        this.modCount++;
    }
}
