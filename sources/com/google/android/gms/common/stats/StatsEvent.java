package com.google.android.gms.common.stats;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    static {
        Covode.recordClassIndex(31449);
    }

    public abstract long a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public String toString() {
        long a2 = a();
        int b2 = b();
        long c2 = c();
        String d2 = d();
        return new StringBuilder(String.valueOf(d2).length() + 53).append(a2).append("\t").append(b2).append("\t").append(c2).append(d2).toString();
    }
}
