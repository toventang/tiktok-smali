package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class ec<E> extends dl<E> {

    /* renamed from: a  reason: collision with root package name */
    static final dl<Object> f50802a = new ec(new Object[0], 0);

    /* renamed from: b  reason: collision with root package name */
    private final transient Object[] f50803b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f50804c;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int b() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final Object[] a() {
        return this.f50803b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int c() {
        return this.f50804c;
    }

    public final int size() {
        return this.f50804c;
    }

    static {
        Covode.recordClassIndex(31750);
    }

    @Override // java.util.List
    public final E get(int i2) {
        cl.a(i2, this.f50804c);
        return (E) this.f50803b[i2];
    }

    ec(Object[] objArr, int i2) {
        this.f50803b = objArr;
        this.f50804c = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dl, com.google.android.gms.internal.measurement.dm
    public final int b(Object[] objArr, int i2) {
        System.arraycopy(this.f50803b, 0, objArr, i2, this.f50804c);
        return i2 + this.f50804c;
    }
}
