package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class co<T> extends cm<T> {
    private final T zza;

    static {
        Covode.recordClassIndex(31708);
    }

    @Override // com.google.android.gms.internal.measurement.cm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.cm
    public final T zzb() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append("Optional.of(").append(valueOf).append(")").toString();
    }

    co(T t) {
        this.zza = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof co) {
            return this.zza.equals(((co) obj).zza);
        }
        return false;
    }
}
