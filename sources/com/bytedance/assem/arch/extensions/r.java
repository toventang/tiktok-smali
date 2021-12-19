package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r<A, B, C> {

    /* renamed from: a  reason: collision with root package name */
    public final A f25662a;

    /* renamed from: b  reason: collision with root package name */
    public final B f25663b;

    /* renamed from: c  reason: collision with root package name */
    public final C f25664c;

    static {
        Covode.recordClassIndex(14931);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l.a(this.f25662a, rVar.f25662a) && l.a(this.f25663b, rVar.f25663b) && l.a(this.f25664c, rVar.f25664c);
    }

    public final int hashCode() {
        A a2 = this.f25662a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f25663b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.f25664c;
        if (c2 != null) {
            i2 = c2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Tuple3(a=" + ((Object) this.f25662a) + ", b=" + ((Object) this.f25663b) + ", c=" + ((Object) this.f25664c) + ")";
    }

    public r(A a2, B b2, C c2) {
        this.f25662a = a2;
        this.f25663b = b2;
        this.f25664c = c2;
    }
}
