package com.bytedance.ies.foundation.base.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final A f33887a;

    /* renamed from: b  reason: collision with root package name */
    public final B f33888b;

    static {
        Covode.recordClassIndex(20127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f33887a, bVar.f33887a) && l.a(this.f33888b, bVar.f33888b);
    }

    public final int hashCode() {
        A a2 = this.f33887a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f33888b;
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Tuple2(a=" + ((Object) this.f33887a) + ", b=" + ((Object) this.f33888b) + ")";
    }

    public b(A a2, B b2) {
        this.f33887a = a2;
        this.f33888b = b2;
    }
}
