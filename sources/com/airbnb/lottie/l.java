package com.airbnb.lottie;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class l<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f5748a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f5749b;

    static {
        Covode.recordClassIndex(2402);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5748a, this.f5749b});
    }

    public l(V v) {
        this.f5748a = v;
    }

    public l(Throwable th) {
        this.f5749b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        V v = this.f5748a;
        if (v != null && v.equals(lVar.f5748a)) {
            return true;
        }
        Throwable th = this.f5749b;
        if (th == null || lVar.f5749b == null) {
            return false;
        }
        return th.toString().equals(this.f5749b.toString());
    }
}
