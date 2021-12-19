package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ak<A> {

    /* renamed from: a  reason: collision with root package name */
    public final A f39384a;

    static {
        Covode.recordClassIndex(24166);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ak) && l.a(this.f39384a, ((ak) obj).f39384a);
        }
        return true;
    }

    public final int hashCode() {
        A a2 = this.f39384a;
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Tuple1(a=" + ((Object) this.f39384a) + ")";
    }

    public ak(A a2) {
        this.f39384a = a2;
    }
}
