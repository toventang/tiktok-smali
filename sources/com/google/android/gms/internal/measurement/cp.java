package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class cp {
    static {
        Covode.recordClassIndex(31709);
    }

    public static <T> cq<T> a(T t) {
        return new cu(t);
    }

    public static <T> cq<T> a(cq<T> cqVar) {
        if ((cqVar instanceof cr) || (cqVar instanceof cs)) {
            return cqVar;
        }
        if (cqVar instanceof Serializable) {
            return new cs(cqVar);
        }
        return new cr(cqVar);
    }
}
