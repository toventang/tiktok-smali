package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

final class ef extends dl<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final transient Object[] f50808a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f50809b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f50810c;

    static {
        Covode.recordClassIndex(31753);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return true;
    }

    public final int size() {
        return this.f50810c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        cl.a(i2, this.f50810c);
        return this.f50808a[(i2 * 2) + this.f50809b];
    }

    ef(Object[] objArr, int i2, int i3) {
        this.f50808a = objArr;
        this.f50809b = i2;
        this.f50810c = i3;
    }
}
