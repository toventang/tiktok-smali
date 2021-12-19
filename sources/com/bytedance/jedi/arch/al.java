package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class al<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final A f39385a;

    /* renamed from: b  reason: collision with root package name */
    public final B f39386b;

    static {
        Covode.recordClassIndex(24167);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return l.a(this.f39385a, alVar.f39385a) && l.a(this.f39386b, alVar.f39386b);
    }

    public final int hashCode() {
        A a2 = this.f39385a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f39386b;
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Tuple2(a=" + ((Object) this.f39385a) + ", b=" + ((Object) this.f39386b) + ")";
    }

    public al(A a2, B b2) {
        this.f39385a = a2;
        this.f39386b = b2;
    }
}
