package com.bytedance.lottie;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class n<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f40815a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f40816b;

    static {
        Covode.recordClassIndex(25019);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40815a, this.f40816b});
    }

    public n(V v) {
        this.f40815a = v;
    }

    public n(Throwable th) {
        this.f40816b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        V v = this.f40815a;
        if (v != null && v.equals(nVar.f40815a)) {
            return true;
        }
        Throwable th = this.f40816b;
        if (th == null || nVar.f40816b == null) {
            return false;
        }
        return th.toString().equals(this.f40816b.toString());
    }
}
