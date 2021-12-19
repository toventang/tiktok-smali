package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class eh<E> extends dt<E> {

    /* renamed from: a  reason: collision with root package name */
    static final eh<Object> f50813a = new eh<>(new Object[0], 0, null, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    private final transient Object[] f50814b;

    /* renamed from: c  reason: collision with root package name */
    private final transient Object[] f50815c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f50816d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f50817e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f50818f;

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
    @Override // com.google.android.gms.internal.measurement.dt
    public final boolean e() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final Object[] a() {
        return this.f50814b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int c() {
        return this.f50818f;
    }

    @Override // com.google.android.gms.internal.measurement.dt
    public final int hashCode() {
        return this.f50817e;
    }

    public final int size() {
        return this.f50818f;
    }

    @Override // com.google.android.gms.internal.measurement.dt, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable, com.google.android.gms.internal.measurement.dm
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dt
    public final dl<E> f() {
        return dl.a(this.f50814b, this.f50818f);
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final el<E> zzb() {
        return (el) zzc().iterator();
    }

    static {
        Covode.recordClassIndex(31755);
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean contains(Object obj) {
        Object[] objArr = this.f50815c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = dj.a(obj);
        while (true) {
            int i2 = a2 & this.f50816d;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int b(Object[] objArr, int i2) {
        System.arraycopy(this.f50814b, 0, objArr, i2, this.f50818f);
        return i2 + this.f50818f;
    }

    eh(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f50814b = objArr;
        this.f50815c = objArr2;
        this.f50816d = i3;
        this.f50817e = i2;
        this.f50818f = i4;
    }
}
