package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class am<A, B, C> {

    /* renamed from: a  reason: collision with root package name */
    public final A f39387a;

    /* renamed from: b  reason: collision with root package name */
    public final B f39388b;

    /* renamed from: c  reason: collision with root package name */
    public final C f39389c;

    static {
        Covode.recordClassIndex(24168);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return l.a(this.f39387a, amVar.f39387a) && l.a(this.f39388b, amVar.f39388b) && l.a(this.f39389c, amVar.f39389c);
    }

    public final int hashCode() {
        A a2 = this.f39387a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f39388b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.f39389c;
        if (c2 != null) {
            i2 = c2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Tuple3(a=" + ((Object) this.f39387a) + ", b=" + ((Object) this.f39388b) + ", c=" + ((Object) this.f39389c) + ")";
    }

    public am(A a2, B b2, C c2) {
        this.f39387a = a2;
        this.f39388b = b2;
        this.f39389c = c2;
    }
}
