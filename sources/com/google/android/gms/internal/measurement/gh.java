package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class gh extends ey<Float> implements Cif, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private static final gh f50924a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f50925b;

    /* renamed from: c  reason: collision with root package name */
    private int f50926c;

    public final int size() {
        return this.f50926c;
    }

    gh() {
        this(new float[10], 0);
    }

    static {
        Covode.recordClassIndex(31815);
        gh ghVar = new gh(new float[0], 0);
        f50924a = ghVar;
        ghVar.b();
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f50926c; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f50925b[i3]);
        }
        return i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection, java.util.AbstractList
    public final /* synthetic */ boolean add(Float f2) {
        a(f2.floatValue());
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
        return Float.valueOf(this.f50925b[i2]);
    }

    private final void b(int i2) {
        if (i2 < 0 || i2 >= this.f50926c) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gv
    public final /* synthetic */ gv a(int i2) {
        if (i2 >= this.f50926c) {
            return new gh(Arrays.copyOf(this.f50925b, i2), this.f50926c);
        }
        throw new IllegalArgumentException();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f50925b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    private final String c(int i2) {
        return new StringBuilder(35).append("Index:").append(i2).append(", Size:").append(this.f50926c).toString();
    }

    public final void a(float f2) {
        c();
        int i2 = this.f50926c;
        float[] fArr = this.f50925b;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f50925b = fArr2;
        }
        float[] fArr3 = this.f50925b;
        int i3 = this.f50926c;
        this.f50926c = i3 + 1;
        fArr3[i3] = f2;
    }

    @Override // com.google.android.gms.internal.measurement.ey
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return super.equals(obj);
        }
        gh ghVar = (gh) obj;
        if (this.f50926c != ghVar.f50926c) {
            return false;
        }
        float[] fArr = ghVar.f50925b;
        for (int i2 = 0; i2 < this.f50926c; i2++) {
            if (Float.floatToIntBits(this.f50925b[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Float remove(int i2) {
        c();
        b(i2);
        float[] fArr = this.f50925b;
        float f2 = fArr[i2];
        int i3 = this.f50926c;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f50926c--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.measurement.ey, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        gp.a(collection);
        if (!(collection instanceof gh)) {
            return super.addAll(collection);
        }
        gh ghVar = (gh) collection;
        int i2 = ghVar.f50926c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f50926c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f50925b;
            if (i4 > fArr.length) {
                this.f50925b = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(ghVar.f50925b, 0, this.f50925b, this.f50926c, ghVar.f50926c);
            this.f50926c = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.ey
    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f50926c; i2++) {
            if (obj.equals(Float.valueOf(this.f50925b[i2]))) {
                float[] fArr = this.f50925b;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f50926c - i2) - 1);
                this.f50926c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private gh(float[] fArr, int i2) {
        this.f50925b = fArr;
        this.f50926c = i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ Float set(int i2, Float f2) {
        float floatValue = f2.floatValue();
        c();
        b(i2);
        float[] fArr = this.f50925b;
        float f3 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f3);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            float[] fArr = this.f50925b;
            System.arraycopy(fArr, i3, fArr, i2, this.f50926c - i3);
            this.f50926c -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.measurement.ey, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Float f2) {
        int i3;
        float floatValue = f2.floatValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f50926c)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        float[] fArr = this.f50925b;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f50925b, i2, fArr2, i2 + 1, this.f50926c - i2);
            this.f50925b = fArr2;
        }
        this.f50925b[i2] = floatValue;
        this.f50926c++;
        this.modCount++;
    }
}
