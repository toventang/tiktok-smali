package com.bytedance.apm.q;

import com.bytedance.covode.number.Covode;

public final class l<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public F f25254a;

    /* renamed from: b  reason: collision with root package name */
    public S f25255b;

    static {
        Covode.recordClassIndex(14711);
    }

    public final int hashCode() {
        int hashCode;
        F f2 = this.f25254a;
        int i2 = 0;
        if (f2 == null) {
            hashCode = 0;
        } else {
            hashCode = f2.hashCode();
        }
        S s = this.f25255b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f25254a) + " " + ((Object) this.f25255b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!k.a(lVar.f25254a, this.f25254a) || !k.a(lVar.f25255b, this.f25255b)) {
            return false;
        }
        return true;
    }

    public l(F f2, S s) {
        this.f25254a = f2;
        this.f25255b = s;
    }
}
