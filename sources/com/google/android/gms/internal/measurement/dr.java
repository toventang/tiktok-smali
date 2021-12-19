package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class dr<K, V> extends cy<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final transient dp<K, ? extends dm<V>> f50788a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f50789b;

    static {
        Covode.recordClassIndex(31738);
    }

    @Override // com.google.android.gms.internal.measurement.cv, com.google.android.gms.internal.measurement.dy
    public final /* synthetic */ Map zza() {
        return this.f50788a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.cv
    public final Map<K, Collection<V>> a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.measurement.cv
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.cv
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.android.gms.internal.measurement.cv
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.cv
    public final boolean zza(Object obj) {
        if (obj == null || !super.zza(obj)) {
            return false;
        }
        return true;
    }

    dr(dp<K, ? extends dm<V>> dpVar, int i2) {
        this.f50788a = dpVar;
        this.f50789b = i2;
    }
}
