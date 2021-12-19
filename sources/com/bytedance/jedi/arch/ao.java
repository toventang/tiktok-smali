package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ao<A, B, C, D, E> {

    /* renamed from: a  reason: collision with root package name */
    public final A f39394a;

    /* renamed from: b  reason: collision with root package name */
    public final B f39395b;

    /* renamed from: c  reason: collision with root package name */
    public final C f39396c;

    /* renamed from: d  reason: collision with root package name */
    public final D f39397d;

    /* renamed from: e  reason: collision with root package name */
    public final E f39398e;

    static {
        Covode.recordClassIndex(24170);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return l.a(this.f39394a, aoVar.f39394a) && l.a(this.f39395b, aoVar.f39395b) && l.a(this.f39396c, aoVar.f39396c) && l.a(this.f39397d, aoVar.f39397d) && l.a(this.f39398e, aoVar.f39398e);
    }

    public final int hashCode() {
        A a2 = this.f39394a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f39395b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.f39396c;
        int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
        D d2 = this.f39397d;
        int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
        E e2 = this.f39398e;
        if (e2 != null) {
            i2 = e2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "Tuple5(a=" + ((Object) this.f39394a) + ", b=" + ((Object) this.f39395b) + ", c=" + ((Object) this.f39396c) + ", d=" + ((Object) this.f39397d) + ", e=" + ((Object) this.f39398e) + ")";
    }

    public ao(A a2, B b2, C c2, D d2, E e2) {
        this.f39394a = a2;
        this.f39395b = b2;
        this.f39396c = c2;
        this.f39397d = d2;
        this.f39398e = e2;
    }
}
