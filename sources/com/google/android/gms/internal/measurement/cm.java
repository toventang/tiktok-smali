package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public abstract class cm<T> implements Serializable {
    static {
        Covode.recordClassIndex(31706);
    }

    public abstract boolean zza();

    public abstract T zzb();

    cm() {
    }

    public static <T> cm<T> zzc() {
        return cj.f50745a;
    }

    public static <T> cm<T> zza(T t) {
        return new co(cl.a(t));
    }
}
