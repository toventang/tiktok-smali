package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final class dq extends dl<E> {

    /* renamed from: a  reason: collision with root package name */
    private final transient int f50786a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f50787b;
    private final /* synthetic */ dl zzc;

    static {
        Covode.recordClassIndex(31737);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return true;
    }

    public final int size() {
        return this.f50787b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final Object[] a() {
        return this.zzc.a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int b() {
        return this.zzc.b() + this.f50786a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int c() {
        return this.zzc.b() + this.f50786a + this.f50787b;
    }

    @Override // java.util.List
    public final E get(int i2) {
        cl.a(i2, this.f50787b);
        return (E) this.zzc.get(i2 + this.f50786a);
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.dl
    public final /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.dl
    public final dl<E> zza(int i2, int i3) {
        cl.a(i2, i3, this.f50787b);
        dl dlVar = this.zzc;
        int i4 = this.f50786a;
        return (dl) dlVar.subList(i2 + i4, i3 + i4);
    }

    dq(dl dlVar, int i2, int i3) {
        this.zzc = dlVar;
        this.f50786a = i2;
        this.f50787b = i3;
    }
}
