package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p<A> {

    /* renamed from: a  reason: collision with root package name */
    public final A f25659a;

    static {
        Covode.recordClassIndex(14929);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof p) && l.a(this.f25659a, ((p) obj).f25659a);
        }
        return true;
    }

    public final int hashCode() {
        A a2 = this.f25659a;
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Tuple1(a=" + ((Object) this.f25659a) + ")";
    }

    public p(A a2) {
        this.f25659a = a2;
    }
}
