package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class cj<T> extends cm<T> {

    /* renamed from: a  reason: collision with root package name */
    static final cj<Object> f50745a = new cj<>();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.measurement.cm
    public final boolean zza() {
        return false;
    }

    private cj() {
    }

    @Override // com.google.android.gms.internal.measurement.cm
    public final T zzb() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    static {
        Covode.recordClassIndex(31703);
    }
}
