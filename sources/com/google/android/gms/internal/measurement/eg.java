package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

final class eg<K> extends dt<K> {

    /* renamed from: a  reason: collision with root package name */
    private final transient dp<K, ?> f50811a;

    /* renamed from: b  reason: collision with root package name */
    private final transient dl<K> f50812b;

    static {
        Covode.recordClassIndex(31754);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.dt, com.google.android.gms.internal.measurement.dm
    public final dl<K> zzc() {
        return this.f50812b;
    }

    @Override // com.google.android.gms.internal.measurement.dt, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable, com.google.android.gms.internal.measurement.dm
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.f50811a.size();
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final el<K> zzb() {
        return (el) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean contains(Object obj) {
        if (this.f50811a.get(obj) != null) {
            return true;
        }
        return false;
    }

    eg(dp<K, ?> dpVar, dl<K> dlVar) {
        this.f50811a = dpVar;
        this.f50812b = dlVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int b(Object[] objArr, int i2) {
        return zzc().b(objArr, i2);
    }
}
