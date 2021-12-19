package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class ei<E> extends dt<E> {

    /* renamed from: a  reason: collision with root package name */
    private final transient E f50819a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f50820b;

    static {
        Covode.recordClassIndex(31756);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return false;
    }

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dt
    public final boolean e() {
        if (this.f50820b != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dt
    public final dl<E> f() {
        return dl.zza(this.f50819a);
    }

    @Override // com.google.android.gms.internal.measurement.dt, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable, com.google.android.gms.internal.measurement.dm
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final el<E> zzb() {
        return new dz(this.f50819a);
    }

    @Override // com.google.android.gms.internal.measurement.dt
    public final int hashCode() {
        int i2 = this.f50820b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f50819a.hashCode();
        this.f50820b = hashCode;
        return hashCode;
    }

    public final String toString() {
        String obj = this.f50819a.toString();
        return new StringBuilder(String.valueOf(obj).length() + 2).append('[').append(obj).append(']').toString();
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean contains(Object obj) {
        return this.f50819a.equals(obj);
    }

    ei(E e2) {
        this.f50819a = (E) cl.a(e2);
    }

    ei(E e2, int i2) {
        this.f50819a = e2;
        this.f50820b = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int b(Object[] objArr, int i2) {
        objArr[i2] = this.f50819a;
        return i2 + 1;
    }
}
