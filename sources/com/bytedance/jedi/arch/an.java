package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class an<A, B, C, D> {

    /* renamed from: a  reason: collision with root package name */
    public final A f39390a;

    /* renamed from: b  reason: collision with root package name */
    public final B f39391b;

    /* renamed from: c  reason: collision with root package name */
    public final C f39392c;

    /* renamed from: d  reason: collision with root package name */
    public final D f39393d;

    static {
        Covode.recordClassIndex(24169);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        return l.a(this.f39390a, anVar.f39390a) && l.a(this.f39391b, anVar.f39391b) && l.a(this.f39392c, anVar.f39392c) && l.a(this.f39393d, anVar.f39393d);
    }

    public final int hashCode() {
        A a2 = this.f39390a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f39391b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.f39392c;
        int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
        D d2 = this.f39393d;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "Tuple4(a=" + ((Object) this.f39390a) + ", b=" + ((Object) this.f39391b) + ", c=" + ((Object) this.f39392c) + ", d=" + ((Object) this.f39393d) + ")";
    }

    public an(A a2, B b2, C c2, D d2) {
        this.f39390a = a2;
        this.f39391b = b2;
        this.f39392c = c2;
        this.f39393d = d2;
    }
}
