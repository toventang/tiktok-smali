package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class q<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final A f25660a;

    /* renamed from: b  reason: collision with root package name */
    public final B f25661b;

    static {
        Covode.recordClassIndex(14930);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f25660a, qVar.f25660a) && l.a(this.f25661b, qVar.f25661b);
    }

    public final int hashCode() {
        A a2 = this.f25660a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f25661b;
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Tuple2(a=" + ((Object) this.f25660a) + ", b=" + ((Object) this.f25661b) + ")";
    }

    public q(A a2, B b2) {
        this.f25660a = a2;
        this.f25661b = b2;
    }
}
