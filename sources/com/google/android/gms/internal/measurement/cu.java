package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class cu<T> implements cq<T>, Serializable {
    private final T zza;

    static {
        Covode.recordClassIndex(31714);
    }

    @Override // com.google.android.gms.internal.measurement.cq
    public final T a() {
        return this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("Suppliers.ofInstance(").append(valueOf).append(")").toString();
    }

    cu(T t) {
        this.zza = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cu) {
            return ck.a(this.zza, ((cu) obj).zza);
        }
        return false;
    }
}
