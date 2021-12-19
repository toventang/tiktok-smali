package com.bytedance.ies.foundation.base.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a<A> {

    /* renamed from: a  reason: collision with root package name */
    public final A f33886a;

    static {
        Covode.recordClassIndex(20126);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f33886a, ((a) obj).f33886a);
        }
        return true;
    }

    public final int hashCode() {
        A a2 = this.f33886a;
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Tuple1(a=" + ((Object) this.f33886a) + ")";
    }

    public a(A a2) {
        this.f33886a = a2;
    }
}
