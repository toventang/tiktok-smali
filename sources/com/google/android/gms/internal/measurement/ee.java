package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

final class ee<K, V> extends dt<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    final transient Object[] f50805a;

    /* renamed from: b  reason: collision with root package name */
    final transient int f50806b;

    /* renamed from: c  reason: collision with root package name */
    private final transient dp<K, V> f50807c;

    static {
        Covode.recordClassIndex(31752);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean d() {
        return true;
    }

    public final int size() {
        return this.f50806b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dt
    public final dl<Map.Entry<K, V>> f() {
        return new ed(this);
    }

    @Override // com.google.android.gms.internal.measurement.dt, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable, com.google.android.gms.internal.measurement.dm
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final el<Map.Entry<K, V>> zzb() {
        return (el) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.dm
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f50807c.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.dm
    public final int b(Object[] objArr, int i2) {
        return zzc().b(objArr, i2);
    }

    ee(dp<K, V> dpVar, Object[] objArr, int i2) {
        this.f50807c = dpVar;
        this.f50805a = objArr;
        this.f50806b = i2;
    }
}
